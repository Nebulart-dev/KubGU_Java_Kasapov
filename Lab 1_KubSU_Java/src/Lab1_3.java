import java.util.Scanner;

public class Lab1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        double Y = 0;
        double F = 0;
        if (x <= 0) {
            Y = 1 - Math.pow(9, x + 1);
            F = Math.exp(Math.log(2 * x + 1));
        } else if (x > 0 && x <= 3) {
            Y = 1 + Math.pow(3, x);
            F = Math.pow(x, 2) - Math.pow(Math.sin(x), 4);
        } else {
            Y = 1 / Math.tan(2 * x + 1);
            F = Math.cbrt(Math.pow(x, 2));
        }
        System.out.println("Y = " + Y);
        System.out.println("F = " + F);
    }
}

