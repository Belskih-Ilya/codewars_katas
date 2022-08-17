package find_next_perfect_square;

import java.lang.management.MemoryType;

public class Main {
    public static void main(String[] args) {
        // Возможно, вы знаете несколько довольно больших идеальных квадратов. Но как насчет СЛЕДУЮЩЕГО?
        // Завершите метод findNextSquare, который находит следующий целочисленный идеальный квадрат после квадрата,
        // переданного в качестве параметра.
        // Напомним, что целочисленный совершенный квадрат — это целое число n, такое что sqrt(n) также является целым числом.
        // Если параметр сам по себе не является идеальным квадратом, то следует вернуть -1. Вы можете предположить,
        // что параметр неотрицательный.
    }


    public static long findNextSquare(long sq) {
        double res = 0;
        res = Math.sqrt(sq);
        if (!(res == (int) res)) return -1;
        do {
            sq += 1;
            res = Math.sqrt(sq);
        } while (!(res == (int) res));
        return sq;
    }

}
