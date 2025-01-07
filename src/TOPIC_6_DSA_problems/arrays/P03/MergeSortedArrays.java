package Arrays.easy.P03;

import java.util.Arrays;

public class MergeSortedArrays {

    //You are given two integer arrays nums1 and nums2,sorted in non-decreasing order, and
    // two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    // The final sorted array should not be returned by the function, but instead be stored inside the array nums1.

    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        merge(num1,3,num2,3);
        mergeUsingSort(num1,3,num2,3);
        System.out.println(Arrays.toString(num1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i >= 0 && j >= 0) {
            System.out.println("i: " + i + ", j: " + j + ", k: " + k);
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
            System.out.println(Arrays.toString(nums1));
            System.out.println();
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
    public static void mergeUsingSort(int[] nums1, int m, int[] nums2, int n) {

        for(int j=0,i=m;j<n;j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
