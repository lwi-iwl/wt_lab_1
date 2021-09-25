package by.bsuir.oop.lab.t3;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        double a = main.getA();
        double b = main.getB();
        double h = main.getH();
        System.out.println(main.getTable(a, b, h));
    }

    private double getA(){
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите a");
                return in.nextFloat();
            } catch (Exception e) {
                System.out.println("Введите число");
                in.nextLine();
            }
        }
    }

    private double getB() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите b");
                return in.nextFloat();
            } catch (Exception e) {
                System.out.println("Введите число");
                in.nextLine();
            }
        }
    }

    private double getH() {
            Scanner in = new Scanner(System.in);
            float h;
            while (true) {
                try {
                    System.out.println("Введите h");
                    h = in.nextFloat();
                    if (h != 0)
                        return h;
                    else
                        System.out.println("Введите число, отличное от 0");
                } catch (Exception e) {
                    System.out.println("Введите число");
                    in.nextLine();
                }
            }
        }

    private String getTable(double a, double b, double h){
        StringBuilder table = new StringBuilder("___________________________\n");
        if (h > 0)
            while (a <= b){
                table.append("||").append(String.format("%11.3f", a)).append('|');
                table.append(String.format("%11.3f", Math.tan(a))).append("||\n");
                //table = table + "___________________________\n";
                a += h;
            }
        else
            while (a >= b){
                table.append("||").append(String.format("%11.3f", a)).append("|");
                table.append(String.format("%11.3f", Math.tan(a))).append("||\n");
                //table = table + "___________________________\n";
                a += h;
            }
        return table.toString();
    }
}
