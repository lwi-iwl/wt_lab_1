package by.bsuir.oop.lab.t2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        double x = main.getX();
        double y = main.getY();
        System.out.println(main.getResult(x, y));
    }

    private double getX(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите х");
        return in.nextFloat();
    }

    private double getY(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите y");
        return in.nextFloat();
    }

    private boolean getResult(double x, double y){
       return (((y >= 0) && (y <= 5) && (x >= -4) && (x <= 4)) ||
               ((y <= 0) && (y >= -3) && (x >= -6) && (x <= 6)));
    }
}
