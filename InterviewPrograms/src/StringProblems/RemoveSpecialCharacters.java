package StringProblems;

import java.util.Scanner;

public class RemoveSpecialCharacters {
    public static String removeSpecialChar(String inputString){
        String resultString = inputString.replaceAll("[^0-9a-zA-Z]","");
        return resultString;
    }
    public static void main(String[] args) {
        System.out.println("Program to remove special characters in an given string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeSpecialChar(input));
    }
}
