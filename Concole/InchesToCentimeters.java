
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InchesToCentimeters {
    public static void main(String [] args) throws IOException {
        System.out.println("This program converts feet and inches to centimeters.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of feet: ");
        String f1 = br.readLine();
        System.out.print("Enter number of inches: ");
        String i2 = br.readLine();                
        try {
            int feet = Integer.parseInt(f1);
            int inches = Integer.parseInt(i2);            
            double total = (feet * 12 + inches) * 2.54;
            
            System.out.println(f1+"ft " + i2 + "in = " + total);
        }catch(NumberFormatException nfe){
            System.out.println("Error");
        }                        
    }
}
        




 



