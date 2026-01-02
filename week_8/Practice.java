package week_8;

import java.util.Scanner;
/**
 * Write a description of class Practice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice
{
    public int age;
    public String name;
    public String className;
    public int marks;
    
    Scanner input = new Scanner(System.in);
    
    public Practice() {
        
    }
    
    public Practice(String name, int age, String className, int marks) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.marks = marks;
        
    }
    
    public int toDisplay(int a, int b) {
        int result = a + b;
        return result;
    }
    public String toString() {
        String names = input.nextLine();
        return names;
    }
    
    public static void main(String[] args) {
        //Practice m = new Practice(45, "Konain", "BIT", 90);
        Practice n = new Practice("Hello", 26, "BIT", 46);
        Practice out = new Practice();
        
        
        System.out.println(n);
        System.out.println(n.toString());
        //System.out.println(n.age + n.name + n.marks);
        System.out.println(out.toDisplay(54, 89));
    }
}