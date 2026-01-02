package week_9;


/**
 * Write a description of class Inheritance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Teacher {
    String name;
    int age;
    public void teaching(){
        System.out.println("The teacher is teaching there.. ");
    }
    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Teacher{
    public void study() {
        System.out.println("The student is studying here.. ");
    }
    Student(String name, int age) {
        super(name, age);
    }
}

class Person extends Student{
    Person(String name, int age) {
        super(name, age);
    }
    @Override
    public void teaching() {
        super.teaching();
        System.out.println("The teacher is teaching here.. ");
    }
    
}

public class Inheritance
{
    public static void main(String[] args) {
        Person p = new Person("Konain", 20);
        
        p.teaching();
        p.study();
        System.out.println();
    
    
    
        
        
    }
}
