/* Write a Java Program to compute the square and Cube for a given number.
Create the following methods.
• Create a method FindSquare that returns the square Of the given number.
FindSquare method should accept a single parameter of type double and return a
double value.
• Create a method FindCube that returns the cube of the given number.
FindCube method should accept a single parameter of type double value.
From the main method prompt the user to enter a number and display the square and
cube of the number.
The method signature should be as below
static <return type> <FunctionName> ( <data type> parameter) */
package Com.Day5Assignment;
import java.util.*;

public class SquareAndCube {
    public static double FindSquare(double number){
        return number * number;
    }
    public static double FindCube(double number){
        return number * number * number;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        System.out.println("Square of " + number + " is " + FindSquare(number));
        System.out.println("Cube of " + number + " is " + FindCube(number));
    }
}