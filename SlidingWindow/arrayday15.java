package SlidingWindow;

import java.util.HashSet;

public class arrayday15 {

    public static  int lengthOfLongestSubstring(String s) {
        int left=0;
        int resLen=0;
        
        HashSet<Character>set=new HashSet<>();

        for(int right=0;right<s.length();right++){
            
            char ch=s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            resLen=Math.max(resLen,right-left+1);
        }

        return resLen;
    }

    public static int characterReplacement(String s, int k) {
        
        int freq[]=new int[26];
        int left=0;
        int maxFreq=0;

        int maxLen=0;

        for(int right=0;right<s.length();right++){

            freq[s.charAt(right)-'A']++;

            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);

            while((right-left+1)-maxFreq > k){
                freq[s.charAt(left)-'A']--;

                left++;
            }

            maxLen=Math.max(maxLen,right-left+1);
        }

        return maxLen;
    }
    public static void main(String[]args){
        //1.Longest substring without repeating character

        String s = "abcabcbb";

        lengthOfLongestSubstring(s);

        System.out.println(lengthOfLongestSubstring(s));

        //2.Longest substring with same letters after replacement

        String s1 = "AABABBA";
        int k = 1;

        characterReplacement(s1,k);

        System.out.println(characterReplacement(s1, k));

    }
}
