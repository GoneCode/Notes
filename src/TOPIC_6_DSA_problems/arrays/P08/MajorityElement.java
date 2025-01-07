package Arrays.easy.P08;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3,6,6,6,3};
        int res = majorityElement(arr);
        System.out.println(res);
    }

    private static int majorityElement(int[] arr) {

        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = arr.length / 2;

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }
}