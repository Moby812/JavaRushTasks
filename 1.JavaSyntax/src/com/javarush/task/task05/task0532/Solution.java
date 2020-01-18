package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам

1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить число на экран.
3. В классе должен быть метод public static void main.
4. Нельзя добавлять новые методы в класс Solution.
5. Программа должна выводить на экран максимальное из введенных N чисел.
6. Программа не должна ничего выводить на экран, если N меньше либо равно 0.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;

        if (count > 0) {
            //напишите тут ваш код
            while (count > 0) {
                int n = Integer.parseInt(reader.readLine());
//                if (n > 0) System.out.println(n);
//                maximum = n > maximum ? n : maximum;    // аналог -- if (n > maximum) maximum = n;
                maximum = Math.max(n, maximum);
                count--;
            }
        }
        if (maximum > 0) System.out.println(maximum);
//        System.out.println(maximum);
    }
}
