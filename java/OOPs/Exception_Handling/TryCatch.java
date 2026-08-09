public class TryCatch{
    public static void main(String[] args) {
        System.out.println("Hello");
        int a[]= new int[2];
        try{
            System.out.println(10/0);
            System.out.println(a[3]);
            String s = null;
            System.out.println(s.length());
        } 
        catch(RuntimeException e) {
            System.out.println(10/5);
        }
        System.out.println("World");
    }
}