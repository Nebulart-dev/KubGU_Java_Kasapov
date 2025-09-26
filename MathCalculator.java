import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ввод первого числа
            System.out.print("Введите число a: ");
            double a = scanner.nextDouble();

            // Ввод второго числа
            System.out.print("Введите число b: ");
            double b = scanner.nextDouble();

            // Вычисляем сумму
            double sum = a + b;

            if (sum > 100) {
                // Вычисляем удвоенный синус первого числа
                double result = 2 * Math.sin(a);
                System.out.println("Сумма чисел: " + sum);
                System.out.println("Результат: 2 * sin(" + a + ") = " + (Math.round(result)));
            } else {
                System.out.println("Сумма чисел: " + sum);
                System.out.println("Сумма не превышает 100, вычисления Синуса не требуются");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: введите корректные числа");
        }
    }
}
