package MergeInterval;

import java.util.Arrays;
import java.util.HashSet;

public class arrayDay43 {
    public static int[] plusOne(int[] digits) {
         int n=digits.length;

         for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;

                return digits;
            }

            digits[i]=0;
         }

         int res[]=new int[n+1];
         res[0]=1;

         return res;
    }

    public static int minimumChairs(String s) {
        int curr=0;
        int max=0;


        for(char c : s.toCharArray()){
            
            if(c == 'E'){
                curr++;
            }else{
                curr--;
            }

            max=Math.max(max,curr);
        }

        return max;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character>set=new HashSet<>();
        int count=0;
        for(char c:jewels.toCharArray()){
            set.add(c);
        }

        for(char c:stones.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }

        return count;
    }
    public static void main(String[]args){
        //1.Plus one

        int arr[]={1,2,3};
        plusOne(arr);
        System.out.println(Arrays.toString(plusOne(arr)));

        //2.Minimum numbers of chairs in a Waiting
        String s="EEEEEEE";
        minimumChairs(s);
        System.out.println(minimumChairs(s));


        //3.Jewels and stones

      String j="aA";
      String s1="aAAbbbb";
      numJewelsInStones(j,s1);
      System.out.println(numJewelsInStones(j, s));


    }

    
    
    
}
