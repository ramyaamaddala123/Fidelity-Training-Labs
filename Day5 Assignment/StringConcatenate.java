/*Write a Java program Which asks the user for their first name and last name to
enter separately Concatenate these Strings, with a space in-between them, putting
the resulting concatenation into a single String variable named fullName and Output
the concatenated String to the console.
SAMPLE INPUT / OUTPUT :
Enter first name
Alice
Enter last name
Maria
Full name : Alice Maria */

package Com.Day5Assignment;
import java.util.*;

public class StringConcatenate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        String fullName = firstName + " " + lastName;
        System.out.println("Full name : " +fullName);
    }
}
