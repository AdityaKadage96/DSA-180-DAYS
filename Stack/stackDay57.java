package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class stackDay57 {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map=new HashMap<>();
        Stack<Integer>st=new Stack<>();

        for(int x:nums2){
            while(!st.isEmpty() && st.peek()< x){
                map.put(st.pop(), x);
            }
            st.push(x);
        }

        for(int i=0;i<nums1.length;i++){
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }

        return nums1;
    }
    public static void main(String[]args){
       //Day 57
       //1.Next greater element
       int arr1[]={4,1,2};
       int arr2[]={1,3,4,2};
       nextGreaterElement(arr1, arr2);

       int []res=nextGreaterElement(arr1, arr2);
       
       for(int i=0;i<res.length;i++){
           System.out.print(res[i]+" ");
       }
    }
}
