package week_7;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    public String name;
    public int StudentId;
    public int age;
    public String course;
    
    public Student() {
        this.name = "konain";
        this.StudentId = 89;
        this.age = 19;
        this.course = "python";
    }
    
    public void DisplayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + StudentId);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.name = "Aanam";
        s1.StudentId = 69;
        s1.age = 18;
        s1.course = "Java";
        
        s2.name = "Saba";
        s2.StudentId = 420;
        s2.age = 16;
        s2.course = "Type Script";
        
        System.out.println("\nStudent Information: ");
        s1.DisplayInfo();
        s2.DisplayInfo();
        s3.DisplayInfo();
        
        
    }
}