package MergeInterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayDay34 {
    public static int[][] mergeInterval(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]>res=new ArrayList<>();

        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];

            if(end >= start2){
                //start=start;
                end=Math.max(end,end2);
                continue;
            }else{
                res.add(new int[]{start,end});
                start=start2;
                end=end2;
            }

        }
        res.add(new int[] {start,end});

         return res.toArray(new int[res.size()][]);
    }
    public static void main(String[]args){
        //1.Merge Intervals

        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        int[][] result = mergeInterval(arr);
       System.out.println(Arrays.deepToString(result));


    }
}
