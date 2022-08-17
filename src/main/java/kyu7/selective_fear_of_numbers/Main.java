package kyu7.selective_fear_of_numbers;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //У меня сумасшедшее психическое заболевание. Я очень не люблю цифры. Но это немного сложно: число,
        // которого я боюсь, зависит от того, какой сегодня день недели... Это конкретное описание моего
        // психического заболевания:

        //Понедельник --> 12

        //Вторник --> числа больше 95

        //Среда --> 34

        //Четверг --> 0

        //Пятница --> числа, делящиеся на 2

        //Суббота --> 56

        //Воскресенье --> 666 или -666

        //Напишите функцию, которая принимает строку (день недели) и целое число (число для проверки), чтобы она
        // сообщала врачу, боюсь я или нет. (вернуть логическое значение)

        System.out.println(amIAfraid("TUESDAY", 102));
        System.out.println(amIAfraid("MONDAY", 10));
    }

    static public boolean amIAfraid(final String day, final int num) {
        if (day.toUpperCase(Locale.ROOT).equals("MONDAY")) {
            if (num == 12) return true;
        } else if (day.toUpperCase(Locale.ROOT).equals("TUESDAY")) {
            if (num > 95) return true;
        } else if (day.toUpperCase(Locale.ROOT).equals("WEDNESDAY")) {
            if (num == 34) return true;
        } else if (day.toUpperCase(Locale.ROOT).equals("THURSDAY")) {
            if (num == 0) return true;
        } else if (day.toUpperCase(Locale.ROOT).equals("FRIDAY")) {
            double res = num/2;
            if (res == (int) res) return true;
        } else if (day.toUpperCase(Locale.ROOT).equals("SATURDAY")) {
            if (num == 56) return true;
        } else if (day.toUpperCase(Locale.ROOT).equals("SUNDAY")) {
            if (num == 666 || num == -666) return true;
        }
        return false;
    }
}
