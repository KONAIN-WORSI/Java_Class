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
}