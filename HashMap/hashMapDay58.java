package HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashMapDay58 {

    public static int firstUniqChar(String s) {
        Map<Character,Integer>map=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                   return i;
            }
        }

        return -1;
    }
      public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

       
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : ransomNote.toCharArray()) {

            if (map.getOrDefault(c, 0) == 0) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        return true;
    }

    public static int longestPalindrome(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();

        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        int len=0;
        boolean hOdd=false;

        for(int co : mp.values()){
            if(co%2==0){
                len += co;
            }else{
                len += co-1;
                hOdd=true;
            }
        }

        if(hOdd){
            len +=1;
        }

        return len;
    }
    public static void main(String[]args){
        //Day 58- First uniqu character in String

       String s = "leetcode";
       firstUniqChar(s);
       System.out.println(firstUniqChar(s));

       //Day 59- Ransom Node
       String ransomNote = "a";
       String magazine = "b";
       canConstruct(ransomNote, magazine);
       System.out.println(canConstruct(ransomNote, magazine));

       //Day 60- longest palindrom
       String s6 = "abccccdd";
       longestPalindrome(s6);
       System.out.println(longestPalindrome(s6));


    }
}
