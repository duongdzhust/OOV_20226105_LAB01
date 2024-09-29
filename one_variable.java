package lab01;
import java.util.Scanner;

public class one_variable {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.print("a = ");
        double a = t.nextDouble();
        System.out.print("b = ");
        double b = t.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
        t.close();
        System.exit(0);
    }
}
