package MergeInterval;

import java.util.Arrays;

public class revisiDay35 {
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));

        int startArrow=1;
        int end=points[0][1];

        for(int i=1;i<points.length;i++){

            if(points[i][0]>end){
                startArrow++;
                end=points[i][1];
            }
        }

        return startArrow;
    }
    public static void main(String[]args){

        //Week 5- day 29, day 30, day 31, day 32, day 33, day 34, day 35

        //Day 29- Prefix Sum
          //1.Left and Right Sum Differences
          //2.Find the middle index in array

        //Day 30 - Prefix sum
           //1.Sum of all odd length subarray
        
           //Day31.Running sum of 1d array

           //Day32. Contiguos array

           //Day33- Minimum value to get Positive step by step Sum

        //Day 34 - Merge Interval
           //1.Merge Intervals


        //Day-35
        //1.Minimum Number of Arrow to burst ballone

        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        findMinArrowShots(arr);
        System.out.println(findMinArrowShots(arr));
    }
}
