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
            double idealMaxWeight = 25 * (height * height);         //в зависимости от роста считаем верхнюю планку идеального веса   //пик 25
            double minusIdealMaxWeight = weight - idealMaxWeight;   //считаем перевес до идеального веса
            double idealMinWeight = 18.5 * (height * height);       //в зависимости от роста считаем нижнюю планку идеального веса    //граница 18.5
            double addIdealMinWeight = idealMinWeight - weight;     //считаем недовес до идеального веса
            System.out.format("Нормальный вес при таком росте: "+"%.2f",idealMinWeight);
            System.out.format(" - " + "%.2f",idealMaxWeight);
            System.out.println("кг.\n");
            System.out.format(Color.WHITE + "Твой ИМТ: "+"%.1f%n", mass);  //приводим к формату http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/

            if (mass < 18.5) System.out.format(Color.YELLOW + "Недовес! \nТвой ИМТ меньше чем 18.5 \nДо нормального веса надо набрать хотя бы кг: " +"%.1f", addIdealMinWeight);
            else if (mass >= 18.5 && mass < 25) System.out.println(Color.GREEN + "Нормальный вес. \nТвой ИМТ между 18.5 и 25");
            else if (mass >= 25 && mass < 30) System.out.format(Color.YELLOW + "Избыточный вес! \nТвой ИМТ между 25 и 30. \nДо нормального веса надо скинуть хотя бы кг: " +"%.1f", minusIdealMaxWeight);
            else System.out.format(Color.RED + "Ожирение! \nТвой ИМТ выше 30 \nДо нормального веса надо скинуть хотя бы кг: " +"%.1f", minusIdealMaxWeight);
        }

        private static class Color {
            static final String RED = "\033[1;31m";
            static final String GREEN = "\033[1;32m";
            static final String YELLOW = "\033[1;33m";
            static final String WHITE = "\033[1;37m";
        }
    }
}