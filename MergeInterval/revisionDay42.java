package MergeInterval;

import java.util.HashSet;

public class revisionDay42 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();

        for(int n:nums){
            if(set.contains(n)){
                return true;
            }

            set.add(n);
        }

        return false;
    }
    public static void main(String[]args){

    //revision Day 42- day36, day37,day38, day39, day40, day41 

    //Day 36 leetcode- 1.Interval List intersection
    //Day 37 - Non overlapping intervals
    //Day38- Teemo Attacking
    //Day 39-Summary Ranges
    //Day 40 - Missing Number
    //Day 41- Number of good pairs



    //Day 42-Contains Duplicate
      int arr[]={1,2,3,1};
      containsDuplicate(arr);

      System.out.println(containsDuplicate(arr));

      
    }
}
