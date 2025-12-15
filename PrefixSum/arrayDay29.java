package PrefixSum;

import java.util.Arrays;

public class arrayDay29 {
    public static int [] leftRightDiffSum(int arr[]){
        int n=arr.length;
        int [] sum=new int[n];

        int totalSum=0;
        for(int x:arr){
            totalSum +=x;
        }

        int leftSum = 0;
        for(int i=0;i<n;i++){
            int rightSum=totalSum-leftSum-arr[i];

            sum[i]=Math.abs(leftSum-rightSum);
            leftSum +=arr[i];
        }
        return sum;
    }

    public static int findMiddleIndex(int[] nums) {
        int totSum=0;
        int n=nums.length;
        for(int x:nums){
            totSum +=x;
        }

        int leftSum=0;

        for(int i=0;i<n;i++){
          int rightSum=totSum-leftSum-nums[i];

          if(leftSum==rightSum){
            return i;
          }

          leftSum +=nums[i];
        }

        return -1;
    }
    public static void main(String[]args){
        //1.Left and Right Sum Differences
        int arr[]={10,4,8,3};
        leftRightDiffSum(arr);
        System.out.println(Arrays.toString(leftRightDiffSum(arr)));

        //2.Find the middle index in array
        int arr2[]={2,3,-1,8,4};
        findMiddleIndex(arr2);
        System.out.println(findMiddleIndex(arr2));
    }
}
