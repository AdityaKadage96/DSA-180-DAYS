package MergeInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayDay36 {

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res=new ArrayList<>();

        int i=0;
        int j=0;
        while(i<firstList.length && j<secondList.length){
            
            int start=Math.max(firstList[i][0],secondList[j][0]);
            int end=Math.min(firstList[i][1],secondList[j][1]);


            if(start<=end){
                res.add(new int[]{start, end});
            }

            if(firstList[i][1]<secondList[j][1]){
                i++;
            }else{
                j++;
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    public static int nonOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b) -> a[1]-b[1]);

        int count=0;
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            
            if(intervals[i][0] < end){
                count++;
            }else{
                end=intervals[i][1];
            }
        }

        return count;
    }

     public static  int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum=0;

        for(int i=0;i<timeSeries.length-1;i++){
            int gap=timeSeries[i+1]-timeSeries[i];

            if(gap >=duration){
                sum=sum + duration;
            }else{
                sum=sum + gap;
            }
        }

        sum +=duration;

        return sum;
    }
    
    public static List<String> summaryRanges(int[] nums) {
        List<String>res=new ArrayList<>();
        
        if(nums.length == 0) return res;
        int st=nums[0];
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length || nums[i]!=nums[i-1]+1){
                if(st==nums[i-1]){
                    res.add(String.valueOf(st));
                }else{
                    res.add(st +"->" + nums[i-1]);
                }

                if(i< nums.length){
                    st= nums[i];
                }
            }
        }

        return res;
    }

    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sumexp= n*(n+1)/2;
        int actSum=0;

        for(int num :nums){
            actSum += num;
        }

        return sumexp-actSum;
    }

    public static void main(String[]args){
     //1.Interval List intersection
     int[][] firstList  = {{0,2},{5,10},{13,23},{24,25}};
    int[][] secondList = {{1,5},{8,12},{15,24},{25,26}};

    int[][] ans = intervalIntersection(firstList, secondList);

    for(int[] a : ans){
        System.out.println(a[0] + " " + a[1]);
    }

    //Day 37 - Non overlapping intervals

    int [][]arr={{1,2},{2,3},{3,4},{1,3}};
    nonOverlapIntervals(arr);
    System.out.println(nonOverlapIntervals(arr));


    //Day38- Teemo Attacking

    System.out.println("Teemo attacking problem");

    int timeSeries[]={1,4};
    int duration=2;

    findPoisonedDuration(timeSeries, duration);
    System.out.println(findPoisonedDuration(timeSeries, duration));

    //Day 39-Summary Ranges
     int arr9[]={0,1,2,4,5,7};
     List<String>result=summaryRanges(arr9);

     System.out.println(result);


     //Day 40 - Missing Number

     int nums[]={3,0,1};
     missingNumber(nums);
     System.out.println(missingNumber(nums));

    





    }
}
