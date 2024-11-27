package DAY_1;
import javax.swing.JOptionPane;


public class GUI{
    public static void main(String[] args)
    {
        String name= JOptionPane.showInputDialog("Enter your name");
        

        int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        

        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Hello "+name);
        JOptionPane.showMessageDialog(null, " Great so,You are " +age + " Years old");
        JOptionPane.showMessageDialog(null, "woww  You are " +height + "ft");

    }

}