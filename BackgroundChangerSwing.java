import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundChangerSwing extends JFrame implements ActionListener {
    JTextField colorInput;
    JButton changeColorButton;

    public BackgroundChangerSwing() {
        // Create components
        JLabel label = new JLabel("OUTPUT BY Rohan(22112138): ");
        colorInput = new JTextField(20);
        changeColorButton = new JButton("Change Background");

        // Add components to the frame
        setLayout(new FlowLayout());
        add(label);
        add(colorInput);
        add(changeColorButton);

        // Set up event handling
        changeColorButton.addActionListener(this);

        // Frame settings
        setTitle("Background Changer");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String colorName = colorInput.getText().toLowerCase();

        // Change background color based on user input
        switch (colorName) {
            case "red":
                getContentPane().setBackground(Color.RED);
                break;
            case "green":
                getContentPane().setBackground(Color.GREEN);
                break;
            case "blue":
                getContentPane().setBackground(Color.BLUE);
                break;
            case "yellow":
                getContentPane().setBackground(Color.YELLOW);
                break;
            default:
                getContentPane().setBackground(Color.GRAY);
                break;
        }
    }

    public static void main(String[] args) {
        // Start the Swing application
        new BackgroundChangerSwing();
    }
}
