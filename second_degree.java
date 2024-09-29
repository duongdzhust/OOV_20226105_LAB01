package lab01;
import java.util.Scanner;
public class second_degree {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("a: ");
	        double a = input.nextDouble();
	        
	        System.out.print("b: ");
	        double b = input.nextDouble();
	        
	        System.out.print("c: ");
	        double c = input.nextDouble();

	        if (a == 0) {
	            if (b == 0) {
	                if (c == 0) {
	                    System.out.println("Vo so nghiem");
	                } else {
	                    System.out.println("Vo nghiem");
	                }
	            } else {
	                double x = -c / b;
	                System.out.println("x = " + x);
	            }
	        } else {
	            double delta = b * b - 4 * a * c;

	            if (delta > 0) {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.println("x1 = " + x1);
	                System.out.println("x2 = " + x2);
	            } else if (delta == 0) {
	                double x = -b / (2 * a);
	                System.out.println("x = " + x);
	            } else {
	                System.out.println("Vo nghiem");
	            }
	        }

	        input.close();
	    }
	}
