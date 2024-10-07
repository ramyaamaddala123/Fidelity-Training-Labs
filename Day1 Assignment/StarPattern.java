/* Generate the following pattern
 *
 * *
 * * *
 * * * * */
package Com.Day1Assignment;
import java.util.*;

public class StarPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines of pattern you want : ");
        int rows = sc.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}