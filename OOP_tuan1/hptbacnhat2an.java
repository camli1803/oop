import java.util.Scanner;

public class hptbacnhat2an {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a11, a12, b1;
        double a21, a22, b2;
        double x1, x2;
        double d, d1, d2;

        System.out.print("Nhap a11 = "); a11 = s.nextDouble();
        System.out.print("Nhap a12 = "); a12 = s.nextDouble();
        System.out.print("Nhap b1 = "); b1 = s.nextDouble();
        System.out.print("Nhap a21 = "); a21 = s.nextDouble();
        System.out.print("Nhap a22 = "); a22 = s.nextDouble();
        System.out.print("Nhap b2 = "); b2 = s.nextDouble();

        d = a11 * a22 - a21 * a12;
        d1 = b1 * a22 - b2 * a12;
        d2 = a11 * b2 - a21 * b1;

        if (d == 0 && d1 == 0 && d2 == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        } else if (d == 0 && (d1 != 0 || d2 != 0)) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (d != 0) {
            x1 = d1 / d;
            x2 = d2 / d;
            System.out.println("Phuong trinh co 1 nghiem duy nhat (x1,x2) = (" + x1 + "," + x2 + ")");
        }
    }
}