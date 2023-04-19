//Вывести все простые числа от 1 до 1000

public class task2 {
   public static void main(String[] args) {
       for (int i = 2; i < 1001; i++) {
            Integer rez = i;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                rez = null;
                break;
                }
            }
            if (rez != null) {
            System.out.println(rez);
            }
    }
   } 
}
