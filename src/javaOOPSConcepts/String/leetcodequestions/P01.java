package javaOOPSConcepts.String.leetcodequestions;

public class P01 {

    //Valid Palindrome
    //A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    // it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindromeCheckUsingRegex(s)); // true
    }

    public static boolean isPalindrome(String s) {
        String result="";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                result = result+c;
            }
        }
        int left = 0;
        int right = result.length() - 1;
        while(left < right){
            if(result.charAt(left)!= result.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static boolean isPalindromeCheckUsingRegex(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left)!= s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
