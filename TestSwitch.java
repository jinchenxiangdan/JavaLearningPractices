import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        short year;
        System.out.print("Enter the year: ");
        year = inputScan.nextShort();

        switch (year % 4) {
            case 0: // if year % 4 == 0
                System.out.println("Elect a President");
                System.out.println("Elect members of the US House");
                break;
            case 2:
                System.out.println("Elect members of the US House");
                break;

            default:
                System.out.println("No federal election");
                break;
        }
		}
}
