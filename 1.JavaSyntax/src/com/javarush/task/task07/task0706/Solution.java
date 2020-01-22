package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."

Примечание:
дом с порядковым номером 0 считать четным.


*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        int[] home = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < home.length; i++) {
            int room = Integer.parseInt(reader.readLine());
            home[i] = room;
        }

        int sumEven =0;
        int sumOdd =0;
        for (int i = 0; i < home.length ; i++) {
            if (i%2 ==0) sumEven +=home[i];
            else sumOdd +=home[i];
        }

//        System.out.println(sumEven);
//        System.out.println(sumOdd);

        if (sumEven > sumOdd) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
