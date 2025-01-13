package javaOOPSConcepts.String.leetcodequestions;

import java.util.Arrays;

public class P04 {

    public static void main(String[] args) {

        //To reverse a string given as an array of characters in-place with O(1) extra memory.
        String s = "reverse";
        System.out.println(reverseString(s.toCharArray()));

    }
    public static String  reverseString(char[] s){
        int i=0;
        int j=s.length-1;
        while(i<j){
            char temp=s[i];
            s[i] = s[j];
            s[j] =temp;
            i++;
            j--;
        }
        return Arrays.toString(s);
    }
}
