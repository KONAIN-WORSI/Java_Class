package week_6;

import java.util.Scanner;
/**
 * Write a description of class Districts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Districts
{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            String[] districts = {"Bhojpur","Dhankuta","Morang","Sunsari","Udayapur",
                "Saptari","Siraha","Dhanusha","Mahottari","Sarlahi",
                "Sindhuli","Ramechhap","Dolakha","Bhaktapur","Dhading",
                "Kathmandu","Kavrepalanchok","Lalitpur","Nuwakot","Rasuwa",
                "Sindhupalchok","Chitwan","Makwanpur","Baglung","Gorkha",
                "Kaski","Lamjung","Manang","Mustang","Myagdi",
                "Nawalpur","Parbat","Syangja","Tanahun","Arghakhanchi",
                "Gulmi","Kapilvastu","Palpa","Parasi","Rupandehi",
                "Dang","Pyuthan","Rolpa","Rukum East","Rukum West",
                "Salyan","Banke","Bardiya","Dolpa","Humla",
                "Jumla","Kalikot","Mugu","Dailekh","Jajarkot",
                "Surkhet","Kailali","Achham","Bajhang","Bajura",
                "Doti","Kanchanpur","Dadeldhura","Baitadi","Darchula"
            };
            
            for (int i = 0; i < districts.length; i++) {
                System.out.println((i + 1) + "." + districts[i]);
            }
            
            System.out.println("Enter the number of district to replace: ");
            int indexNumber = input.nextInt();
            input.nextLine(); 
            
            System.out.println("Enter the name to replace: ");
            String replacingName = input.nextLine();
            
            
            districts[indexNumber - 1] = replacingName;
            
            System.out.println("\nUpdated Districts:");
            for (int i = 0; i < districts.length; i++) {
                System.out.println((i + 1) + "." + districts[i]);
            }   
        
            

        
        
        
    }
}