package PrefixSum;

import java.util.HashMap;

public class revisionDay28 {

    public static int sumOfUnique(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[]args){
        //Week 4- day 22,day23, day24, day25,day26, day27,day 28

        //day22-Kadans algorithm
        //1.Maximum subarray sum with one deletion

        //day23
        //1.Maximum absolute Sum of any subarray
        //2.Maximum sum circular subarray

        //day24
         //1.Two sum II - Input array is sorted
         //2.Reverse words in string

        //day25 - Prefix sum
         //1.Find pivot point
         //2.Subarray Sum equals k

        //day26-Prefix Sum
         //1.Subarray sum divisible by k

        //day27-Prefix Sum
         //1.Sum of absolute differnce in sorted array
          //2.find the highest altitude

        //day28-leetcode
         //1.Sum of unique element
        int arr[]={1,2,3,2};
        sumOfUnique(arr);
        System.out.println(sumOfUnique(arr));


         

        



    }
}
