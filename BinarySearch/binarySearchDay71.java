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

    public static int[] searchRange(int[] nums, int target) {
        

        if(nums==null || nums.length==0){
            return new int []{-1,-1};
        }
        int first=findFirst(nums,target);
        int second=findSecond(nums,target);

        return new int[]{first,second};
    }

    

    public static int findFirst(int nums[],int target){
        int l=0;
        int h=nums.length-1;

        int ans=-1;
        while (l<=h){
            int mid=l+(h-l)/2;

            if(nums[mid]==target){
                ans=mid;
                h=mid-1;
            }else if(nums[mid]<target){
                l=mid+1;
            }else {
                h=mid-1;
            }
        }

        return ans;
    }

    public static int findSecond(int nums[], int target){
        int l=0;
        int h=nums.length-1;
        int ans=-1;

        while(l<=h){
            int mid=l+(h-l)/2;

            if(nums[mid]==target){
                ans=mid;
                l=mid+1;

            }else if(nums[mid]<target){
                l=mid+1;
            }else {
                h=mid-1;
            }
        }

        return ans;
    }

    public static int peekElement(int arr[]){
        int low=0;
        int high=arr.length-1;

        while(low<high){
            int mid=low+(high-low)/2;

            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }

        return low;
    }

    public static int peekIdxInMountainArray(int arr[]){
        int low=0;
        int high=arr.length-1;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]<arr[mid+1]){
                low=mid+1;
            }else{
                res=mid;
                high=mid+1;
            }
        }

        return res;
    }
    public static void main(String []args){
       //1.Search Insert Position 

       int arr[]={1,3,5,6};
       int tar=5;
       searchInsert(arr, tar);
       System.out.println(searchInsert(arr, tar));


       //Day 72-2.find first and last position of element in sorted order

       int arr2[]={5,7,7,8,8,10};
       int target=8;
       searchRange(arr2, target);
       System.out.println(searchRange(arr2, target));


       //Day 73-3.find peek elment in an array

       int arr3[]={1,2,3,4,5,6,3,4,2};
       peekElement(arr3);
       System.out.println(peekElement(arr3));


       //Day 74- Peek index in a Mountain array

       int arr4[]={1,2,3,5,3,2};
       peekIdxInMountainArray(arr4);
       System.out.println(peekIdxInMountainArray(arr4));
    }
}
