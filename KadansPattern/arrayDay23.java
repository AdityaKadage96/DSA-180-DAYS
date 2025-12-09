package KadansPattern;

public class arrayDay23 {
    public static int maxAbsoluteSum(int[] nums) {
        int maxEnd=0;
        int minEnd=0;

        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;

        for(int x:nums){
            maxEnd=Math.max(x,maxEnd+x);
            maxSum=Math.max(maxSum,maxEnd);

            minEnd=Math.min(x,minEnd+x);
            minSum=Math.min(minSum,minEnd);
        }

        int result=Math.max(Math.abs(maxSum),Math.abs(minSum));
        return result;
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int maxEnd=0;
        int minEnd=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        
        for(int x:nums){
            total=total+x;

             maxEnd=Math.max(x,maxEnd+x);
             maxSum=Math.max(maxSum,maxEnd);

             minEnd=Math.min(x,minEnd+x);
             minSum=Math.min(minSum, minEnd);
        }

        if(maxSum<0) return maxSum;

        int result=Math.max(maxSum,total-minSum);

        return result;
    }
    public static void main(String[]args){

        //1.Maximum absolute Sum of any subarray

        int arr1[]={1,-2,3,-2};
        maxAbsoluteSum(arr1);
        System.out.println(maxAbsoluteSum(arr1));

        //2.Maximum sum circular subarray

        int arr[]={1,-2,3,-2};

        maxSubarraySumCircular(arr);
        System.out.println(maxSubarraySumCircular(arr));


    }
}
