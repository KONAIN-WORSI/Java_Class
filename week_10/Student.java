package week_10;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private int age;
    private double gpa;
    
    public String getName() {
     return this.name;   
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge(int age) {
     return this.age;   
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getGPA(double gpa) {
     return this.gpa;   
    }
    
    public void setGPA(double gpa) {
        if(gpa <= 4.0 && gpa >= 0.0) {
            this.gpa = gpa;
        }
    }
}