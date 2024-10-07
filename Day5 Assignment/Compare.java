/* Write a Java program to compare two numbers and print which number is lesser than
the other.
• Declare two variables an int x and int y.
• Obtain the value from the user for x and y.
• Write a program which tests whether x is less than y, storing the boolean result of
this test into a bool variable named result.
• Print your findings, out to the console as given the sample output. */
package Com.Day5Assignment;
import java.util.*;

public class Compare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x");
        int x = sc.nextInt();
        System.out.println("Enter the value for y");
        int y = sc.nextInt();
        boolean result = x < y;
        System.out.println("The result of whether x is less than y is " +result);
    }
}