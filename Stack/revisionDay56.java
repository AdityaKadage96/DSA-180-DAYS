package Stack;
public class revisionDay56 {
    public static String clearDigits(String s) {
        StringBuilder st=new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                st.deleteCharAt(st.length()-1);
            }else{
                st.append(c);
            }
        }

        return st.toString();
    }
    public static void main(String[]args){
         // Day50 -1. Final value of variable after peroforming operation

         // Day51 -2.Remove Outermost parantheses

         // Day52-Crawler Log Folder

         //Day 53-Maximum depth of nesting parenthesis

          //Day 54 -Minimum add to make parenthesis valid
        
          //Day 55-Build an array with  stack operation

        //Day 56- revision day-
            //leetcode Clear Digits

            String s="cb34";
            clearDigits(s);
            System.out.println(clearDigits(s));
    }
}
