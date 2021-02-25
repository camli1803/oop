import java.lang.Math;
import javax.swing.JOptionPane;
public class Bac2 {
    public static void main(String[] args){

        String strA, strB, strC;
        do{
            JOptionPane.showMessageDialog(null, "Bạn đang ở chương trình giải phương trình bậc hai ax^2 + bx + c = 0\n", "Hello", JOptionPane.INFORMATION_MESSAGE);
            strA = JOptionPane.showInputDialog(null, "Vui lòng nhập a (khác 0): ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
            strB = JOptionPane.showInputDialog(null, "Vui lòng nhập b: ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
            strC = JOptionPane.showInputDialog(null, "Vui lòng nhập c: ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        } while (Double.parseDouble(strA) == 0);

        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        double c = Double.parseDouble(strC);
        double res = 0;
        double delta = b*b - 4*a*c;
        if (delta < 0){
            JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm", "Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if (delta == 0){
            JOptionPane.showMessageDialog(null, "Phương trình có nghiệm kép\nx1 = x2 = " + Double.toString((-b)/(2*a)), "Result", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        delta = Math.sqrt(delta);
        JOptionPane.showMessageDialog(null, "Phương trình có 2 nghiệm phân biệt\nx1 = " + Double.toString((-b + delta)/(2*a))+"\nx2= "+Double.toString((-b - delta)/(2*a)), "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}



