package week_11;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        Pizza p1 =  new Pizza("Paneer Pizza", 500, "FoodMandu", "image of paneer pizza");
        
        p1.display();
        p1.prepare();
        System.out.println(p1.calculateDeliveryTime());
        System.out.println(p1.getDeliveryCharge());
        
    }
}