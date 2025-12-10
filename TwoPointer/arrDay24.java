package TwoPointer;
import java.util.Arrays;
public class arrDay24 {

    public static int[] twoSum(int[] numbers, int target) {
        
        int left=0;
        int right=numbers.length-1;
       
        while(left<right){
            int sum=numbers[left]+numbers[right];
            
            if (sum==target){
                return new int[]{left+1, right+1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }

        return new int[]{};
    }

    public static String reverseWords(String s) {
        s=s.trim();
        StringBuilder result=new StringBuilder();

        int i=s.length()-1;

        while(i>=0){

            while(i>=0 && s.charAt(i)==' '){
                i--;
            }

            if(i<0) break;

            int j=i;

            while(j>=0 && s.charAt(j) !=' '){
                j--;
            }

            result.append(s.substring(j+1,i+1));

            result.append(" ");

            i=j-1;
        }

        return result.toString().trim();
    }
    public static void main(String[]args){
       //1.Two sum II - Input array is sorted

       int arr[]={2,7,11,15};
       int target=9;
       int result[] =twoSum(arr, target);
       System.out.println(Arrays.toString(result));

       //2.Reverse words in string
       String s="hello programmers";
       reverseWords(s);
       System.out.println(reverseWords(s));

    }
}
