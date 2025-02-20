import javax.swing.JOptionPane;

public class gui {
    public static void main(String a[]) {
        String name = JOptionPane.showInputDialog("Enter your nama: ");
        JOptionPane.showMessageDialog(null, " Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("What is you age"));
        JOptionPane.showMessageDialog(null, "Your are " + age+" years old ");


        double height = Double.parseDouble(JOptionPane.showInputDialog("What is you Height"));
        JOptionPane.showMessageDialog(null, " You are " +height+ " Height");
    }
}