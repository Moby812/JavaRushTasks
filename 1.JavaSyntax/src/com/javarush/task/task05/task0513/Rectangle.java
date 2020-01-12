package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;

    public void initialize(int left, int top, int width, int height) {      //- заданы 4 параметра: left, top, width, height
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {                             //- ширина/высота не задана (оба равны 0)
        this.left = left;
        this.top = top;
    }

    public void initialize(int left, int top, int width) {                  //- высота не задана (равно ширине) создаём квадрат
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public void initialize(Rectangle rectangle) {                           //- создаём копию другого прямоугольника (он и передаётся в параметрах)
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
