package Stack;
import java.util.Stack;
public class stackDay46 {
    public static String makeGood(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            int len=sb.length();
            if(len>0 && Math.abs(sb.charAt(len-1)-c)==32){
                sb.deleteCharAt(len-1);
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }

     public static boolean isValid(String s) {
        Stack<Character>t=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('){
               t.push(')');
            }else if(c=='{'){
                t.push('}');
            }else if(c=='['){
                t.push(']');
            }else if(t.isEmpty() || t.pop() !=c){
                return false;
            }
        }

        return t.isEmpty();
    }
    public static void main(String[]args){
        //1.Make the string great
        String s="leEeetcode";
        makeGood(s);
        System.out.println(makeGood(s));

        //Day 48- valid parantheses

        String s2 = "()";
        isValid(s2);
        System.out.println(isValid(s2));


    }
}
