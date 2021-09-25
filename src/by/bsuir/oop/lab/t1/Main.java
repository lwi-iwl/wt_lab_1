package by.bsuir.oop.lab.t1;

import java.util.Scanner;
import java.lang.Math;

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

    private double getResult(double x, double y){
        return ((1+Math.pow(Math.sin(x+y), 2))/(2+Math.abs(x-2*x/(1+Math.pow(x, 2)*Math.pow(y,2))))+x);
    }
}
