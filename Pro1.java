import java.util.Scanner;

public class Pro1 {
    public static void main(String [] args) {
        Scanner scanInput = new Scanner(System.in);
        String s1 = scanInput.next(); // readline?  
        String s2 = scanInput.next();
        String s3 = scanInput.next();
        System.out.println("1. " + s1 + "\n2. " + s2 + "\n3. " + s3);
        System.out.println(s1 + s2 + s3);
        System.out.println(s1.charAt(0) + " " + s2.charAt(0) + " " + s3.charAt(0));
    }
}