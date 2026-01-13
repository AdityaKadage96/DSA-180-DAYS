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

    public static void main(String[]args){
        //Day 58- First uniqu character in String

       String s = "leetcode";
       firstUniqChar(s);
       System.out.println(firstUniqChar(s));
    }
}
