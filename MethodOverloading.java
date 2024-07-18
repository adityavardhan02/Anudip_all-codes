package anudip;

public class MethodOverloading{ 


    // Method to calculate the area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            // Handle incorrect call for triangle area
            System.out.println("Invalid call for triangle area.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Shape1 shapes = new Shape1();

        // Calculate the area of a circle
        double circleArea = shapes.area(5.0);
        System.out.println("Area of the circle: " + circleArea);

        // Calculate the area of a rectangle
        double rectangleArea = shapes.area(4.0, 6.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate the area of a triangle
        double triangleArea = shapes.area(3.0, 4.0, true);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
