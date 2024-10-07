/* Passing array as an argument to a function - Imagine you have a function that calculates the average
of a collection of numbers. How would you design the function to accept the collection of numbers
as input, and returns average as output? */
package Com.Day1Assignment;

public class Average {
    public static double calculateAverage(int[] numbers){
        if(numbers.length == 0){
            return 0;
        }
        int sum = 0;
        for(int number : numbers){
            sum+=number;
        }
        return (double)sum/numbers.length;
    }
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        double average = calculateAverage(numbers);
        System.out.println(average);
    }
}