import java.util.Scanner;

public class Circle_data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the radius of a circle");
        double radius = scanner.nextDouble();

        double circumference = radius * Math.PI * 2;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("The %f radius circle has an area of %f and a circumference of %f.", radius, area, circumference);


    }
}
