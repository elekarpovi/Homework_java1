// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Перейти по ссылке, реализовать формулу на Java.

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = sc.nextInt();
        System.out.printf("Сумма чисел от 1 до %d = %d\n", number, sum(number));
        System.out.printf("Факториал числа %d  =  %d", number, factor(number));
    }
    public static int sum (int n) {
        return (int)((0.5 * n) * (n + 1));
    }
    public static int factor(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * factor(n-1);
    }
    }
    
