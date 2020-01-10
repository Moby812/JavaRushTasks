package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numF = 0;

        while (true) {
            int num = Integer.parseInt(reader.readLine());
            if (num != -1) numF += num;
            if (num == -1) {
                numF += num;                //в этом случае "-1" учитывается в сумме
                System.out.println(numF);
                break;
            }
        }
    }
}
