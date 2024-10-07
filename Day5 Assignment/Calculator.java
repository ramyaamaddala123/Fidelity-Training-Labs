/* Create a class called Calculator which contains methods for arithmetic operations such
as Addition, Subtraction ,Multiplication and Division. Division method should return the
Quotient and Remainder.
• Follow the method signatures as given below:
public int Addition(int a. int b)
public int Subtraction(int a, int b)
public int Multiplication(int a, int b)
public double Division(int a, int b, double[] remainder). //The method should return the
Quotient and Remainder should be passed to the main method.
• The methods should return the appropriate result.
• Create a class Program with Main Method Prompt for 2 operands and operator from
the user, Call the appropriate method and display the results.*/
package Com.Day5Assignment;
import java.util.Scanner;

public class Calculator {
    public int Addition(int a, int b){
        return a+b;
    }
    public int Subtraction(int a, int b){
        return a-b;
    }
    public int Multiplication(int a, int b){
        return a*b;
    }
    public double Division(int a, int b, double[] remainder){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        remainder[0] = a % b;
        return (double) a/b;
    }
}
class Program{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter the operands");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        switch (operator){
            case '+':
                System.out.println("Result of " +num1+ " + " +num2+ " is " +calculator.Addition(num1, num2));
                break;
            case '-':
                System.out.println("Result of " +num1+ " - " +num2+ " is " +calculator.Subtraction(num1, num2));
                break;
            case '*':
                System.out.println("Result of " +num1+ " - " +num2+ " is " +calculator.Multiplication(num1, num2));
                break;
            case '/':
                double[] remainder = new double[1];
                try{
                    double quotient = calculator.Division(num1, num2, remainder);
                    System.out.println("Result of " +num1+ "/" +num2+ " is " +quotient);
                    System.out.println("Remainder =" +remainder[0]);
                }
                catch(ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
            }
            break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
