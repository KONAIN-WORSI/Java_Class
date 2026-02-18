package week_10.Encapsulation;


/**
 * Write a description of class ATM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATM
{
    private int PIN = 1597;
    private int Balance = 10000;
    
    // setter method for PIN
    public void setPIN(int PIN) {
          this.PIN = PIN;  
    }
    
    // getter method for PIN
    public int getPIN() {
        return this.PIN;
    }
    
    // setter method for balance
    public void setBalance(int Balance) {
          this.Balance = Balance;  
    }
    
    // getter method for balance
    public int getBalance() {
        return this.Balance;
    }
    
    public int deposit(int money) {
        if(money < 0) {
            System.out.println("Please enter positive number");
        }
        return this.Balance += money;
    }
    
    public void withDraw(int pin, int money) {
           if(pin == this.PIN) {
            if(money >= 0) {
                if(money < this.Balance) {
                    this.Balance -= money;
                }else{
                    System.out.println("You do not have sufficient balance");
                }
            }else {
                System.out.println("Please enter positive number");
            }
            }else {
                System.out.println("Your pin does not match!");
            }
            
        
    }
}