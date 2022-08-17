package kyu6.find_the_odd_int;

public class Main {

    public static void main(String[] args) {
       // Дан массив целых чисел, найдите то, которое встречается нечетное количество раз
       //Всегда будет только одно целое число, которое встречается нечетное количество раз

    }

    public static int findIt(int[] a) {
        for (int i:a) {
            int count = 0;
            for (int j:a) {
                if (i == j) {
                    count++;
                }
            }
            if (count%2 == 1) {
                return i;
            }
        }
        return 1;
    }
}
