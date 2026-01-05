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
    public static void main(String[]args){
        //1. Final value of variable after peroforming operation
        String s[]={"--X","X++","X++"};
        finalValueAfterOperations(s);
        System.out.println(finalValueAfterOperations(s));
    }
}
