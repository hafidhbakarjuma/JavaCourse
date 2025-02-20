import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleApp {

    public static void main(String[] args) {
        // Create the main frame (window)
        JFrame frame = new JFrame("Simple Java App");
        frame.setSize(400, 200); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the app when the window is closed

        // Create a panel to hold components
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set the window to be visible
        frame.setVisible(true);
    }

    // Method to place components inside the panel
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null); // Set the layout manager to null for absolute positioning

        // Create a label
        JLabel label = new JLabel("Click the button to see a message!");
        label.setBounds(80, 30, 250, 25);
        panel.add(label);

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(150, 80, 100, 40);
        panel.add(button);

        // Action listener for button click
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the label's text when the button is clicked
                label.setText("Hello, you clicked the button!");
            }
        });
    }
}