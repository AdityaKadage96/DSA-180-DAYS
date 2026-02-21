package PriorityQueue;

import java.util.PriorityQueue;

public class priorityQueueDay92{
     public static int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer>q=new PriorityQueue<>();

       for(int num:nums){
        q.add(num);
        if(q.size()>k){
            q.poll();
        }
       }

       return q.peek();
    }
    public static void main(String []args){
      //Day 92- Kth largest element in an array
    int nums[]={3,2,1,5,6,4};
    int k=2;
    findKthLargest(nums, k);
    System.out.println(findKthLargest(nums, k));

    }
}