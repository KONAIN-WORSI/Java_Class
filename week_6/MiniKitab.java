package week_6;


/**
 * Write a description of class MiniKitab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniKitab
{
    public static void main(String[] args) {
        String[] categories = {"Fiction", "Nepali"};
        
        String[][] titles = {{"Harry Potter"} ,{"Ashamati - 5"}};
        
        double[][] prices = {{550.0}, {750.0}};
        
        System.out.println("Category\tTitles\t\t\tPrice");
        
        double total = 0;
        
        for (int i = 0; i < categories.length; i++) {
            System.out.printf("%s\t\t%s\t\t%.2f%n",
                              categories[i],
                              titles[i][0],
                              prices[i][0]);
            total += prices[i][0];
        }

        System.out.printf("%nYour total price: %.2f%n", total);

        
        
        
        
        
        
        
        
    }
}