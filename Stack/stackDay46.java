package Stack;

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
    public static void main(String[]args){
        //1.Make the string great
        String s="leEeetcode";
        makeGood(s);
        System.out.println(makeGood(s));
    }
}
