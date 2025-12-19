package week_7;


/**
 * Write a description of class KhanaGharMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

class MenuItem {
    public String itemName;
    public String category;
    public int price;
    public boolean isVegeterian;
    public boolean isAvailable;
    
    public MenuItem(String itemName, String category, int price, boolean isVegeterian, boolean isAvailable) {
        this.itemName = itemName;
        this.category = category;
        this.price = price;
        this.isVegeterian = isVegeterian;
        this.isAvailable = isAvailable;
    }
    
    public void DisplayMenu() {
        String vegLabel = isVegeterian ? "[VEG]" : "[NON-VEG]";
        String availableLabel = isAvailable ? "[✔]":"[❌]";
        System.out.println(itemName + "\t" + category + "\t" + price + "\t" + vegLabel + "\t" + availableLabel);
    }
}

public class KhanaGharMenu
{
    public static void main(String[] args) {
        MenuItem m1 =new MenuItem("Dal-Bhat set", "Khana", 200, true, false);
        MenuItem m2 =new MenuItem("Momo", "Snacks", 120, false, true);
        MenuItem m3 =new MenuItem("Non-Veg set", "khana", 300, false, true);
        MenuItem m4 =new MenuItem("Masala Chiya", "Snacks", 50, true, false);
        MenuItem m5 =new MenuItem("Sekuwa set", "Snacks", 400, false, true);
        MenuItem m6 =new MenuItem("Dharane Kali Bangur", "Snacks", 400, false, true);
        
        System.out.println("Item \t Category \t Price \t Veg/Non-veg \t Available");
        m1.DisplayMenu();
        m2.DisplayMenu();
        m3.DisplayMenu();
        m4.DisplayMenu();
        m5.DisplayMenu();
        m6.DisplayMenu();
        
        
        
        
    } 
}