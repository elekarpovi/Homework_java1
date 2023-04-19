// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num_1 = sc.nextDouble();

        System.out.print("Введите второе число: ");
        double num_2 = sc.nextDouble();

        System.out.print("Выберите операцию (+, -, /, * : ");
        String op = sc.next();

        switch (op) {
            case "+" -> System.out.printf("%.2f + %.2f = %.2f\n", num_1, num_2, num_1 + num_2);
            case "-" -> System.out.printf("%.2f - %.2f = %.2f\n", num_1, num_2, num_1 - num_2);
            case "*" -> System.out.printf("%.2f * %.2f = %.2f\n", num_1, num_2, num_1 * num_2);
            case "/" -> System.out.printf("%.2f / %.2f = %.2f\n", num_1, num_2, num_1 / num_2);
            default -> System.out.println("Неизвестная операция");
        }
    }
}
