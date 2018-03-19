import java.util.Scanner;

/**
 *
 * @author mariam.swanu
 */
public class PokeMisteryBoxes {
    static Scanner inputScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a choice:"
                + "\n\t1 - Add two numbers"
                + "\n\t2 - Find Square of a Number"
                + "\n\t3 - subract a number"
                + "\n\t --> ");
        int choice = inputScanner.nextInt();
        
        switch(choice) {
            case 1:
                add();
                break;
            case 2:
                square();
                break;
            case 3:
                subract();
                break;
            default:
                System.exit(0);
        }// cose switch statement
    }// close main method
    // the single job of this method is to add two given numbers
    public static void add() {
        int num1, num2, sum;
        System.out.print("Enter numbers to add:"
                + "\n\tNumber 1: ");
        num1 = inputScanner.nextInt();
        System.out.print("\tNumber 2: ");
        num2 = inputScanner.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }// close add method
    //  the single job of this method is to is to sqaure the value of a given 
     //number
    public static void square() {
        int num, square;
        System.out.print("Enter the number you want to square: ");
        num = inputScanner.nextInt();
        square = num * num;
        System.out.println("The saquare value is: " + square);
    }// close sqaure method
    //the single job of this method is to subrate two numbers 
    public static void subract() {
        double num1, num2, sum;
        System.out.print("Enter the first number: ");
        num1 = inputScanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = inputScanner.nextDouble();
        sum = num1 - num2;
        System.out.println("the answer is: " + sum);
    }// close void method
}// close class
