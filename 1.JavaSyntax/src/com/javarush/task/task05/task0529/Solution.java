package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
1. Программа должна считывать данные с клавиатуры.
2. Программа должна прекращать считывать данные с клавиатуры после того пользователь введет слово «сумма» в нижнем регистре и нажмет Enter.
3. Программа должна корректно работать, если пользователь ввел одно число и слово «сумма».
4. Программа должна корректно работать, если пользователь ввел два числа и слово «сумма».
5. Программа должна корректно работать, если пользователь ввел более двух чисел и слово «сумма».
6. Программа должна выводить текст на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumFinal = 0;
        System.out.println("Введи любое целое число. \nЧто бы выйти, введи \"сумма\"\n");

        while (true) {
            String numString = reader.readLine();
            if (!numString.equals("сумма")) {       //не ровняется строке
                int num = Integer.parseInt(numString);
                sumFinal += num;
                if (num > 0) System.out.println(" + в копилочку..");
                else if (num < 0) System.out.println(" - из копилочки..");
            } else {
                System.out.print("Итого в нашей копилке: ");
                System.out.println(sumFinal);
                break;
            }
        }
    }
}
