
package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class revisionDay14 {

   public static int longestSubstrignKDistinct(String s,int k){

      if(k==0 || s.length()==0) return 0;

      int left=0;
      int result=0;
      HashMap<Character,Integer>map=new HashMap<>();

      for(int right=0;right<s.length();right++){
         
         char c=s.charAt(right);
         map.put(c,map.getOrDefault(c,0)+1);

         while(map.size()>k){
            char leftChar=s.charAt(left);
            map.put(leftChar,map.get(leftChar)-1);

            if(map.get(leftChar)==0){
               map.remove(leftChar);
            }

            left++;
         }
         int len=right-left+1;
         result=Math.max(result,len);
      }

      return result;
   }

   public static int totalFruitsIntoBasket(int fruits[]){
      int n=fruits.length;
      int left=0;
      int maxLen=0;
      Map<Integer,Integer>freq=new HashMap<>();

      for(int right=0;right<n;right++){
         freq.put(fruits[right],freq.getOrDefault(fruits[right],0)+1);

         while(freq.size()>2){
            int leftFruit=fruits[left];
            freq.put(leftFruit,freq.get(leftFruit)-1);

            if(freq.get(leftFruit)==0){
               freq.remove(leftFruit);
            }

            left++;
         }

         maxLen=Math.max(maxLen,right-left+1);
      }

      return maxLen;
   }
    public static void main(String[]args){
        //Day 14- revision day , week-1, day 8,9,10,11,12,13

        //Day 8:Sorting algorithm
           //1.bubble sort
           //2.selection sort
           //3.Insertion sort
        
        //Day 9:leetcode problem -Squaring sorted array
        //Day 10:Two pointer
           //1.Triplet sum to zero
           //2.Triplet sum to closest to target
           //3.Triplet smaller than target

        //Day 11:Two pointer
           //1.Dutch nationl flag
           //2.Valid palindrom
           //3.Valid palindrome II
           //4.Reverse String

        //Day 12:Two pointer
           //1.Sort Two colors
           //2.Leet code Sort Colors
           //3.Remove the Nth Node from end of list
        
        //Day 13: Sliding window
           //1.Max sum subarray of size k-GFG
           //2.Minimum size subarray sum-Leetcode

        //Day 14- leetcode
          //1.Longest substring with k distinct

          String s="acabd";
          int k=2;
          longestSubstrignKDistinct(s, k);

          System.out.println(longestSubstrignKDistinct(s,k));

          //2.Frutes into basket

          int fruits[]={1,2,1,2,3,2,2,};

          totalFruitsIntoBasket(fruits);

          System.out.println(totalFruitsIntoBasket(fruits));



    }
}
