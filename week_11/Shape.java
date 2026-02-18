package week_11;


/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
abstract class Shape
{
    abstract public int calculateArea();
    abstract public int calculatePerimeter();
    
    public void displayInfo() {
        System.out.println();
    }
}
