package PrefixSum;

import java.util.Arrays;
import java.util.HashMap;

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

    public static int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();

        int sum=0;
        int maxLen=0;

        map.put(0,-1);

        for(int i=0;i<nums.length;i++){

            if(nums[i]==0){
                sum -=1;

            }else{
                sum +=1;
            }

            if(map.containsKey(sum)){
                maxLen=Math.max(maxLen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }

        return maxLen;
    }

    public static int minStartValue(int[] nums) {
        int sum=0;
        int minSum=Integer.MAX_VALUE;

        for(int num :nums){
            sum +=num;
            minSum=Math.min(minSum,sum);
        }

        if(minSum >=1) return 1;

        return 1-minSum;
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

        //Day32. Contiguos array
        int arr3[]={0,1,0};
        findMaxLength(arr3);

        System.out.println(findMaxLength(arr3));

        //Day33- Minimum value to get Positive step by step Sum

        int arr4[]={-3,2,-3,4,2};

        minStartValue(arr4);
        System.out.println(minStartValue(arr4));



        


        
    }
}
