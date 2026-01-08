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

    public static int minOperations(String[] logs) {
        int step=0;

        for(String l:logs){
            if(l.equals("../")){
                if(step > 0){
                    step--;
                }
            }else if(!l.equals("./")){
                step++;
            }
        }

        return step;
    }

     public static int maxDepth(String s) {
        int depth=0;
        int max=0;

        for(char ch:s.toCharArray()){
           if(ch=='('){
              depth++;
              max=Math.max(max,depth);
           }else if(ch == ')'){
            depth--;
           }
        }

        return max;
    }
    public static void main(String[]args){
        // Day50 -1. Final value of variable after peroforming operation
        String s[]={"--X","X++","X++"};
        finalValueAfterOperations(s);
        System.out.println(finalValueAfterOperations(s));

        // Day51 -2.Remove Outermost parantheses

        String s2 = "(()())(())";
        removeOuterParentheses(s2);
        System.out.println(removeOuterParentheses(s2));


        //3. Day 52-Crawler Log Folder

        String s3[]={"d1/","d2/","./","d3/","../","d31/"};

        minOperations(s3);
        System.out.println(minOperations(s3));

        //Day 53-Maximum depth of nesting parenthesis

        String  s4="(1+(2*3)+((8)/4))+1";
        maxDepth(s4);
        System.out.println(maxDepth(s4));
    }
}
