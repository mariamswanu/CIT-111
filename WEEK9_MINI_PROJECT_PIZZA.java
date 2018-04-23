package week9_mini_project_pizza;

/**
 *
 * @author mariam.swanu
 */
public class WEEK9_MINI_PROJECT_PIZZA {

    private static int totalPizzaOrder = 0;
    private static int totalHoagiesOrder = 0;
    private static int totalSaladsOrder = 0;
    

    public static void main(String[] args) {
        System.out.println("Total Pizza are " + totalPizzaOrder);
        System.out.println("Total Hoagies are " + totalHoagiesOrder);
        System.out.println("Total Salads are " + totalSaladsOrder);
        orderingPizza(5);
        System.out.println("\n----------------------\n");
        orderingSalads(10);
        System.out.println("\n----------------------\n");
        orderingHoaggies(6);
        System.out.println("\n----------------------\n");
        orderingPizza(5);
        System.out.println("\n----------------------\n");
        orderingPizza(10);
        System.out.println("\n----------------------\n");
        orderingHoaggies(6);
        System.out.println("\n----------------------\n");
        orderingPizza(5);
        System.out.println("\n----------------------\n");
        orderingPizza(10);
        System.out.println("\n----------------------\n");
        orderingHoaggies(6);
        System.out.println("\n----------------------\n");
        System.out.println("Order more!!\n\n\n");

        displayOrderTotals();

    }// END OF MAIN

    public static void orderingPizza(int numOrdered) {
        System.out.println("\t--> Ordering  "  + numOrdered + " pizzas.");
        totalPizzaOrder = totalPizzaOrder + numOrdered;
        System.out.println("The total number of pizzas ordered are: " + totalPizzaOrder);
    }//end method ordering method

    public static void orderingHoaggies(int numHogies) {
        System.out.println("\t--> Ordering  "  + numHogies + " hoagies.");
        totalHoagiesOrder = totalHoagiesOrder + numHogies;
        System.out.println("The total number of hoagies ordered are: " + totalHoagiesOrder);
    }//

    public static void orderingSalads(int numSalads) {
        System.out.println("\t--> Ordering  "  + numSalads + " salads.");
        totalSaladsOrder = totalSaladsOrder + numSalads;
        System.out.println("The total number of salads ordered are: " + totalSaladsOrder);
    }//

    public static void displayOrderTotals() {

    }//end of method

}// END OF THE CLASS 
