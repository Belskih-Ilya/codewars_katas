package kyu6.array_diff;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ваша цель в этом ката — реализовать функцию разности, которая вычитает один список из другого и возвращает результат.
        //Он должен удалить все значения из списка a, которые присутствуют в списке b, сохраняя их порядок.
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> resultList = new ArrayList<>();
        for (int i:a) {
            int count = 0;
            for (int j:b) {
                if (i == j) {
                    count++;
                }
            }
            if (count == 0) {
                resultList.add(i);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
