/**
 *
 * @author mariam.swanu
 */
public class FoodLand {
    public static void main(String[] args) {
        Donut donut1 = new Donut("Donut 1");
        Donut donut2 = new Donut("Donut 2");
        Donut donut3 = new Donut("Donut 3");
        
        Salad salad1 = new Salad("Salad 1");
        Salad salad2 = new Salad("Salad 2");
        Salad salad3 = new Salad("Salad 3");
        
        Pasta pasta1 = new Pasta("Pasta 1");
        Pasta pasta2 = new Pasta("Pasta 2");
        Pasta pasta3 = new Pasta("Pasta 3");
        
        Meat meat1 = new Meat("Meat 1");
        Meat meat2 = new Meat("Meat 2");
        Meat meat3 = new Meat("Meat 3");
        
        System.out.println("There are currntly " + donut1.percRemaining() + "% from " + donut1.getName());
        System.out.println("There are currntly " + donut2.percRemaining() + "% from " + donut2.getName());
        System.out.println("There are currntly " + donut3.percRemaining() + "% from " + donut3.getName());
        System.out.println("There are currntly " + salad1.percRemaining() + "% from " + salad1.getName());
        System.out.println("There are currntly " + salad2.percRemaining() + "% from " + salad2.getName());
        System.out.println("There are currntly " + salad3.percRemaining() + "% from " + salad3.getName());
        System.out.println("There are currntly " + pasta1.percRemaining() + "% from " + pasta1.getName());
        System.out.println("There are currntly " + pasta2.percRemaining() + "% from " + pasta2.getName());
        System.out.println("There are currntly " + pasta3.percRemaining() + "% from " + pasta3.getName());
        System.out.println("There are currntly " + meat1.percRemaining() + "% from " + meat1.getName());
        System.out.println("There are currntly " + meat2.percRemaining() + "% from " + meat2.getName());
        System.out.println("There are currntly " + meat3.percRemaining() + "% from " + meat3.getName());
        
        System.out.println("\n\nWe are now going to eat");
        
        donut1.simulateEating(26);
        donut1.simulateEating(37);
        donut1.simulateEating(19);
        donut1.simulateEating(28);
        donut1.simulateEating(38);
        pasta2.simulateEating(31);
        meat3.simulateEating(17);
        salad2.simulateEating(49);
        meat1.simulateEating(111);
        
        System.out.println("\n\nOK, that was really delicious, we are full\n\n");
        System.out.println("There are currntly " + donut1.percRemaining() + "% from " + donut1.getName());
        System.out.println("There are currntly " + donut2.percRemaining() + "% from " + donut2.getName());
        System.out.println("There are currntly " + donut3.percRemaining() + "% from " + donut3.getName());
        System.out.println("There are currntly " + salad1.percRemaining() + "% from " + salad1.getName());
        System.out.println("There are currntly " + salad2.percRemaining() + "% from " + salad2.getName());
        System.out.println("There are currntly " + salad3.percRemaining() + "% from " + salad3.getName());
        System.out.println("There are currntly " + pasta1.percRemaining() + "% from " + pasta1.getName());
        System.out.println("There are currntly " + pasta2.percRemaining() + "% from " + pasta2.getName());
        System.out.println("There are currntly " + pasta3.percRemaining() + "% from " + pasta3.getName());
        System.out.println("There are currntly " + meat1.percRemaining() + "% from " + meat1.getName());
        System.out.println("There are currntly " + meat2.percRemaining() + "% from " + meat2.getName());
        System.out.println("There are currntly " + meat3.percRemaining() + "% from " + meat3.getName());
    }
}
