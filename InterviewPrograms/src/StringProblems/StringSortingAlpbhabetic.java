package StringProblems;

import java.util.Arrays;

public class StringSortingAlpbhabetic {

    /*
    Method 1 - Using sort method
     */
    public static String sortAlp(String input){
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    public static String sortingAlp(String input){
        char temp;
        char[] charArrayOne = input.toCharArray();
        for (int i = 0; i <input.length();i++){
            for(int j=i+1;j<input.length();j++){
                if(charArrayOne[i]>charArrayOne[j]){
                    temp = charArrayOne[i];
                    charArrayOne[i] = charArrayOne[j];
                    charArrayOne[j] = temp;
                }
            }
        }
        return new String(charArrayOne);
    }
    /*
    Method 2 - Using without sort method
     */
    public static void main(String[] args) {
        System.out.println("=================");
        System.out.println("String reorder in alphabetical order");
        String inputString = "testOne";

        System.out.println(sortAlp(inputString));
        System.out.println(sortingAlp(inputString));
    }
}
