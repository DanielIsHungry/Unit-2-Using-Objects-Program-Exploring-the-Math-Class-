import java.util.Scanner;

public class Quadratics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quadratics solver. Enter the values of A, B and C of your equation, in the form: ax^2+bx+c=0");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double x1 =  (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a); // quadratic equation for each value of x
        double x2 =  (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a); // quadratic equation for each value of x

        System.out.printf("For the equation %dx^2+%dx+%d=0, x is equal to %f and %f", (int)(a), (int)(b), (int)(c), x1, x2);

    }
}
