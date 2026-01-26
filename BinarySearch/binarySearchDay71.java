package BinarySearch;

public class binarySearchDay71 {

    public static int searchInsert(int nums[],int target){
        int l=0;
        int h=nums.length-1;

        while(l<=h){
            int mid=l+(h-l)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
               l=mid+1;
            }else{
                h=mid-1;
            }
        }

        return l;
    }
    public static void main(String []args){
       //1.Search Insert Position 

       int arr[]={1,3,5,6};
       int tar=5;
       searchInsert(arr, tar);
       System.out.println(searchInsert(arr, tar));
    }
}
