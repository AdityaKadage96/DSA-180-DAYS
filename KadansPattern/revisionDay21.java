package KadansPattern;

public class revisionDay21 {
     
     public static int maxProduct(int[] nums) {
        int minEnding=nums[0];
        int maxEnding=nums[0];
        int result=nums[0];

        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=minEnding*nums[i];
            int v3=maxEnding*nums[i];

            maxEnding=Math.max(v1,Math.max(v2,v3));
            minEnding=Math.min(v1,Math.min(v2,v3));

            result=Math.max(result,maxEnding);
        }

        return result;
    }

    public static void main(String[]args){
        //Day 21 -Revision day

        //Week 3- day15, day16,day17,day18,day19,day20

        //day15
        //1.Longest substring without repeating character
        //2.Longest substring with same letters after replacement

        //day16
        //1.Minimum window substring

        //day17
         //Linkedlist functionality implementaion
         //1.insertAtHead
         //2.insertAtTail
         //3.insertAtIdx
         //4.deleteAtHead
         //5.deleteAtTail
         //6.deleteAtIdx
         //7.display ll
         //8.Size of linked list
         //9.Search element in ll -boolean function
         //10.Search element in ll- int function

         //Day 18
           //Fast Slow pointer Revision
          //leetcode - Happy Number

        //Day 19
           //Leetcode Find dubplicate Number

        //Day 20
          //Kadans Pattren
          //1.Maximum subarray sum
          //2.Minimum subarray sum

        //Day 21 All above days revision

        int arr[]={-2,3,-4};

        maxProduct(arr);
        System.out.println(maxProduct(arr));
       
    



    }
}
