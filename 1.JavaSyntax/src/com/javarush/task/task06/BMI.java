package com.javarush.task.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {


    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свой рост:");
        double height = Double.parseDouble(bis.readLine());     //рост
        if (height > 3) height /= 100;
        System.out.println("Введите свой вес:");
        double weight = Double.parseDouble(bis.readLine());     //вес в кг

        Body.BMI(weight, height);
    }

    public static class Body {
        public static void BMI(double weight, double height) {
            double mass = weight / (height * height);
            System.out.format(Color.WHITE + "Твой ИМТ: "+"%.1f%n", mass);  //привести к формату --http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/
            if (mass < 18.5) System.out.println(Color.YELLOW + "Недовес: меньше чем 18.5");
            else if (mass >= 18.5 && mass < 25) System.out.println(Color.GREEN + "Нормальный: между 18.5 и 25");
            else if (mass >= 25 && mass < 30) System.out.println(Color.YELLOW + "Избыточный вес: между 25 и 30");
            else System.out.println(Color.RED + "Ожирение: 30 или больше");
        }

        private static class Color {
            static final String RED = "\033[1;31m";
            static final String GREEN = "\033[1;32m";
            static final String YELLOW = "\033[1;33m";
            static final String WHITE = "\033[1;37m";
        }
    }
}
