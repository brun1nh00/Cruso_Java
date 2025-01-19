package entities;

public class Rectangle {

    public double height;
    public double width;

    public double area() {
        return height * width;
    }

    public double perimeter() {
        return 2 * (height + width);
    }

    public double diagonal() {
        return Math.sqrt((height * height) + (width * width));
    }
}
