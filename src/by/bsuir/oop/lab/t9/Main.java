package by.bsuir.oop.lab.t9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Basket basket = new Basket();
        int status;
        do {
            System.out.println("Output the result: enter 1");
            System.out.println("Add a ball: enter 2");
            Scanner in = new Scanner(System.in);
            status = in.nextInt();
            if (status == 2)
                basket.addBall(new Ball(main.getColor(), main.getWeight()));
        }
        while (status == 2);
        if (basket.getSize() == 0)
            System.out.println("The basket is empty");
        else {
            System.out.printf("Number of blue balls: %d\n", basket.getQuantity("blue"));
            System.out.printf("Total weight of the balls: %7.3f", basket.getWeight());
        }
        System.out.println();
    }

    private String getColor(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a color (pink, red, orange, yellow, green, blue, purple)");
        return in.next();
    }

    private float getWeight(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the mass");
        return in.nextFloat();
    }
}
//javac -sourcepath ./src -d bin src/by/bsuir/oop/lab/t9/Main.jav
//java -classpath ./bin by.bsuir.oop.lab.t9.Main

//in bin folder
//jar cfe Main.jar by.bsuir.oop.lab.t9.Main by/bsuir/oop/lab/t9/*
//java -jar Main.jar