class ResultScholarship {
    public static void main(String[] args) {

        int marks = 82;
        int attendance = 80;

        if (attendance < 75) {
            System.out.println("Result: Fail");
        }
        else if (marks < 40) {
            System.out.println("Result: Fail");
        }
        else {
            System.out.println("Result: Pass");

            if (marks >= 90)
                System.out.println("Scholarship: 100%");
            else if (marks >= 75)
                System.out.println("Scholarship: 50%");
            else if (marks >= 60)
                System.out.println("Scholarship: 25%");
            else
                System.out.println("Scholarship: No scholarship");
        }
    }
}