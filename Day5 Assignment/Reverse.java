/* Jona and Helen are playing a game,when one person says a sentence in English ,
the other person should repeat the sentence in the reverse order. One who does it
perfectly gets a score. Write a Java program to help them found whether the sentence is
reversed perfectly. Get the input string from the user and display the phrase in reverse
order */
package Com.Day5Assignment;


import java.util.Scanner;

public class Reverse {
    public static String reverseWords(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reverse = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            reverse.append(words[i]);
            if(i != 0){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        String rev= reverseWords(input);
        System.out.println(rev);
    }
}
