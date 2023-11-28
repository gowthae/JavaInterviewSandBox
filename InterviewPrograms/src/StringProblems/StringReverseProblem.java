package StringProblems;

import java.util.Scanner;
/*
Four methods to reverse a string
 1.Using charAt(int index) method
 2.Using toCharArray()
 3.Using StringBuffer
 4.Using StringBuilder
 */

public class StringReverseProblem {
    public static void stringReverse(String input){
            //Method - 1
        //Using charAt(int index) method
        System.out.println("String Reverse Using method 1 charAt() method : ");
        for(int i = input.length()-1;i>=0;i--){
            System.out.print(input.charAt(i));
        }
        System.out.println(" ");

            //Method - 2
        //Using toCharArray() method
        char inputCharArray[] = input.toCharArray();
        System.out.println("String Reverse Using method 2 toCharArray() method : ");
        for(int i = inputCharArray.length-1;i>=0;i--){
            System.out.print(inputCharArray[i]);
        }
        System.out.println(" ");

            //method - 3
        //Using String Buffer
        StringBuffer stringRev = new StringBuffer(input);
        System.out.println("String Reverse Using method 3 String buffer : "+stringRev.reverse());


            //method - 4
        //Using String Builder
        StringBuilder stringReve = new StringBuilder(input);
        System.out.println("String Reverse Using method 4 String builder : "+stringReve.reverse());
        System.out.println(" ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputSting = sc.nextLine();
        stringReverse(inputSting);
    }
}
