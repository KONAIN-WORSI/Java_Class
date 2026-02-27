package week_11;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
{
    public int calculateArea(int l, int b) {
        return l * b;
    }
    
    public int calculatePerimeter(int l, int b) {
        return 2 * (l + b);
    }

    public void main(String[] args) {
        Rectangle r = new Rectangle();
        int area = r.calculateArea(5, 3);
        int perimeter = r.calculatePerimeter(5, 3);
        
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}