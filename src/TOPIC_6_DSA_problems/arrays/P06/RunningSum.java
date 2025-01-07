package Arrays.easy.P06;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1};
        runningSum(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void runningSum(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
}
