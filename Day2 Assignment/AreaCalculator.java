/*Question - You are tasked with creating a class called AreaCalculator that can calculate the areas of various
geometric shapes. The class provides multiple overloaded calculateArea methods for different
shapes: square, rectangle, and circle.
a) Implement the AreaCalculator class with overloaded calculateArea methods for squares,
rectangles, and circles.
b) In the main method, demonstrate the use of these methods to calculate the areas of a square
with a side length of 5.0, a rectangle with dimensions 4.0 by 6.0, and a circle with a radius of
3.0. Print the results*/
package Com.Day2Assignment;

public class AreaCalculator {
    //Method to calculate the area of a square
    public double calculateSquareArea(double sideLength){
        return sideLength * sideLength;
    }
    //Method to calculate the area of a rectangle
    public double calculateRectangleArea(double length, double width){
        return length * width;
    }
    //Method to calculate the area of a circle
    public double calculateCircleArea(double radius){
        return Math.PI * radius * radius;
    }
}
class areaMain{
    public static void main(String[] args){
        AreaCalculator calculator = new AreaCalculator();

        double squareArea = calculator.calculateSquareArea(5.0);

        double rectangleArea = calculator.calculateRectangleArea(4.0, 6.0);

        double circleArea = calculator.calculateCircleArea(3.0);

        System.out.println("Area of a Square : " + squareArea);
        System.out.println("Area of a Rectangle : " + rectangleArea);
        System.out.println("Area of a Circle : " + circleArea);
    }
}