/* Generate the following pattern
1
1 2
1 2 3
1 2 3 4 */
package Com.Day1Assignment;
import java.util.*;

public class NumberPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want : ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}