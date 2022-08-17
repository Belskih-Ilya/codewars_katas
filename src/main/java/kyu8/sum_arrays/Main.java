package kyu8.sum_arrays;

public class Main {
    public static void main(String[] args) {
        // Напишите функцию, которая принимает массив чисел и возвращает сумму чисел. Числа могут быть отрицательными
        // или нецелыми. Если массив не содержит чисел, вы должны вернуть 0.
    }

    public static double sum(double[] numbers) {
        double res = 0.0;
        for (double i:numbers) res += i;
        return res;
    }
}
