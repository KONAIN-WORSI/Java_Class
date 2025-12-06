package Week_5;


/**
 * Write a description of class LoopPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopPractice
{
    public static void main(String[] args) {
        // int age = 100;
        /*
        for (int i = 0; i <= 18; i++) {
            System.out.println(i);
        }
        */
        /*
        while (true) {
            age++;
            if (age >= 80) {
                System.out.println(age);
                System.out.println("You are 80 years old!");
                break;
            }
        }
        */
        
        /*
        do {
            if (age >= 18) {
                System.out.println("You are an adult!");
            }
            age++;
        }while (age <= 20);
        */
        /*
        for (int i = 0; i <= 100; i++) {
            System.out.println("I Love You!" + i);
            //System.out.println(age);
        }
        */
         /*
        int i = 0;
        while ( i<= 100) {
            System.out.println("I Love You!" + i);
            i++;
        }
        */
        
        /*
        do {
            System.out.println("I Love You!" + i);
            i--;
        } while ( i >= 0);
        */
        
        /*
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while (i != 0);
        */
       
        for (int i = 0; i <= 5; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Number" + i);
        }
        
        
        String[] menu = {"rice", "veg", "pani", "roti"};
        
        for (int i = 0; i <= 5; i++) {
            System.out.println("Menu Item" + menu);
        }
        
        
    }
}