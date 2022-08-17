package kyu8.count_by_x;

public class Main {
    public static void main(String[] args) {
        //Создайте функцию с двумя аргументами, которая будет возвращать массив первых (n) кратных (x).
        //Предположим, что и заданное число, и количество подсчетов будут положительными числами больше 0.
        //Вернуть результаты в виде массива
    }

    public static int[] countBy(int x, int n){
        int[] result = new int[n];
        for (int i =0; i < result.length; i++) {
            result[i] = x + (i*x);
        }
        return result;
    }
}
