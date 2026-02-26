package PriorityQueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;

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

     public static List<String> topKFrequentWords(String[] words, int k) {
        HashMap<String,Integer>mp=new HashMap<>();

        for(String word:words){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }

        PriorityQueue<String>pq=new PriorityQueue<>(
            (a,b) ->{
                if(mp.get(a).equals(mp.get(b))){
                    return a.compareTo(b);
                }

                return mp.get(b)-mp.get(a);
            }
        );

        for(String w:mp.keySet()){
            pq.add(w);
        }

        List<String>result=new ArrayList<>();


        for(int i=0;i<k;i++){
            result.add(pq.poll());
        }

        return result;
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int s:stones){
            pq.offer(s);
        }

        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();

            if(first!=second){
                pq.offer(first-second);
            }
        }

        if(pq.isEmpty()){
            return 0;
        }else{
            return pq.poll();
        }
    }

    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int g:gifts){
            pq.offer(g);
        }


        while(k-- > 0){
            int max=pq.poll();

            int remain=(int)Math.sqrt(max);
            pq.offer(remain);
        }

        long sum=0;

        while(!pq.isEmpty()){
            sum +=pq.poll();
        }

        return sum;
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

    //Day 94-Top K frequent words
    String words[]={"i","love","leetcode","i","love","coding"};
    int k4=2;
    
     
        List<String> answer = obj.topKFrequentWords(words, k);

       
        System.out.println(answer);

    //Day 95-Last stone weight

    int stones[]={2,7,4,1,8,1};
    int res5=lastStoneWeight(stones);
    System.out.println(res5);


    //Day 96-Take Gifte from the  reachest  pile

    int gifts[]={25,64,9,4,100};
    int k6=2;

    pickGifts(gifts, k6);
    System.out.println(pickGifts(gifts, k6));



    
    

    }
}