package src.javaruch.getjavaprofit.basics.lesson02;
/**
Shildt Chapter 3-4 (skip arrays)

        https://en.wikipedia.org/wiki/Numeral_system
        https://en.wikipedia.org/wiki/Positional_notation
        https://en.wikipedia.org/wiki/Order_of_magnitude
        https://en.wikipedia.org/wiki/Radix

        https://en.wikipedia.org/wiki/Binary_number
        https://en.wikipedia.org/wiki/Octal
        https://en.wikipedia.org/wiki/Hexadecimal

        http://en.wikipedia.org/wiki/Bitwise_operation
        http://en.wikipedia.org/wiki/Exclusive_or
        http://en.wikipedia.org/wiki/Logical_disjunction
        http://en.wikipedia.org/wiki/Logical_conjunction
        http://en.wikipedia.org/wiki/Negation

        http://en.wikipedia.org/wiki/Signed_number_representations
        http://en.wikipedia.org/wiki/Two%27s_complement

        -------------------------------------------------------
        задания 1-5 расписать в текстовом файле вручную
        1. расписать перевод 97 в системы счисления, а потом представить в виде суммы произведений.
        a) bin,
        b) oct,
        c) hex

        2. представить 115 в двоичное число размером 1,2,4,8 байт

        3. представить -1, -115 в двоичное число размером 1,2,4,8 байт

        4. выполнить сложение
        bin: 101010 + 100111
        oct: 765 + 234
        hex: CAFE + BABE

        5. выполить вычитание
        bin: 10000 - 10
        oct: 456 - 367
        hex: ABABE - CAFE

        6. Битовые операции
        Во всех упражнениях нельзя использовать арифметические операторы сложения, умножения, вычитания, деления. Вместо них используем побитовые операторы &, |, ~, ^, <<, >>,>>>.

        Входное число A имеет тип int. Номера битов всегда задаются корректно, то есть принимают значения от 0 до 31.

        (A) Дано число n<32. Запишите число 2^n, то есть число, у которого n-й бит равен 1, а остальные – нули.
        (B) Даны два неравных числа: n и m, не превосходящие 31. Вычислите 2^n+2^m.
        (C) Дано целое число A и натуральное число i. Обнулите у числа A его младшие i бит и выведите результат.
        (D) Дано целое число A и натуральное число i. Выведите число, которое получается из числа A установкой значения i-го бита равному 1.
        (E) Дано целое число A и натуральное число i. Выведите число, которое получается из числа A инвертированием i-го бита.
        (F) Дано целое число A и натуральное число i. Выведите число, которое получается из числа A установкой значения i-го бита равному 0.
        (G) Дано целое число A и натуральное число n. Выведите число, которое состоит только из n младших бит числа A.
        (H) Дано целое число A и натуральное число i. Выведите значение i-го бита числа A, то есть 0 или 1.
        (I) Дано число типа byte. Выведите его в битовой форме: 8 бит, старшие биты слева, младшие – справа (не используя jdk api).

        7. поменять значения двух переменных, не используя промежуточной переменной, 4мя способами: 2мя битовыми и 2мя арифметическими
**/

public class Homework {
    public static void main(String[] args) {
        int tmp=47;
        System.out.println(bin(tmp));
        System.out.println(oct(tmp));
        System.out.println(hex(tmp));
    }
    public static String bin (int tmp){
        String bin="";
        while (tmp / 2 >= 1) {
            bin= tmp%2+bin;
            tmp=tmp/2;
        }
        return  bin=tmp+bin;
    }
    public static String oct (int tmp){
        String oct="";
        while (tmp / 8 >= 1) {
            oct= tmp%8+oct;
            tmp=tmp/8;
        }
        return  oct=tmp+oct;
    }
    public static String hex (int tmp){
        String hex="";
        while (tmp / 16 >= 1) {
            if (tmp%16>9){
                switch (tmp%16){
                    case 10:hex="A"+hex;
                    case 11:hex="B"+hex;
                    case 12:hex="C"+hex;
                    case 13:hex="D"+hex;
                    case 14:hex="E"+hex;
                    case 15:hex="F"+hex;
                }
            } else
            hex= tmp%16+hex;
            tmp=tmp/16;
        }
        return  hex=tmp+hex;
    }
}
