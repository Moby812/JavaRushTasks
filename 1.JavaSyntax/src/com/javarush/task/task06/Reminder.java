package com.javarush.task.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reminder {

    public static void main(String[] args) throws InterruptedException, IOException {

        Calendar time = new GregorianCalendar(); //текущее время

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        System.out.println("Сейчас: " + dateFormat.format(time.getTime()));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи текст напоминания:");
        String text = reader.readLine();
        int countText = text.length();

        System.out.println();
        System.out.println("Введи в формате чч:мм, во сколько должно отобразиться напомининие?");
        String timer = reader.readLine();       // TODO: 2020-01-20 при вводе "01:40" - падает

        String hour = timer.split(":")[0];      // https://ru.stackoverflow.com/questions/604140/%D0%BA%D0%B0%D0%BA-%D0%BF%D1%80%D0%B0%D0%B2%D0%B8%D0%BB%D1%8C%D0%BD%D0%BE-%D1%80%D0%B0%D1%81%D0%BF%D0%B0%D1%80%D1%81%D0%B8%D1%82%D1%8C-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D1%83-%D0%B2-java
        String minute = timer.split(":")[1];    // https://coderoad.ru/40712651/Java-Split-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%B0-%D0%B2-%D0%BE%D1%82%D0%B4%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B5-%D1%81%D1%82%D1%80%D0%BE%D0%BA%D0%BE%D0%B2%D1%8B%D0%B5-%D0%B8-%D1%86%D0%B5%D0%BB%D0%BE%D1%87%D0%B8%D1%81%D0%BB%D0%B5%D0%BD%D0%BD%D1%8B%D0%B5-%D0%BF%D0%B5%D1%80%D0%B5%D0%BC%D0%B5%D0%BD%D0%BD%D1%8B%D0%B5
        int HOUR = Integer.parseInt(hour);
        int MINUTE = Integer.parseInt(minute);

        time.set(Calendar.HOUR, HOUR);      // TODO: 2020-01-20 записывает в 12часовом формате
        time.set(Calendar.MINUTE, MINUTE);
        time.set(Calendar.SECOND, 0);

        System.out.println("Отсчёт пошёл!\n");
        System.out.println(time.get(Calendar.HOUR));
        System.out.println(time.getTime());
        System.out.println(dateFormat.format(time.getTime()));

        while (true) {
            Calendar now = new GregorianCalendar();
            if (now.getTime().after(time.getTime())) {
                System.out.println(Color.GREEN + " _" + lengthText(countText) + "_");
                System.out.println("| " + Color.YELLOW + text + Color.GREEN + " |");
                System.out.println("|_" + lengthText(countText) + "_|");
                beepNoise(3);                       //сколько раз "бикнет" уведомление
                break;
            } else {
                Thread.sleep(15000);                                  //приостановим работу программы на 15сек
            }
        }
    }

    public static void beepNoise(int i) throws InterruptedException {
        for (; i > 0; i--) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            Thread.sleep(999);
        }
    }

    public static String lengthText(int countText) {
        String underscore = "_";
        String underscoreOne = "_";
        while (countText > 1) {
            underscore += underscoreOne;
            countText--;
        }
        return underscore;
    }

    private static class Color {
        static final String RED = "\033[1;31m";
        static final String GREEN = "\033[1;32m";
        static final String YELLOW = "\033[1;33m";
        static final String WHITE = "\033[1;37m";
        static final String RESET = "\u001B[0m";
    }
}
