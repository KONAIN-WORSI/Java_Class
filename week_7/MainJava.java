package week_7;


/**
 * Write a description of class MainJava here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Person {
    public String name;
    public int  age;
    public String course;
    
    public Person(String name, int age , String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    public void DisplayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course + "\n");
    }
}

public class MainJava
{
    public static void main(String[] args) {
        Person p1 = new Person("konain", 19, "Python");
        Person p2 = new Person("Himesh", 25, "Java");
        Person p3 = new Person("Hitesh", 22, "C++");
        
        System.out.println("\nPersons Information: \n");
        p1.DisplayInfo();
        p2.DisplayInfo();
        p3.DisplayInfo();
        
    }
}