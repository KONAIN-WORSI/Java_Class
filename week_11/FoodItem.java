package week_11;

abstract class FoodItem{
     String name;
     double price;
     String resturant;
     String image;
     
     FoodItem(String name, double price, String resturant, String image) {
         this.name = name;
         this.price = price;
         this.resturant = resturant;
         this.image = image;
     }
     
     public void display() {
         System.out.println("Name: " + name + "Price: " + price);
     }
     
     public abstract void prepare();
}
