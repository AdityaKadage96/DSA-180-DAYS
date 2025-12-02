package SlidingWindow;

public class arrayDay16 {

    public static String minWindow(String s,String t){

        if(t.length()>s.length()){
            return " ";
        }
         int need[]=new int [128];
        int window[]=new int[128];

        for(char ch:t.toCharArray()){
            need[ch]++;
        }

        int required=0;
        
        for(int x:need){
            if(x>0) required++;
        }

        int formed=0;
        int left=0;

        int minLen=Integer.MAX_VALUE;
        int start=0;

        for(int right=0;right<s.length();right++){
            
            char ch=s.charAt(right);
            window[ch]++;

            if(need[ch]>0 && window[ch]==need[ch]){
                formed++;
            }

            while(formed==required){

                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }

                char leftChar=s.charAt(left);
                window[leftChar]--;

                if(need[leftChar] >0 && window[leftChar]<need[leftChar]){
                    formed--;
                }

                left++;
            }
            
            
            
        }

        if(minLen==Integer.MAX_VALUE) return " ";
        return  s.substring(start, start+minLen);
    }
    public static void main(String[]args){
        //1.Minimum window substring

        String s="ADOBECODEBANC";
        String t="ABC";

        minWindow(s, t);

        System.out.println(minWindow(s, t));


       
    }
}
