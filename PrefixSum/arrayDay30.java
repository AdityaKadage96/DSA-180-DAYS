package PrefixSum;

import java.util.Arrays;

public class arrayDay30 {
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;

        
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        int totalSum = 0;

        
        for (int len = 1; len <= n; len += 2) {   
            for (int i = 0; i + len <= n; i++) {
                int j = i + len - 1;
                totalSum += prefix[j + 1] - prefix[i];
            }
        }

        return totalSum;
    }

    public static int[] runningSum(int[] nums) {
        int n=nums.length;

        for(int i=1;i<n;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String[]args){
        //1.Sum of all odd length subarray
        int arr[]={1,4,2,5,3};
        sumOddLengthSubarrays(arr);
        System.out.println(sumOddLengthSubarrays(arr));


        //Day31.Running sum of 1d array

        int arr2[]={1,2,3,4};
        runningSum(arr2);
        System.out.println(Arrays.toString(runningSum(arr2)));
        


        
    }
}
