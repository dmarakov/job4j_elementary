package ru.job4j.condition;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        Point point3 = new Point(4, 2);
        Point point4 = new Point(2, 4);
        double result = point1.distance(point2);
        double result2 = point1.distance(point1);
        double result3 = point3.distance(point4);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (2, 0) to (2, 0) " + result2);
        System.out.println("result (4, 2) to (2, 4) " + result3);
    }
}
