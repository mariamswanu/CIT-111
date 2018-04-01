
package week8miniproject;
import java.util.Scanner;
/**
 *
 * @author MARIAM
 */
public class Week8MiniProject {

    public static void main(String[] args) {
        System.out.println("enter a number of your choice to convert from"
                + "\n temperature, speed and weight");
      Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
       Temperature(choice);
       System.out.println();
    }// close a main method

    public static void Temperature(double celcius){
    Scanner scan=new Scanner(System.in);
        System.out.println("enter the number of degree to convert from celcius"
                + " to fahrenhient");
    double userCelcius=scan.nextDouble();
    double fahrenhient=(userCelcius-32)*0.56;
    System.out.println(userCelcius+"degree celcius is equal to"
            + fahrenhient+"fahrenhient");
   SpeedConversionMeter(0.0);
}// close temperature method
    public static void SpeedConversionMeter(double meter){
        Scanner scan=new Scanner(System.in);
        System.out.println("give me the details of kilometers you travel"
                + "today so that i can convert it into meter for you");
          double userKilometer=scan.nextInt();
        meter= userKilometer/0.001;
          System.out.println(userKilometer+"kilometer makes"
                  + meter+"meter");
          
    }// close speed method
    public static void weightConversionToKilogram(double pound){
         Scanner scan=new Scanner(System.in);
        System.out.println("enter a number,and i will help you to convert it to"
                + " gram kilogram");
        double userpound=scan.nextDouble();
        double Kilogram=userpound/2.21;
        System.out.println(userpound+"pound equal to"+Kilogram+"kilogram");
        
    }// close weight method
    
}// close main class

