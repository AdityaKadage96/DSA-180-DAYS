package PrefixSum;

public class arrayDay26 {

    public static int subarraysDivByK(int[] nums, int k) {
        
        int pref=0;
        int count=0;

        int freq[]=new int[k];
        freq[0]=1;

        for(int x:nums){
            pref=pref+x;

            int mod=pref % k;

            if(mod<0) mod +=k;

            count +=freq[mod];
            freq[mod]++;
        }

        return count;
    }
    public static void main(String[]args){
       
        //1.Subarray sum divisible by k

          int arr[]={4,5,0,-2,-3,1};
          int k=5;
          subarraysDivByK(arr, k);
          System.out.println(subarraysDivByK(arr, k));
    }
}
