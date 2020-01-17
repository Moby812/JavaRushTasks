package com.javarush.task.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Timer {
    public static void main(String[] args) throws InterruptedException, IOException {

        final String ANSI_RESET = "\u001B[0m";    //стандартный текст
        final String ANSI_GREEN = "\033[1;32m";   //зелёный, жирный текст   //https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println/5762502#5762502
        final String ANSI_YELLOW = "\033[1;33m";
        Calendar nowTime = new GregorianCalendar();
        Calendar needTime = new GregorianCalendar();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Сейчас ровно: " + dateFormat.format(nowTime.getTime()));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи в минутах, на сколько выставить таймер?\n");
        int timer = Integer.parseInt(reader.readLine());        // считаем число с клавы

        needTime.add(Calendar.MINUTE, timer);           //выставляем время таймера. (Текущее + которые мы задали с клавы)
        System.out.println("Таймер выставлен на: " + timer + minMet(timer)+".\nДо: " + dateFormat.format(needTime.getTime()) + "\nОтсчёт пошёл!\n");

        while (true) {
            Calendar now = new GregorianCalendar();
            nowTime.add(Calendar.SECOND, 15);   //как часто ставить "." между минутами
            if (now.getTime().after(needTime.getTime())) {
                System.out.println(ANSI_GREEN+" _____________________________");
                System.out.println("| "+ANSI_YELLOW+"Настало время приключений!!"+ANSI_GREEN+" |");
                System.out.println("|_____________________________|"+ANSI_RESET);
                beepNoise(3);                       //сколько раз "бикнет" уведомление
                break;
            } else {
                if (now.get(Calendar.SECOND) == needTime.get(Calendar.SECOND) && now.get(Calendar.MILLISECOND) == needTime.get(Calendar.MILLISECOND)) {      //проверка по условию ветвления, чтоб отображал в N сек - считывая с даты
                Thread.sleep(1);                                  //приостановим работу программы на 1 милисекунду
                    timer--;
                    if (timer != 0) System.out.println("Осталось подождать ещё " + timer + minMet(timer)+".");
                } else if (now.get(Calendar.SECOND) == nowTime.get(Calendar.SECOND) && now.get(Calendar.MILLISECOND) == nowTime.get(Calendar.MILLISECOND)) {
                    if (timer != 0) System.out.println("\033[1;37m"+"."+ANSI_RESET);
                    Thread.sleep(1);
                }
            }
        }
    }
    public static String minMet(int timer){
        String min = " минут";
        if (timer == 1) min = " минуту";
        if (timer > 20 && timer %10 == 1) min = " минуту";
        if (timer == 2 || timer == 3 ||timer == 4) min = " минуты";
        if (timer > 20 && timer %10 == 2) min = " минуты";
        if (timer > 20 && timer %10 == 3) min = " минуты";
        if (timer > 20 && timer %10 == 4) min = " минуты";
        return min;
    }
    public static void beepNoise(int i) throws InterruptedException {
        for (; i > 0; i--) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            Thread.sleep(999);
        }
    }
}