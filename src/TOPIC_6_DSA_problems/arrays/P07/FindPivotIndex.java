package easy.P07;

public class FindPivotIndex {

    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};
        int res = pivotIndex(arr);
        System.out.println(res);
    }
    public static int pivotIndex(int[] arr){

        int totalSum =0;
        for(int n:arr){
            totalSum+=n;
        }
        int leftSum=0;
        for(int i=0;i<arr.length;i++){
            if(leftSum == totalSum-leftSum-arr[i]){
                return i;
            }
            leftSum +=arr[i];
        }
        return -1;
    }
}
