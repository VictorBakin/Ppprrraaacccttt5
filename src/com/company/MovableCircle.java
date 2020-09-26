package com.company;

import java.lang.Math;

public class MovableCircle extends Circle implements Moving {

    protected double centralX;
    protected double centralY;
    protected double curvePointX;
    protected double curvePointY;

    public MovableCircle() {}

    public MovableCircle(double radius, double centralX, double centralY) {
        super(radius);
        this.centralX = centralX;
        this.centralY = centralY;
        this.curvePointX = centralX;
        this.curvePointY = centralY + radius;
    }

    public MovableCircle(double radius, double centralX, double centralY, String color, boolean filled) {
        super(radius, color, filled);
        this.centralX = centralX;
        this.centralY = centralY;
        this.curvePointX = centralX;
        this.curvePointY = centralY + radius;
    }

    public double radiusLength() {
        return Math.sqrt( Math.pow(this.curvePointX - this.centralX,2) + Math.pow(this.curvePointY - this.centralY,2) );
    }

    public void setCentralCoord(double x, double y) {
        this.centralX = x;
        this.centralY = y;
    }

    public void setCentralX(double x) {
        this.centralX = x;
    }

    public double getCentralX() {
        return this.centralX;
    }

    public void setCentralY(double y) {
        this.centralY = y;
    }

    public double getCentralY() {
        return this.centralY;
    }

    @Override
    public void move(double displacementX, double displacementY) {

        double radiusVelocityHypotenuse = Math.sqrt( Math.pow(displacementX,2) + Math.pow(displacementY, 2));
        double cos = displacementY / radiusVelocityHypotenuse;
        double sin = displacementX / radiusVelocityHypotenuse;

        this.centralX += displacementX;
        this.centralY += displacementY;

        this.curvePointX = this.centralX + this.radius * cos;
        this.curvePointY = this.centralY - this.radius * sin;
    }

    @Override
    public String toString() {
        return "circle moves...";
    }

}