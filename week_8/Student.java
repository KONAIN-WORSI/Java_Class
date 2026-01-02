package week_8;

/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    String name;
    int age;
    String course;
    double marks;
    
    public Student(String name, int age, String course, double marks) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }
    
    public Student(double marks, int age, String course, String name) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.course);
        System.out.println(this.marks);
    }
    
    public boolean isAdult() {
        return age >= 18;
    }
    
    public double updateMarks(double marks) {
        this.marks = marks;
        return marks;
    }
    
    public String toString() {
        return "Name: " + name + "Age: " + age + "Course: " + course + "Marks: " + marks;
    }
    
    public static void main(String[] args) {
        Student s = new Student("Konain", 20, "BIT", 90);
        Student d = new Student(29, 20, "BIT", "Sivha"); 
        
        s.displayInfo();
        System.out.println(s.isAdult());
        System.out.println(s.updateMarks(96));
        System.out.println(s.toString());
        
        d.displayInfo();
        System.out.println(d.isAdult());
        System.out.println(d.updateMarks(58));
        System.out.println(d.toString());
        
    }  
}