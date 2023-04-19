// Task_6
// Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов 
// с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
// Sample Input:
// 4
// 1
// 2
// 3
// 4
// Sample Output:
// 4
// 1
// 3
// import java.util.Scanner;
// class MyProgram{
// public static void main(String[] args){
// }
// }

import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int l = Integer.parseInt(sc.nextLine());
        int [] arr = new int[l];
        int sum_nums = 0;
        
        for (int i = 0; i < l; i++) {
            System.out.println("Элемент массива: ");
            arr[i] = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                sum_nums += arr[i];
            }
        }
        System.out.println(sum_nums);
        System.out.println();

        for (int i = 0; i < l; i+=2) {
            System.out.println(arr[i]);
        }
        
    }
}
