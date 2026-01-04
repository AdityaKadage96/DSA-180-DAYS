
package Stack;

import java.util.Stack;
class revisionDay49{

    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1= new Stack<>();
        Stack<Character> s2= new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='#' && !s1.isEmpty()){
                s1.pop();
            }else if(c!='#'){
                s1.push(c);
            }
        }

        for(char c:t.toCharArray()){
             if(c=='#' && !s2.isEmpty()){
                s2.pop();
            }else if(c!='#'){
                s2.push(c);
            }
        }

        return s1.equals(s2);
    }
    public static void main(String[]args){
        //day43,day44,day45, day46, day47, day48, day49, 

        //day43- 1.Plus one

        //day 44- 2.Minimum numbers of chairs in a Waiting

        //day45- 3.Jewels and stones

        //day46- //1.Stack implementation by using array

                 //2. remove duplicate

       //day 47-  //1.Make the string great

       //Day 48- valid parantheses

       //Day 49- Backspace string compare
        String s="ab#c";
        String t="ad#c";
        backspaceCompare(s, t);
        System.out.println(backspaceCompare(s, t));
    }
}