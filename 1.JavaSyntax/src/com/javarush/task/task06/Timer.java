package com.javarush.task.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Timer {
    public static void main(String[] args) throws InterruptedException, IOException {

//        final String ANSI_RESET = "\u001B[0m";    //стандартный текст
//        final String ANSI_BLOW = "\u001B[0m";     //жирный текст
//        final String ANSI_GREEN = "\u001B[32m";   //зелёный текс
        Calendar nowTime = new GregorianCalendar();
        Calendar needTime = new GregorianCalendar();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Сейчас ровно: " + dateFormat.format(nowTime.getTime()));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи в минутах, на сколько выставить таймер?\n");
        int timer = Integer.parseInt(reader.readLine());        // считаем число с клавы

        needTime.add(Calendar.MINUTE, timer);           //выставляем время таймера. (Текущее + которые мы задали с клавы)
        System.out.println("Таймер выставлен на: " + timer + minMet(timer)+".\nДо: " + dateFormat.format(needTime.getTime()) + "\nОтсчёт пошёл!\n\n");

        while (true) {
            Calendar now = new GregorianCalendar();
            if (now.getTime().after(needTime.getTime())) {
//                System.out.println(ANSI_GREEN+ANSI_BLOW+ "Настало время приключений!!" +ANSI_RESET);
                System.out.println(" _____________________________");
                System.out.println("| Настало время приключений!! |");
                System.out.println("|_____________________________|");
                // TODO: 16.01.2020 Добавить проигрывание звука
                break;
            } else {
                if (now.get(Calendar.SECOND) == nowTime.get(Calendar.SECOND) && now.get(Calendar.MILLISECOND) == nowTime.get(Calendar.MILLISECOND)) {      //проверка по условию ветвления, чтоб отображал в N сек - считывая с даты
                Thread.sleep(1);                                  //приостановим работу программы на 1 милисекунду
                    timer--;
                    if (timer != 0) System.out.println("Осталось подождать ещё " + timer + minMet(timer));
                }
            }
        }
    }
    public static String minMet(int timer){
        String min = " минут";                                      // TODO: 16.01.2020 после присвоения, не будет возвращаться в "минут". поправить
        if (timer == 1) min = " минуту";
        if (timer > 20 && timer %10 == 1) min = " минуту";
        if (timer == 2 || timer == 3 ||timer == 4) min = " минуты";
        if (timer > 20 && timer %10 == 2) min = " минуты";
        if (timer > 20 && timer %10 == 3) min = " минуты";
        if (timer > 20 && timer %10 == 4) min = " минуты";
        return min;
    }
}