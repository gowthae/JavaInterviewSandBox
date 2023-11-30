package StringProblems;

import java.util.HashSet;
import java.util.Set;

public class ReverseEachWord {
    public static String reverseEachWord(String stringValue){
        String[] words = stringValue.split("//s+");
        StringBuilder sb1 = new StringBuilder();
        //Set<String> setNew = new HashSet<>();
        for(String word:words){
            sb1.append(word).reverse().append(" ");
        }
        return sb1.toString();

    }
    public static void main(String[] args) {
        String inputValue = "test123 each word";
        System.out.println(reverseEachWord(inputValue));
    }
}
