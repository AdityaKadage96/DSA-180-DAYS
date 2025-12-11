package PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class arrayDay25 {

    public static int pivotIndex(int[] nums) {
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        
        int leftSum=0;

        for(int i=0;i<nums.length;i++){

        if(leftSum==sum-leftSum-nums[i]){
            return i;
        }

         leftSum=leftSum+nums[i];
        }

        return -1;

    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();

        map.put(0,1);
        int prefix=0;
        int count=0;

        for(int x:nums){
            prefix=prefix+x;

            if(map.containsKey(prefix-k)){
                count +=map.get(prefix-k);
            }

            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }

        return count;
    }
    public static void main(String[]args){
        //1.Find pivot point
        int arr[]={1,7,3,6,5,6};
        pivotIndex(arr);
        System.out.println(pivotIndex(arr));

        //2.Subarray Sum equals k

        int arr2[]={1,2,3};
        subarraySum(arr2, 1);

        System.out.println(subarraySum(arr2, 1));

    }
}
