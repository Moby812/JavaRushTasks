package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела

"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5 (не включая),
"Нормальный: между 18.5 и 25" - если индекс массы тела между 18.5 и 25 (не включая),
"Избыточный вес: между 25 и 30" - если индекс массы тела между 25 и 30 (не включая),
"Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

Подсказка:
Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());     //вес в кг
        double height = Double.parseDouble(bis.readLine());     //рост в см

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double mass = weight / (height*height);
//            System.out.println(mass);
            if (mass < 18.5) System.out.println("Недовес: меньше чем 18.5");
            else if (mass >= 18.5 && mass < 25) System.out.println("Нормальный: между 18.5 и 25");
            else if (mass >= 25 && mass < 30) System.out.println("Избыточный вес: между 25 и 30");
            else System.out.println("Ожирение: 30 или больше");
        }
    }
}
