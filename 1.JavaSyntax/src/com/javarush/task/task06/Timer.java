package com.javarush.task.task06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Timer {
    public static void main(String[] args) throws InterruptedException, IOException {

        Calendar nowTime = new GregorianCalendar();
        Calendar needTime = new GregorianCalendar();

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Сейчас ровно: " + dateFormat.format(nowTime.getTime()));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи в минутах, на сколько выставить таймер..\n");
        int timer = Integer.parseInt(reader.readLine());                                                                // считаем число с клавы
        int count = timer;

        needTime.add(Calendar.MINUTE, timer);           //выставляем время. (Текущее + которые мы задали с клавы)
        System.out.println("Таймер выставлен на: " + count + " минут(ы).\nДо: " + dateFormat.format(needTime.getTime()) + "\nОтсчёт пошёл!\n\n");

        while (true) {
            Calendar now = new GregorianCalendar();
            if (now.getTime().after(needTime.getTime())) {
                System.out.println("Настало время приключений!!");
                break;
            } else {    // TODO: 16.01.2020 сделать проверку по условию ветвленияБ чтоб отображал в N сек - считывая с даты
                Thread.sleep(60000);                 //приостановим работу программы на 60 секунд
                count--;
                if (count != 0) System.out.println("Осталось подождать ещё " + count + " минут(ы)");
            }
        }
    }
}