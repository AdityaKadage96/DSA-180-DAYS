package PriorityQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
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


    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int num=nums[i];

            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }else{
                mp.put(num,1);
            }
        }

        PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return mp.get(b)-mp.get(a);
            }
        });
       
        for(int key:mp.keySet()){
            pq.add(key);
        }
        
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }

        return ans;
    }
    public static void main(String []args){
      //Day 92- Kth largest element in an array
    int nums[]={3,2,1,5,6,4};
    int k=2;
    findKthLargest(nums, k);
    System.out.println(findKthLargest(nums, k));


    //Day 93-Top K frequent Element
    int arr[]={1,1,1,2,2,3};
    int k2=2;
    //topKFrequent(nums, k2);
    
    priorityQueueDay92 obj=new priorityQueueDay92();
    int[] ans = obj.topKFrequent(arr,k2);

    System.out.println(Arrays.toString(ans));
    
    

    }
}