package StringProblems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
Using 4 method we can proceed
method - 1 : Using java 8
method - 2 : Using indexOf()
method - 3 : Using Character Array
method - 4 : Using Set interface method

 */
public class RemoveDuplicateChar {

    public static StringBuilder removeDuplicateChar(String inputString){

        // Method - 1 : Using Java  method
        StringBuilder sb1 = new StringBuilder();
        inputString.chars().distinct().forEach(c->sb1.append(c));
        System.out.println(sb1);

        // Method - 2 : Using Using indexOf()
        StringBuilder sb2 = new StringBuilder();
        for (int i =0;i<inputString.length();i++){
            char ch = inputString.charAt(i);
            int indx = inputString.indexOf(ch, i+1);
            if(indx==-1){
               sb2.append(ch);
            }
            System.out.println(sb2);
        }
        // Method - 3 : Using Character Array
        
        // Method - 4 : Using Set interface method
        StringBuilder sb4 = new StringBuilder();
        Set<Character> newSet = new HashSet<>();
        for(int i = 0; i<inputString.length();i++){
            newSet.add(inputString.charAt(i));
        }
        for(Character c:newSet){
            sb4.append(c);
        }
        return sb4;

    }
    public static void main(String[] args) {
        System.out.println("Program to remove duplicates in an given string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeDuplicateChar(input));
    }
}
