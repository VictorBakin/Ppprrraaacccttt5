package com.company;

public class MovablePoint extends Shape implements Moving {

    protected double x;
    protected double y;

    public MovablePoint() {}

    public MovablePoint(double initX, double initY) {
        this.x = initX;
        this.y = initY;
    }

    public void setCoord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    @Override
    public void move(double displacementX, double displacementY) {
        this.x += displacementX;
        this.y += displacementY;
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "point be like";
    }

}