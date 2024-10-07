/* Leo has just started to learn about data types. His first assignment is to find out the
largest value that can be stored in a signed byte. write a program to declare a
variable named 'number' of type signed byte, initialize it to 125 and display it.
Change the value of number to the maximum value of a signed byte and display it
as shown in the sample output. */
package Com.Day5Assignment;

public class MaxValue {
    public static void main(String[] args){
        byte number = 125;
        System.out.println("Value of number: " +number);
        number = Byte.MAX_VALUE;
        System.out.println("Largest value stored in a signed byte: " +number);
    }
}
