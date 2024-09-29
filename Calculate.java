package lab01;
import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
	    Scanner x = new Scanner(System.in);
		System.out.print("First: ");
		double num1 = x.nextDouble();
		System.out.print("Second: ");
		double num2 = x.nextDouble();
		double sum = num1 + num2;
		double difference = num1 - num2;
		double product = num1 * num2;
		double quotient = num1/num2;
		System.out.println("Sum: ");
		System.out.print(sum);
		System.out.println("\nDiffernce: ");
		System.out.print(difference);
		System.out.println("\nproduct: ");
		System.out.print(product);
		System.out.println("\nquotient: ");
		System.out.print(quotient);
		x.close();
		System.exit(0);

	}

}
