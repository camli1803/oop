import javax.swing.JOptionPane;
import java.awt.*;

public class hellonamedialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("Please enter your name: ");
        JOptionPane.showMessageDialog(null,"hi "+ result+ "!");
        System.exit(0);
    }
}
