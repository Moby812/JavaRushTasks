package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.

green=  0-3,6-9,12-15,18-21,24-27,30-33,36-39,42-45,48-51,54-57;
yellow= 4,10,16,22,28,34,40,46,52,58;
red=    5,11,17,23,29,35,41,47,53,59;
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Integer.parseInt(reader.readLine());
        String green = "зелёный";
        String yellow = "жёлтый";
        String red = "красный";
        t=60%t;

        if (t >=0 && t<3) {
            System.out.println(green);
        } else if (t >=3 && t <4) {
            System.out.println(yellow);
        } else {
            System.out.println(red);
        }
    }
}