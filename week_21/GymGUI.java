package week_21;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class GymGUI {
    public static void main(String[] args) {

        ArrayList<Membership> list = new ArrayList<>();

        JFrame frame = new JFrame("Gym Membership Management System");
        frame.setSize(700, 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // name
        JLabel namLabele = new JLabel("Name:");
        namLabele.setBounds(50, 50, 200, 25);
        frame.add(namLabele);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 200, 25);
        frame.add(nameField);

        // fee
        JLabel feeLabel = new JLabel("Fee");
        feeLabel.setBounds(50, 100, 200, 25);
        frame.add(feeLabel);

        JTextField feeField = new JTextField();
        feeField.setBounds(150, 100, 200, 25);
        frame.add(feeField);

        // duration
        JLabel durationLabel = new JLabel("Duration");
        durationLabel.setBounds(50, 150, 200, 25);
        frame.add(durationLabel);

        JTextField durationField = new JTextField();
        durationField.setBounds(150, 150, 200, 25);
        frame.add(durationField);

        // Type
        JLabel TypeLabel = new JLabel("Type");
        TypeLabel.setBounds(50, 200, 200, 25);
        frame.add(TypeLabel);

        JTextField TypeField = new JTextField();
        TypeField.setBounds(150, 200, 200, 25);
        frame.add(TypeField);

        // sessions
        JLabel sessionsLabel = new JLabel("Sessions");
        sessionsLabel.setBounds(50, 250, 200, 25);
        frame.add(sessionsLabel);

        JTextField sessionsField = new JTextField();
        sessionsField.setBounds(150, 250, 200, 25);
        frame.add(sessionsField);

        // trainer slots
        JLabel trainerSlotsLabel = new JLabel("Trainer Slots");
        trainerSlotsLabel.setBounds(50, 300, 200, 25);
        frame.add(trainerSlotsLabel);

        JTextField trainerSlotsField = new JTextField();
        trainerSlotsField.setBounds(150, 300, 200, 25);
        frame.add(trainerSlotsField);

        JButton basicButton = new JButton("Add Basic");
        basicButton.setBounds(400, 100, 200, 25);
        frame.add(basicButton);

        JButton PremiumButton = new JButton("Add Premium");
        PremiumButton.setBounds(400, 150, 200, 25);
        frame.add(PremiumButton);

        JButton displayButton = new JButton("Display All");
        displayButton.setBounds(400, 200, 200, 25);
        frame.add(displayButton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(400, 250, 200, 25);
        frame.add(clearButton);

        JTextArea area = new JTextArea();
        JScrollPane pane = new JScrollPane(area);
        pane.setBounds(100, 350, 500, 250);
        frame.add(pane);

        // EVENT HANDLING

        // Add Basic
        basicButton.addActionListener(e -> {
            try {
                String name = nameField.getText();

                if (!name.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(frame, "Invalid name!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double fee = Double.parseDouble(feeField.getText());
                int duration = Integer.parseInt(durationField.getText());
                String type = TypeField.getText();
                int sessions = Integer.parseInt(sessionsField.getText());

                BasicMembership basic = new BasicMembership(name, fee, duration, type, sessions);
                list.add(basic);

                JOptionPane.showMessageDialog(frame,
                        "Basic Membership Added:\n" + basic.display());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Add Premium
        PremiumButton.addActionListener(e -> {
            try {
                String name = nameField.getText();

                if (!name.matches("[a-zA-Z ]+")) {
                    JOptionPane.showMessageDialog(frame, "Invalid name!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double fee = Double.parseDouble(feeField.getText());
                int duration = Integer.parseInt(durationField.getText());
                String type = TypeField.getText();
                int trainerSlots = Integer.parseInt(trainerSlotsField.getText());

                PremiumMembership premium = new PremiumMembership(name, fee, duration, type, trainerSlots);
                list.add(premium);

                JOptionPane.showMessageDialog(frame,
                        "Premium Membership Added:\n" + premium.display());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Display
        displayButton.addActionListener(e -> {
            area.setText("");

            if (list.isEmpty()) {
                area.setText("No memberships added.");
                return;
            }

            for (Membership m : list) {
                area.append(m.display() + "\n\n");
            }
        });

        // Clear
        clearButton.addActionListener(e -> {
            nameField.setText("");
            feeField.setText("");
            durationField.setText("");
            TypeField.setText("");
            sessionsField.setText("");
            trainerSlotsField.setText("");
            area.setText("");
        });

        // get mouse position
        frame.addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                area.append("Mouse Moved: " + e.getX() + ", " + e.getY() + "\n"); 
            }
        });

        frame.setVisible(true);
    }
}
