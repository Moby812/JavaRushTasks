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

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        System.out.println("Сейчас ровно: "+ dateFormat.format(nowTime.getTime()));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи в минутах, на сколько выставить таймер..");
        int timer = Integer.parseInt(reader.readLine());                                                                // считаем число с клавы
        int count = timer;

        needTime.add(Calendar.MINUTE, timer);           //выставляем время. (Текущее + которые мы задали с клавы)
        System.out.println("Таймер выставлен на: "+ count +" минут.\nДо: "+ dateFormat.format(needTime.getTime()) +"\nОтсчёт пошёл!\n\n"); // TODO: 2020-01-16 сделать чтоб выводило когда сработает таймер!

        while (true) {
//            if (nowTime.getTime().equals(needTime.getTime())) {
            if (nowTime.getTime().after(needTime.getTime())) {
                System.out.println("Настало время приключений!!");
                break;
            } else {
                Thread.sleep(60100);                 //приостановим работу программы на 60 секунд
                count--;
                System.out.println("Осталось подождать ещё " + count + " минут");
            }
        }

 /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int timer = Integer.parseInt(reader.readLine());
        LocalDateTime finishTime = LocalDateTime.now().plusMinutes(timer);
        while(LocalDateTime.now().isBefore(finishTime)){
            if(LocalDateTime.now().getSecond() == 0 && LocalDateTime.now().getNano() == 0){
                System.out.println(LocalDateTime.now());
            }
        }
        System.out.println("timeout");

         */
    }
}