package BinarySearch;

import java.util.Arrays;
class GuessGame {
    // This is the number to be guessed
    private int pick = 6;   //change this value to test

    // Guess API
    int guess(int num) {
        if (num > pick) return -1;
        if (num < pick) return 1;
        return 0;
    }
}

 class Solution extends GuessGame {

    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


}

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

    public static int findMin(int arr[]){
        int low=0;
        int high=arr.length-1;
        int n=arr.length;

        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]>arr[n-1]){
                low=mid+1;
            }else{
                res=mid;
                high=mid-1;
            }
        }

        return arr[res];
    }

     public static int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        while(low <=high){
            int guess=(low+high)/2;

            if(nums[guess]==target){
                return guess;
            }

            if(nums[guess]>nums[high]){
                if(nums[guess]<target){
                    low=guess+1;
                }else{
                    if(nums[low]>target){
                        low=guess+1;
                    }else{
                        high=guess-1;
                    }

                    
                }
            }else{
                 if(nums[guess]>target){
                    high=guess-1;
                }else{
                   if(nums[high]<target){
                      high=guess-1;
                   }else{
                      low=guess+1;
                    }
                }
            }

         
        }

        return -1;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low=1;

        int high=0;

        for(int n:piles){
            high=Math.max(high,n);
        }

        while(low<=high){
            int mid=low + (high-low)/2;
            long hrs=0;

            for(int n:piles){
                hrs += (n+mid-1)/mid;
            }

            if(hrs<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return low;
    }

    public static boolean isPerfectSquare(int num) {
        long low=0;
        long high=num;

        while(low<=high){
            long mid=low+(high-low)/2;
            long sqr=mid*mid;

            if(sqr==num){
                return true;
            }else if(sqr<num){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return false;
    }

    public static int arrangCoins(int n){
        long low=0;
        long high=n;
        while(low<=high){
            long mid=low + (high-low)/2;
            long coin=mid*(mid+1)/2;
            
            if(coin == 0){
                return (int) mid;
            }else if(coin <=high){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }

        return (int) high;
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int low=0;
        int high=letters.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(letters[mid]<=target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return letters[low % letters.length];

    }

    public static boolean checkIfExist(int arr[]){
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int target=arr[i]*2;

            int low=0;
            int high=arr.length-1;

            while(low<=high){
                int mid=low+(high-low);

                if(arr[mid]==target && mid!=i){
                    return true;
                }else if(arr[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }

     public static int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int missing=arr[mid]-(mid+1);

            if(missing<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return low+k;
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

    //    int arr4[]={1,2,3,5,3,2};
    //    peekIdxInMountainArray(arr4);
    //    System.out.println(peekIdxInMountainArray(arr4));


       //Day 75-Find minimum in rotated sorted array

       int arr5[]={3,4,5,1,2};
       findMin(arr5);
       System.out.println(findMin(arr5));


       //Day 76-Search in rotated sorted array
       int arr6[]={4,5,6,7,0,1,2};
       int tar1=0;
       
       search(arr6, target);
       System.out.println(search(arr6, target));

       //Day 77- Koko eating Banana
       int arr7[]={3,6,7,11};
       int hrs=8;
       minEatingSpeed(arr7, hrs);
       System.out.println(minEatingSpeed(arr7, hrs));


       //Day 78- Guess Number Higher or Lower

        Solution sol = new Solution();
        int n = 10;

        int result = sol.guessNumber(n);
        System.out.println("Guessed Number: " + result);


        //Day 79-valid perfect square
        int num = 16;
        isPerfectSquare(num);
        System.out.println(isPerfectSquare(num));

        //Day 80- Arrange Coins

        int n1=5;
        arrangCoins(n1);
        System.out.println(arrangCoins(n1));


        //Day 81-Find smallest letter greater than target

        char letters[] = {'c', 'f', 'j'};
        char targ = 'j';

        nextGreatestLetter(letters, targ);
        System.out.println(nextGreatestLetter(letters, targ));

        //Day 82-Check if N and its duplicat exist

        int arrN[]={10,2,5,3};
        checkIfExist(arrN);
        System.out.println(checkIfExist(arrN));


        //Day 83- Kth missing positive number
        int arrKth[]={2,3,4,7,11};
        int k=5;
        findKthPositive(arrKth, k);
        System.out.println(findKthPositive(arrKth, k));

        
       
    }
}
