package StringProblems;

import java.util.Scanner;

public class StringConcat {
    //Function for concatenating two strings
    public static String stringConcatOp(String inputOne, String inputTwo){
        return inputOne+" "+inputTwo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputOneValue = sc.nextLine();
        String inputTwoValue = sc.nextLine();
        System.out.println(stringConcatOp(inputOneValue,inputTwoValue));


    }
}
