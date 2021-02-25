import javax.swing.*;


public class hephuongtrinhbacnhat1nghiem {
    public static void main(String[] args) {


        String strA, strB;

        JOptionPane.showMessageDialog(null, "Bạn đang ở chương trình giải phương trình bậc nhất ax + b = 0\n", "Hello", JOptionPane.INFORMATION_MESSAGE);
        strA = JOptionPane.showInputDialog(null, "Vui lòng nhập a ", "ax+b= 0", JOptionPane.INFORMATION_MESSAGE);
        strB= JOptionPane.showInputDialog(null, "Vui lòng nhập b ", "ax+b= 0", JOptionPane.INFORMATION_MESSAGE);
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);

        if (a == 0 && b == 0) {
            JOptionPane.showMessageDialog(null, "Phương trình vô số nghiệm", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (a == 0 && b != 0) {
            JOptionPane.showMessageDialog(null, "Phương trình vô nghiệm", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (a != 0) {
            JOptionPane.showMessageDialog(null, "Phương trình có nghiệm x= " +Double.toString((-b)/a), "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
