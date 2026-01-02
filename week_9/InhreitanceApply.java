package week_9;


/**
 * Write a description of class InhreitanceApply here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Calculation {
    public double add(int a, int b) {
        return a + b;
    }
    
    public double subtract(int a, int b) {
        return a - b;
    }
    
    public double multiply(int a, int b) {
        return a * b;
    }
}

class CalculationSecond extends Calculation{
    public double factorial(int n) {
        int result = 1;
        int i = 1;
        
        while (i <= n) {
            result = result * i;
            i = i + 1;
        }
        
        return result;
    }
}

class CalculationThird extends CalculationSecond{
    public double division(int a, int b) {
        return a / b;
    }
}

public class InhreitanceApply
{
    public static void main(String[] args) {
        CalculationThird n = new CalculationThird();
        
        System.out.println("Addition: " + n.add(3, 8));
        System.out.println("Subtraction: " + n.subtract(8, 6));
        System.out.println("Multiple: " + n.add(3, 8));
        System.out.println("Factorial: " + n.factorial(3));
        System.out.println("Division: " + n.division(8, 3));
    }
}