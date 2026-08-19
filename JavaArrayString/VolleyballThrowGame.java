import java.util.*;

public class VolleyballThrowGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("***** Volleyball Net Throw Game *****");
        System.out.println("Objective: clear the net and land inside the target zone (4m-8m).\n");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Single-player");
            System.out.println("2) Power-up mode");
            System.out.println("3) Two-player");
            System.out.println("4) Exit");

            int choice = readInt(scanner, "Choose option (1-4): ", 1, 4);

            if (choice == 1) {
                int score = playGame(scanner, random, "Player", false);
                System.out.println("Single-player final score: " + score + "/50\n");
            } else if (choice == 2) {
                int score = playGame(scanner, random, "Player", true);
                System.out.println("Power-up final score: " + score + "/50\n");
            } else if (choice == 3) {
                int score1 = playGame(scanner, random, "Player 1", false);
                int score2 = playGame(scanner, random, "Player 2", false);
                System.out.println("Result: Player 1 " + score1 + " vs Player 2 " + score2);
                if (score1 > score2) {
                    System.out.println("Player 1 wins!\n");
                } else if (score2 > score1) {
                    System.out.println("Player 2 wins!\n");
                } else {
                    System.out.println("It's a tie!\n");
                }
            } else {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }

        scanner.close();
    }

    private static int playGame(Scanner scanner, Random random, String playerName, boolean powerUpMode) {
        System.out.println("== " + playerName + " starts ==");

        int score = 0;
        int rounds = 5;
        int remainingPowerUps = powerUpMode ? 2 : 0;

        for (int round = 1; round <= rounds; round++) {
            int level = round;
            double netHeight = 3.0 + (level - 1) * 0.25;
            double netDistance = 6.0 + (level - 1) * 0.5;
            double targetMin = 4.0 + (level - 1) * 0.2;
            double targetMax = 8.0 - (level - 1) * 0.2;
            final double g = 9.8;

            int wind = random.nextInt(11) - 5; // -5..5

            animate("Level " + level + " preparing...");
            System.out.println("Round " + round + " of " + rounds + " (" + playerName + ")");
            System.out.println("Current score: " + score);
            System.out.println("Net height: " + String.format("%.2f", netHeight) + " m, target zone " + String.format("[%.2f..%.2f]", targetMin, targetMax));
            System.out.println("Wind: " + (wind >= 0 ? "+" : "") + wind + " (affects distance)");
            if (powerUpMode) {
                System.out.println("Power-ups available: " + remainingPowerUps);
            }

            int power = readInt(scanner, "Choose power (1-10): ", 1, 10);
            int angle = readInt(scanner, "Choose angle (10-80): ", 10, 80);

            if (powerUpMode && remainingPowerUps > 0) {
                System.out.print("Use a power-up for +2 power? (y/n): ");
                String ans = scanner.nextLine().trim().toLowerCase();
                if (ans.equals("y") || ans.equals("yes")) {
                    power = Math.min(12, power + 2);
                    remainingPowerUps--;
                    System.out.println("Power-up activated! Power now " + power + ".");
                    beep();
                }
            }

            Class<? extends Object> cls = Object.class; // to think no effect; placeholder
            animate("Throwing...");

            double rad = Math.toRadians(angle);
            double v0 = power * 3.2;

            double tNet = netDistance / (v0 * Math.cos(rad));
            double yAtNet = v0 * Math.sin(rad) * tNet - 0.5 * g * tNet * tNet;
            double tFlight = (2 * v0 * Math.sin(rad)) / g;
            double xRange = v0 * Math.cos(rad) * tFlight + wind * 0.4;

            boolean clearedNet = yAtNet > netHeight;
            boolean landedCourt = xRange >= targetMin && xRange <= targetMax;

            System.out.printf("Height at net: %.2f m, landing: %.2f m\n", yAtNet, xRange);

            if (!clearedNet) {
                System.out.println(" ➜ Net! No points.");
                beep();
            } else if (!landedCourt) {
                if (xRange < targetMin) {
                    System.out.println(" ➜ Short. No points.");
                } else {
                    System.out.println(" ➜ Long. No points.");
                }
                beep();
            } else {
                score += 10;
                System.out.println(" ➜ Excellent! +10 points.");
                beep();
            }

            if (clearedNet && landedCourt) {
                score += 5;
                System.out.println(" ➜ Bonus: perfect hit! +5 bonus.");
                beep();
            }

            if (score >= level * 12) {
                System.out.println("Great job: Level " + level + " complete! Moving to next level.\n");
            } else {
                System.out.println("Keep pushing! Level " + level + " progress remains.\n");
            }

            System.out.println();
        }

        System.out.println(playerName + " finished with " + score + " points.\n");
        return score;
    }

    private static void animate(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(35);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    private static void beep() {
        System.out.print("\u0007");
        System.out.flush();
    }

    private static int readInt(Scanner scanner, String message, int min, int max) {
        while (true) {
            System.out.print(message);
            if (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Invalid value. Enter an integer.");
                continue;
            }
            int value = scanner.nextInt();
            scanner.nextLine();
            if (value < min || value > max) {
                System.out.println("Please enter a number between " + min + " and " + max + ".");
                continue;
            }
            return value;
        }
    }
}
