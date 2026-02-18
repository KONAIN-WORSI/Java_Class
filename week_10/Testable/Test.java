package week_10.Testable;
import week_10.Encapsulation.ATM;
import java.util.Scanner;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args) {
        ATM a = new ATM();
        Scanner input = new Scanner(System.in);
        

        int count = 0;
        while(count <= 5) {
            int pin = input.nextInt();
            if(a.getPIN() == pin) {
                a.withDraw(pin,200);
                break;
            }else {
                System.out.println("Wrong pin!");
                count++;
            }
        }
        
        
    }
}