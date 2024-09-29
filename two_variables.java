package lab01;

import java.util.Scanner;

public class two_variables {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a11: ");
        double a11 = input.nextDouble();
        System.out.print("a12: ");
        double a12 = input.nextDouble();
        System.out.print("b1: ");
        double b1 = input.nextDouble();
        
        System.out.print("a21: ");
        double a21 = input.nextDouble();
        System.out.print("a22: ");
        double a22 = input.nextDouble();
        System.out.print("b2: ");
        double b2 = input.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Vo so nghiem");
            } else {
                System.out.println("Vo nghiem");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        input.close();
    }
}

