package kyu8.sum_mixed_array;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Дан массив целых чисел в виде строк и чисел, верните сумму значений массива, как если бы все они были числами
        //Верните ответ в виде числа

    }

    public int sum(List<?> mixed) {
        int result = 0;
        for (int i = 0; i < mixed.size(); i++) {
            result += Integer.parseInt(mixed.get(i).toString());
        }
        return result;
    }

}
