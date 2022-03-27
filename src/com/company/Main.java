package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Point
        Point point = new Point(15, 12);
        System.out.println(point);

        // MoveablePoint
        MoveablePoint moveablePoint = new MoveablePoint(15, 12, 19, 98);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}
