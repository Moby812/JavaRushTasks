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
            double idealMaxWeight;    //в зависимости от роста считаем верхнюю планку идеального веса   //пик 25
            idealMaxWeight = 25 * (height * height);
            double minusIdealMaxWeight = weight - idealMaxWeight;
            double idealMinWeight;    //в зависимости от роста считаем нижнюю планку идеального веса    //граница 18.5
            idealMinWeight = 18.5 * (height * height);
            double addIdealMinWeight = idealMinWeight - weight;
            System.out.format(Color.WHITE + "Твой ИМТ: "+"%.1f%n", mass);  //привести к формату --http://study-java.ru/uroki-java/formatirovanie-chisel-i-texta-v-java/
            System.out.println("Верхняя граница идеального веса при таком росте = "+idealMaxWeight);
            System.out.println("До неё надо скинуть ещё "+minusIdealMaxWeight);
            System.out.println("Нижняя граница идеального веса при таком росте = "+idealMinWeight);
            System.out.println("До неё надо набрать ещё "+addIdealMinWeight);


            if (mass < 18.5) System.out.println(Color.YELLOW + "Недовес: меньше чем 18.5");
            else if (mass >= 18.5 && mass < 25) System.out.println(Color.GREEN + "Нормальный: между 18.5 и 25");
            else if (mass >= 25 && mass < 30) System.out.println(Color.YELLOW + "Избыточный вес: между 25 и 30");
            else System.out.println(Color.RED + "Ожирение, от 30 и выше. \nДо нормального веса надо скинуть хотя бы: " );
        }

        private static class Color {
            static final String RED = "\033[1;31m";
            static final String GREEN = "\033[1;32m";
            static final String YELLOW = "\033[1;33m";
            static final String WHITE = "\033[1;37m";
        }
    }
}
