package TOPIC_6_DSA_problems.arrays.P01;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // given array [2,7,11,15]
    // find the indices two number that add to the given target x.
    public static void main(String[] args) {

        int[] arr = {3,7,11,16,50,100,56,88,48,1,9,5,5,6,8,9,7,84,55,55555,444,-3,12};
        int target =9;
        long startTime = System.nanoTime();// -----> to find the execution time.

        int[] res = twoSum(arr,target);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;// -----> to find the execution time.
        System.out.println("Execution time in nanoseconds: " + executionTime);
        System.out.println("Execution time in milliseconds: " + executionTime / 1_000_000);



        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int y = target-arr[i];
            if(hp.containsKey(y)){
                return new int[]{hp.get(y),i};
            }else{
                hp.put(arr[i],i);
            }
        }
        return new int[2];
    }
}
