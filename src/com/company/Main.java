package com.company;

public class Main {

    public static void main(String[] args) {

        MovablePoint movPoint = new MovablePoint(0,0);

        movPoint.move(5,10);

        System.out.println("point position  (" + movPoint.getX() + ", " + movPoint.getY() + ")");

        MovableCircle movCircle = new MovableCircle(5,0,0);

        movCircle.move(5,10);

        System.out.println("new circle's coords: (" + movCircle.getCentralX() + ", " + movCircle.getCentralY() + ")");
        System.out.println("new circle's radius: " + movCircle.radiusLength());

    }

}