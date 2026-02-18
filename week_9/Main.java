package week_9;

// Task 1: Base class Person
class Person {
    protected String name;
    protected int age;
    protected String address;
    
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
    public boolean isAdult() {
        return age >= 18;
    }
    
    public String getName() {
        return name;
    }
}

// Task 2: Student class inheriting from Person
class Student extends Person {
    private String studentId;
    private String course;
    private double gpa;
    
    public Student(String name, int age, String address, String studentId, String course, double gpa) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
        this.gpa = gpa;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("\n=== Student Information ===");
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("GPA: " + gpa);
        System.out.println("Honors Student: " + (calculateHonors() ? "Yes" : "No"));
    }
    
    public boolean calculateHonors() {
        return gpa > 3.5;
    }
}

// Task 3: Teacher class inheriting from Person
class Teacher extends Person {
    private String employeeId;
    private String subject;
    private double salary;
    private int yearStarted;
    
    public Teacher(String name, int age, String address, String employeeId, String subject, double salary, int yearStarted) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.subject = subject;
        this.salary = salary;
        this.yearStarted = yearStarted;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("\n=== Teacher Information ===");
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("Years of Service: " + calculateYearsOfService());
    }
    
    public int calculateYearsOfService() {
        int currentYear = 2026;
        return currentYear - yearStarted;
    }
}

// Task 4: Demonstrate polymorphism
public class Main {
    public static void main(String[] args) {
        // Create array of Person objects (polymorphism)
        Person[] people = new Person[5];
        
        // Add different types of objects to the array
        people[0] = new Student("Alice Johnson", 20, "123 College Ave", "S001", "Computer Science", 3.8);
        people[1] = new Teacher("Dr. Robert Smith", 45, "456 Faculty Rd", "T001", "Mathematics", 75000.00, 2010);
        people[2] = new Student("Bob Williams", 19, "789 Campus Dr", "S002", "Engineering", 3.2);
        people[3] = new Teacher("Ms. Emily Davis", 38, "321 School St", "T002", "Physics", 68000.00, 2015);
        people[4] = new Person("John Doe", 30, "555 Main St");
        
        // Display all information using polymorphism
        System.out.println("======================================");
        System.out.println("POLYMORPHISM DEMONSTRATION");
        System.out.println("======================================");
        
        for (Person person : people) {
            person.displayInfo();
            System.out.println("Is Adult: " + (person.isAdult() ? "Yes" : "No"));
            
            // Demonstrate runtime polymorphism
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("Type: Student");
                System.out.println("Special Info: " + (student.calculateHonors() ? "Honors Student!" : "Regular Student"));
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                System.out.println("Type: Teacher");
                System.out.println("Special Info: " + teacher.calculateYearsOfService() + " years of dedicated service");
            } else {
                System.out.println("Type: Person");
            }
            
            System.out.println("--------------------------------------");
        }
        
        // Additional demonstration: Method overriding
        System.out.println("\n======================================");
        System.out.println("METHOD OVERRIDING DEMONSTRATION");
        System.out.println("======================================");
        System.out.println("All objects call displayInfo(), but each class has its own implementation:\n");
        
        for (Person person : people) {
            System.out.println("Calling displayInfo() on: " + person.getName());
            person.displayInfo();
        }
    }
}
