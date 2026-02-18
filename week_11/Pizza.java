package week_11;


class Pizza extends FoodItem implements Deliverable
{
    Pizza(String name,double price, String resturant, String image){
        super(name, price, resturant, image);
    }
    
    public void prepare() {
        System.out.println("Name: " + name + "Price: " + price + "Resturant: " + resturant + "Image: " + image);
    }
    
    public double calculateDeliveryTime() {
        return 50;
    }
    
    public double getDeliveryCharge() {
        return 150;
    }
}