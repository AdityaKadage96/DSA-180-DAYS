package HashMap;

import java.util.Set;
import java.util.HashSet;
public class revisionDay70 {

    public static char repetedCharacter(String s){
        Set<Character>st=new HashSet<>();

        for(char c:s.toCharArray()){
            if(st.contains(c)){
                return c;
            }

            st.add(c);
        }

        return ' ';
    }
    public static void main(String []args){


     //Day 70- revision Day
     

      //Day 58- First uniqu character in String
      //Day 59- Ransom Node
      //Day 60- longest palindrom
      //Day 61-Unique Number of occureances
      //Day 62-Find lucky integer in an Array
      //Day 63-Check if the Sentence is Pangram
      //Day 64- find the differnce
      //Day 65- Check if all string have equal number of occurances
      //Day 66-Single Number
      //Day 67-Count Number of pairs withe absolute differnce
      //Day 68-Contain duplicate II
      //Day 69-Make Two arrays Equal by reversing subarray


       //Day 70 -leetcode- First letter to appear Twice

       String s = "abccbaacz";
       repetedCharacter(s);
       System.out.println(repetedCharacter(s));
    }
}
