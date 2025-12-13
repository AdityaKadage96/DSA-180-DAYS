package PrefixSum;

import java.util.Arrays;

public class arrayDay27 {

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int sum[]=new int [n];

        prefix[0]=0;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1] + nums[i-1];
        }

        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum +=nums[i];
        }

        for(int i=0;i<n;i++){
            int left=nums[i]*i-prefix[i];
            int right=(totalSum-prefix[i]-nums[i])-nums[i]*(n-i-1);
            sum[i]=left+right;
        }

        return sum;
    }

    public static int largestAltitude(int[] gain) {
        int altitude=0;
        int maxAlt=0;

        for(int x:gain){
            altitude +=x;
            maxAlt=Math.max(maxAlt,altitude);
        }

        return maxAlt;
    }
    public static void main(String[]args){
        //1.Sum of absolute differnce in sorted array
        int arr[]={2,3,5};
        getSumAbsoluteDifferences(arr);
        System.out.println(Arrays.toString(getSumAbsoluteDifferences(arr)));

        //2.find the highest altitude
        int arr2[]={-5,1,5,0,-7};
        largestAltitude(arr2);
        System.out.println(largestAltitude(arr2));
    }
}
