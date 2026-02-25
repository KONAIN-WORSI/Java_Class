package week_17;

import javax.swing.JFrame;
import javax.swing.*;
/**
 * Write a description of class StudentPreviewProfile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentPreviewProfile extends JFrame
{   
    String card = "<html><div style= `text-align:center;`>"
        + "<h2>Student Profile</h2>"
        + "<p>Name: Konain Worsi</p>"
        + "<p>ID: np05cp4a250138</p>"
        + "<p>Course: BSC(Hons) Computing</p>"
        + "</div> </html>";
    
    StudentPreviewProfile() {
        setTitle("Student Profile");
        setLayout(null);
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JLabel Label = new JLabel(card);
        Label.setBounds(20, 0, 500, 500);
        add(Label);
    }
    
    public static void main(String[] args) {
        StudentPreviewProfile obj = new StudentPreviewProfile();
        obj.setVisible(true);
    }
}