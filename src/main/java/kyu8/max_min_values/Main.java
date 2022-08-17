package kyu8.max_min_values;

public class Main {
    public static void main(String[] args) {
        // Ваша задача состоит в том, чтобы сделать две функции (максимум и минимум или максимум и минимум и т. д.,
        // в зависимости от языка), которые получают на вход список целых чисел и возвращают наибольшее и наименьшее
        // число в этом списке соответственно.
    }

    public int min(int[] list) {
        int result = list[0];
        for (int i:list) {
            if (result > i) result = i;
        }
        return result;
    }

    public int max(int[] list) {
        int result = list[0];
        for (int i:list) {
            if (result < i) result = i;
        }
        return result;
    }

}
