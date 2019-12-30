package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

//            for(int i = 1; i < 10; i++){
//                for(int k = 1; k< 10; k++){
//                    System.out.println(String.format("%s * %s = %s \n", i, k, k*i));      //"%s * %s = %s \n", i, k, k*I   == k + " * " + i + " = " + k*i
//                }
//                System.out.println("\n");
//            }
//////////////////////////////////////////////////////////////////////////////
//            int i = 1;
//            while(i < 10){
//                for (int k = 1; k < 10; k++){
//                    System.out.println(k + " * " + i + " = " + k*i);
//                }
//                i++;
//            }
//////////////////////////////////////////////////////////////////////////////

        int count =1;
        while(count <= 10) {
            for (int i =1; i<=10;i++){
                int factor=count*i;
                System.out.print(factor+" ");
            }
            count++;
            System.out.println("\n");
        }
    }
}