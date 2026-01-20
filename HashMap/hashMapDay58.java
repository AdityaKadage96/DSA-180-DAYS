package HashMap;

import java.util.HashMap;
import java.util.HashSet;
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

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        HashSet<Integer>set=new HashSet<>();

        for(int freq:mp.values()){
            if(!set.add(freq)){
                return false;
            }
        }

        return true;
    }

    public static int luckyNumber(int arr[]){
        HashMap<Integer,Integer>mp=new HashMap<>();
        int luckyInt=-1;
        
        for(int n:arr){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }

        for(int k:mp.keySet()){
            if(k==mp.get(k)){
                luckyInt=Math.max(luckyInt,k);
            }
        }
        return luckyInt;
    }

     public static boolean checkIfPangram(String sentence) {
        HashMap<Character,Boolean>mp=new HashMap<>();

        for(char c:sentence.toCharArray()){
            mp.put(c,true);
        }

        return mp.size()==26;
    }

    public static char findTheDifference(String s, String t) {
        HashMap<Character,Integer>mp=new HashMap<>();

        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        

        for(char c:t.toCharArray()){
            if(!mp.containsKey(c) || mp.get(c)==0){
                return c;
            }
            mp.put(c,mp.get(c)-1);
        }

        return ' ';
    }

    public static boolean checkOccurancesofCharacter(String s){
        HashMap<Character,Integer>mp=new HashMap<>();

        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        int firstCount=-1;

        for(int count:mp.values()){
            if(firstCount==-1){
                firstCount=count;
            }else if(count!=firstCount){
                return false;
            }
        }

        return true;


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

       //Day 61-Unique Number of occureances
       int arr[]={1,2,2,1,1,3};
       uniqueOccurrences(arr);
       System.out.println(uniqueOccurrences(arr));

       //Day 62-Find lucky integer in an Array
       int arr2[]={2,2,3,4};
       luckyNumber(arr2);
       System.out.println(luckyNumber(arr2));

       //Day 63-Check if the Sentence is Pangram
       String sentence = "thequickbrownfoxjumpsoverthelazydog";
       checkIfPangram(sentence);
       System.out.println(checkIfPangram(sentence));

       //Day 64- find the differnce

        String s5 = "abcd";
        String t = "abcde";

        findTheDifference(s5, t);
        System.out.println(findTheDifference(s5, t));

        //Day 65- Check if all string have equal number of occurances
        String s8 = "abacbc";
        checkOccurancesofCharacter(s8);
        System.out.println(checkOccurancesofCharacter(s8));
        




    }
}
