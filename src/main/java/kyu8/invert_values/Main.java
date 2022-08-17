package invert_values;

public class Main {
    public static void main(String[] args) {
        //Дан набор чисел, верните обратный набор. Каждое положительное становится отрицательным,
        //а отрицательное становится положительным.
    }

    public static int[] invert(int[] array) {
        for (int i:array) {
            i *= -1;
        }
        return array;
    }
}
