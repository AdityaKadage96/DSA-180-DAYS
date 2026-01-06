package Stack;

public class stackDay50 {

    public static int finalValueAfterOperations(String[] operations) {
        int x=0;

        for(String o: operations){

           if(o.charAt(1)=='+') {
             x++;
           }else{
            x--;
           }
        }

        return x;
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder res= new StringBuilder();

        int op=0;

        for(char c: s.toCharArray()){

            if(c=='('){
                if(op > 0){
                    res.append(c);
                }

                op++;
            }else{

                 op--;
                if(op > 0){
                   
                    res.append(c);
                }
            }
        }

        return res.toString();
    }
    public static void main(String[]args){
        //1. Final value of variable after peroforming operation
        String s[]={"--X","X++","X++"};
        finalValueAfterOperations(s);
        System.out.println(finalValueAfterOperations(s));

        //2.Remove Outermost parantheses

        String s2 = "(()())(())";
        removeOuterParentheses(s2);
        System.out.println(removeOuterParentheses(s2));
    }
}
