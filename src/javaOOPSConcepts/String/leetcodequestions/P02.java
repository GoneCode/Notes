package javaOOPSConcepts.String.leetcodequestions;

public class P02 {
    //Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(strStr(haystack, needle)); // Output: 6
    }
    public static int strStr(String hayStack, String needle){
       if(needle.length()==0)return 0;
       if(hayStack.length()<needle.length())return -1;
       for(int i=0;i<=hayStack.length()-needle.length();i++){
           if(hayStack.substring(i,i+needle.length()).equals(needle))return i;
       }
       return -1;
    }
}
