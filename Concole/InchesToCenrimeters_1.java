import java.util.Scanner;

public class InchesToCentimeters_1 {
    public static void main(String [] args) {
        Scanner scanInput;
        scanInput = new Scanner(System.in);        
        System.out.println("This program converts feet and inches to centimeters.");
        System.out.print("Enter number of feet: ");
        String feet_1 = scanInput.next();
        int feet = Integer.parseInt(feet_1);
        System.out.print("Enter number of inches: ");
        String inches_1 = scanInput.next();
        int inches = Integer.parseInt(inches_1);
        double total = (feet * 12 + inches) * 2.54;
        System.out.println(feet+"ft "+inches+ "in = "+ total + "cm");
            
    }
}