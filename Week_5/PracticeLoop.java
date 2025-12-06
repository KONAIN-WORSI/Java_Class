package Week_5;

public class PracticeLoop {
    public static void main(String[] args) {
        // for(int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }   Output:
            // 1
            // 12
            // 123
            // 1234
            // 12345



        // for (int i = 5; i >= 1; i--) {           Output:
        //     for (int j = i; j >= 1; j--) {       54321
        //         System.out.print(j);              4321
        //     }                                      321  
        //     System.out.println();                   21  
        // }                          1                 1


        for (int i = 1; i<=5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
