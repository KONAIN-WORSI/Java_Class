package week_10;

import week_10.Student;
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accountNumber;
    private int balance = 1000;
    private String ownerName = "Konain";
    
    public int deposit(int money) {
         if(money < 0) {
             System.out.println("Please enter a positive number greater than 0");
         }
         return this.balance += money;  
    }
    
    public int withdraw(int money) {
         if(money < this.balance) {
             System.out.println("Money Withdrawn successfully!");
         }
         return this.balance -= money;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public static void main(String[] args) {
        Student a = new Student();
        
        
    }
}