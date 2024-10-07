/* Implement a user defined function to handle Age eligibility to vote */
package Com.Day1Assignment;
import java.util.*;

public class AgeEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the age : ");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("You don't have the eligibility to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }
    }
}