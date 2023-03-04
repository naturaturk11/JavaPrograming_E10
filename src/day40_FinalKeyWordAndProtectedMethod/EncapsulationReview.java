package day40_FinalKeyWordAndProtectedMethod;

import day39Recap.Shape.Circle;
import day39Recap.Shape.Square;

public class EncapsulationReview {

    private Circle circle;

    private Square square;



    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        if(circle.getRadius()<5){
            System.out.println("Invalid data");
            return;
        }
        this.circle=circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }
}
