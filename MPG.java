
import java.util.Scanner;


/**
 * 02/26/2018
 * @author mariam.swanu
 */
public class MPG {
    private static Scanner input;
    public static void main(String[] args) {
        final int mpg = 28;
		// Scanner object to collect data
        input = new Scanner(System.in);
        int miles;
        int gallons;
        int distance;
        System.out.print("How many gallon of gas do you have in the tank: ");
        gallons = input.nextInt();
        System.out.print("How far are you trying to go: ");
        miles = input.nextInt();
        // Calculate distance by multipying mpg by number of gallons
		distance = 28 * gallons;
        // Control if statement to determine the program execution path
        if (distance >= miles) {
            System.out.println("Yes you can make it!");
        } else {
            System.out.println("You can't make it!");
        }
    }
}
