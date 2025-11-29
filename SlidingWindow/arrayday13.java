package SlidingWindow;

public class arrayday13 {

     public static  int maxSubarraySum(int[] arr, int k) {
       
        int n=arr.length;
        int low=0;
        int high=k-1;
        
        int sum=0;
        for(int i=low;i<=high;i++){
            sum +=arr[i];
        }
        
        int result=0;
        
        
        while(high<n){
            result=Math.max(result,sum);
            
            low++;
            high++;
            
            if(high==n) break;
            
            sum=sum-arr[low-1];
            
            sum=sum+arr[high];
        }
        
        return result;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int n=nums.length;
        int sum=0;
        
        int result=Integer.MAX_VALUE;
        while(high<n){
            
            sum=sum+nums[high];

            while(sum >=target){

                int len=high-low+1;

                result=Math.min(result, len);

                sum=sum-nums[low];
                low++;
            }

            high++;
        }

        return result==Integer.MAX_VALUE ? 0 : result;
    }
    public static void main(String[]args){
     
        //1.Max sum subarray of size k

        int arr[]={1,2,3,4,4};

        maxSubarraySum(arr, 2);

        System.out.println(maxSubarraySum(arr, 2));
        //2.Minimum size subarray sum

         int arr2[]={1,2,3,4,4};

         minSubArrayLen(4, arr2);
         System.out.println(minSubArrayLen(4, arr2));

    }
}
