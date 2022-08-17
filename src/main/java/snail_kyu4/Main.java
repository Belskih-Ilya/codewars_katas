package snail_kyu4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Дан массив n x n, вернуть элементы массива, расположенные от самых внешних элементов до
        // среднего элемента, перемещаясь по часовой стрелке.

        //array = [[1,2,3],
        //         [4,5,6],
        //         [7,8,9]]
        //snail(array) #=> [1,2,3,6,9,8,7,4,5]

        int[][] start = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16}};

        System.out.println(Arrays.toString(snail(start)));
    }

    public static int[] snail(int[][] array) {
        List<Integer> resultList = new ArrayList<>();
        int[] result = new int[(array.length * array.length)];

        for (int a = 0; a <= array.length - 2; a++) {

        for (int i = 0+a; i < array.length-a; i++) {
            resultList.add(array[0+a][i]);
        }
        for (int i = 1+a; i < array.length-a; i++) {
            resultList.add(array[i][array.length - 1-a]);
        }
        for (int i = array.length - 2-a; i >= 0+a; i--) {
            resultList.add(array[array.length - 1-a][i]);
        }
        for (int i = array.length - 2-a; i > 0+a; i--) {
            resultList.add(array[i][0+a]);
        }

        }

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }


}
