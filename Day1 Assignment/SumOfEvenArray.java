/* Find the sum of even numbers in an integer array*/
package Com.Day1Assignment;
import java.util.*;

public class SumOfEvenArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int num:arr){
            if (num%2 == 0){
                sum += num;
            }
        }
        System.out.println("The sum of Even numbers in the given array : " +sum);
    }
}