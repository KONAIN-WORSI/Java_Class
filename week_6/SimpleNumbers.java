package week_6;

import java.util.Scanner;
/**
 * Write a description of class SimpleNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleNumbers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {11, 20, 30, 40, 50};
        
        double sum = 0;
        double average = 0;
        
        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }
        
        System.out.println(sum);
        average = sum / numbers.length;
        System.out.println(average);
        
        int min = numbers[0];
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            
        }
        System.out.println(max);
        System.out.println(min);
        
        String[] subject = {"Maths", "Computer", "Hardware", "Biology", "FOC"};
        
        for(int i = 1; i < numbers.length; ++i) {
            System.out.println(subject[i] + "Score: ");
            System.out.println(numbers[i]);
        }
        
        
    }
}