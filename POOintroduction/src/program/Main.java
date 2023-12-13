package program;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        double xA, xB, xC, yA, yB, yC;
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double p = (x.a + x.b + x.c) / 2.0;

        System.out.printf("Triangle X area: %.4f%n", x.area());
        System.out.printf("Triangle Y area: %.4f%n", y.area());
        if (x.area() > y.area()) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}