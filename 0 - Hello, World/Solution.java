import java.util.Scanner;

/*
In this challenge, we review some basic concepts that will get you started with this series. You will need to use the same or similar syntax to read input and write output in challenges throughout HackerRank.

Task: To complete this challenge, you must save a line of input from stdin to a variable, print "Hello, World." on a single line, and print the value of the variable on  second line.

Input Format: A single line of text denoting inputString

Ouput Format: Print Hello, World. on the first line and contents of inputString on the second line.
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}