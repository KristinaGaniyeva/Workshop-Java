package it.sevenbits.line;

import java.util.Random;

public class Line {
    private Point A;
    private Point B;

    public Line(int x1, int y1, int x2, int y2){
        this.A = new Point(x1,y1);
        this.B = new Point(x2,y2);
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    public double getLenght(){
        int dx = A.getX() - B.getX();
        int dy = A.getY() - B.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }
}