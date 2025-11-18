import java.util.Scanner;
import java.lang.Math;
public class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public double distance(Point otherPoint) {
        float xDifference = this.x - otherPoint.getX();
        float yDifference = this.y - otherPoint.getY();
        return Math.sqrt(xDifference * xDifference + yDifference * yDifference);
    }
    public void display() {
        System.out.printf("(x, y) = (%7.2f, %7.2f)\n", x, y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bushra 24csu265");
        System.out.println("Enter the coordinates for Point 1:");
        System.out.print("Enter x1: ");
        float x1 = sc.nextFloat();
        System.out.print("Enter y1: ");
        float y1 = sc.nextFloat();
        System.out.println("\nEnter the coordinates for Point 2:");
        System.out.print("Enter x2: ");
        float x2 = sc.nextFloat();
        System.out.print("Enter y2: ");
        float y2 = sc.nextFloat();
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        System.out.println("\nPoint 1: ");
        point1.display();
        System.out.println("Point 2: ");
        point2.display();
        double distance = point1.distance(point2);
        System.out.printf("\nDistance: %.2f\n", distance);
    }
}