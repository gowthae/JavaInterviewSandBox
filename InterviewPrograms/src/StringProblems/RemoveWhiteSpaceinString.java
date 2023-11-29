package StringProblems;

import java.util.Scanner;

public class RemoveWhiteSpaceinString {
    public static String removeWhiteSpace(String inputString){
        String resultString = inputString.replaceAll("\\s","");
        return resultString;
    }
    public static void main(String[] args) {
        System.out.println("Program to remove white space in an given string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeWhiteSpace(input));
    }
}
