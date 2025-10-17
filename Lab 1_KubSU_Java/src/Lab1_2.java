import java.util.Scanner;

public class Lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        double max = Math.max(a, b);
        double min = Math.min(a, b);
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();
        double numerat = max - Math.pow(2, x) * min;
        double denominat = Math.sin(2) + max / min;
        double d = numerat / denominat;

        System.out.printf("Максимальное значение: %.2f\n", max);
        System.out.printf("Минимальное значение: %.2f\n", min);
        System.out.printf("Значение d: %.2f\n", d);
    }
}