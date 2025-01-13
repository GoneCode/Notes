package javaOOPSConcepts.String.leetcodequestions;

public class P03 {
    public static void main(String[] args) {
        //Longest Common Prefix
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs)); // Output: "fl"
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null) return "";
        String prefix = strs[0];
        for(int i =1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
