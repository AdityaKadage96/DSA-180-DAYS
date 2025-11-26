package TwoPointer;

import java.util.*;
public class arrayDay10 {

    public static List<List<Integer>> tripletSum(int[]nums){
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        
        for(int i=0;i<nums.length-2;i++){
            
            if(i>0 && nums[i]==nums[i-1]) continue;

            int left=i+1;
            int right=nums.length-1;

            while(left<right){

                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while(left<right && nums[left]==nums[left+1])
                        left++;

                    while(left<right && nums[right]==nums[right-1])
                        right--;

                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return result;
    }

    public static int threeSumClosest(int []nums,int target){
        
        Arrays.sort(nums);
        int closest=nums[0]+nums[1]+nums[2];

        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                
                int diff=Math.abs(target-sum);
                int max_diff=Math.abs(target-closest);

                if(diff<max_diff){
                    closest=sum;
                }

                if(sum==target){
                    return target;
                }
                else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return closest;
    }

    public static int threeSumSmaller(int nums[],int target){
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length-2;i++){
              int left=i+1;
              int right=nums.length-1;

              while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum<target){
                    count+=(right-left);
                    left++;
                }else{
                    right--;
                }
              }
        }
        return count;
    }
    public static void main(String[]args){
     
    //1.Triplet sum to zero 
    int arr[]={-4, -1, -1, 0, 1, 2};

    tripletSum(arr);
    System.out.println(tripletSum(arr));


    //2.Triplet sum closest to target
    int[] arr2 = {-1, 2, 1, -4};

    threeSumClosest(arr2, 1);
    System.out.println(threeSumClosest(arr2, 1));

   //3.Triplet smaller than target
    int arr3[]={-2,0,1,3};
    threeSumClosest(arr3, 2);
    System.out.println(threeSumClosest(arr3, 2));










    }
}
