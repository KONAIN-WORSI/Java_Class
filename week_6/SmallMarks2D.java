package week_6;


/**
 * Write a description of class SmallMarks2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SmallMarks2D
{
    public static void main(String[]  args) {
        int[] [] marks = { 
            {67, 58},
            {98, 87}
        };
        
        String[] subject = {"Nepali" , "English"};
        
        System.out.println("Student" + "\t" + subject[0] + "\t" + subject[1] + "\t" +"Total");
        
        for (int i = 0; i < marks.length; i++) {
            int totalMarks = 0;
            System.out.print("Student" + (i +1) + "\t");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
                totalMarks += marks[i][j];
            }
            System.out.println(totalMarks);
        }
    }
}