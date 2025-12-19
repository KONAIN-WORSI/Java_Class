package week_7;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    public String title;
    public String author;
    public int ISBN;
    public int publicationYear;
    public String genre;
    public boolean availabilityStatus;
    
    public Book(String title, String author, int ISBN, int publicationYear, String genre,boolean availabilityStatus) {
        this.title =title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }
    
    public String toString() {
        return "Book Title: " + title + "\nBook Author: " + author + "\nISBN: " + ISBN + "\nPublicaion Year: " + publicationYear + 
        "\nGenre: " + genre + "\nAvailability Status: " + availabilityStatus;
    }
    
    public static void main(String[] args) {
        Book b1 = new Book("Rich Dad", "Robert Kiyosaki", 16597123, 1999, "Finance", false);
        Book b2 = new Book("Harry Porter", "Abhisekh", 165159121, 2001, "Fiction", true);
        Book b3 = new Book("Alchemist", "Konain", 165132497, 2025, "Self-improvement", true);
        
        b1.toString();
        b2.toString();
        b3.toString();
        
        if (b1.availabilityStatus == true) {
            System.out.println("Book " + b1.title + " Available: " + b1.availabilityStatus);
        }
        if(b2.availabilityStatus == true) {
             System.out.println("Book " + b2.title + " Available: " + b2.availabilityStatus);   
        }
        if(b3.availabilityStatus == true) {
            System.out.println("Book " + b3.title + " Available: " + b3.availabilityStatus);
        }

        if (b1.availabilityStatus == false) {
            System.out.println("Book " + b1.title + " Available: " + b1.availabilityStatus);
        }
        if(b2.availabilityStatus == false) {
            System.out.println("Book " + b2.title + " Available: " + b2.availabilityStatus);
        }
        if(b3.availabilityStatus == false) {
            System.out.println("Book " + b3.title + " Available: " + b3.availabilityStatus);
        }
        
        if (b1.publicationYear > 2000 && b1.availabilityStatus == true) {
            System.out.println(b1.title);
        }
        
         if (b2.publicationYear > 2000 && b2.availabilityStatus == true) {
            System.out.println(b2.title);
        }
        
         if (b3.publicationYear > 2000 && b3.availabilityStatus == true) {
            System.out.println(b3.title);
        }
        
    }
}