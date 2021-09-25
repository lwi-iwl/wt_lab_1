package by.bsuir.oop.lab.t9;

import java.util.ArrayList;

public class Basket {
    ArrayList<Ball> basket = new ArrayList<Ball>();

    public void addBall(Ball ball) {
        basket.add(ball);
    }

    public int getSize(){
        return basket.size();
    }

    public int getQuantity(String color){
        int quantity = 0;
        for (Ball ball : basket)
            if (ball.getColor().equals(color))
                quantity++;
        return quantity;
    }

    public float getWeight(){
        float weight = 0;
        for (Ball ball : basket)
            weight += ball.getWeight();
        return weight;
    }
}
