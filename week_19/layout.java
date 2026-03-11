import java.awt.Color;

import javax.swing.*;

public class layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(30, 30, 440, 400);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        panel.setLayout(null);
        frame.add(panel);

        JLabel idLabel = new JLabel();
        idLabel.setText("Student ID");
        idLabel.setBounds(50, 30, 100, 25);
        panel.add(idLabel);

        JTextField idField = new JTextField();
        idField.setBounds(150, 30, 200, 25);
        panel.add(idField);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Name");
        nameLabel.setBounds(50, 70, 100, 25);
        panel.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 70, 200, 25);
        panel.add(nameField);

        JLabel courseLabel = new JLabel();
        courseLabel.setText("Course");
        courseLabel.setBounds(50, 110, 100, 25);
        panel.add(courseLabel);

        String[] courses = {"BIT", "BBA", "BCA", "BHM", "BBS"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 110, 200, 25);
        panel.add(courseBox);

        JLabel genderLabel = new JLabel();
        genderLabel.setText("Gender");
        genderLabel.setBounds(50, 150, 130, 25);
        panel.add(genderLabel);

        JRadioButton genderButton1 = new JRadioButton();
        genderButton1.setText("Male");
        genderButton1.setBounds(150, 150, 60, 20);
        panel.add(genderButton1);

        JRadioButton genderButton2 = new JRadioButton();
        genderButton2.setText("Female");
        genderButton2.setBounds(220, 150, 80, 20);
        panel.add(genderButton2);

        JRadioButton genderButton3 = new JRadioButton();
        genderButton3.setText("Other");
        genderButton3.setBounds(310, 150, 60, 20);
        panel.add(genderButton3);

        ButtonGroup group = new ButtonGroup();
        group.add(genderButton1);
        group.add(genderButton2);       
        group.add(genderButton3);

        












        frame.setVisible(true); 
    }
}