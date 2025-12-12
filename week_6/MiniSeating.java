package week_6;


/**
 * Write a description of class MiniSeating here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniSeating
{
    public static void main(String[] args) {
        String[][] seats = { 
                    {"konain", "sonu", "himesh"},
                    {"empty", "empty", "empty"}
        };
        
        for (int i = 0; i < seats[1].length; i++) {
            System.out.println(seats[1][i]);
        }
       
    }
}