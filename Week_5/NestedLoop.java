package Week_5;


/**
 * Write a description of class NestedLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoop
{
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */
        
       /*
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        */
    for (int i = 5; i >= 1; i--) {
        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
    }
       
    }
}