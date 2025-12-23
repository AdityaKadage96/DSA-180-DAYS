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
    





    }
}
