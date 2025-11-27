package TwoPointer;

import java.util.Arrays;
public class arrayDay11 {
    public static void dutchNationalFlagAlgo(int [] arr){
        int low=0,mid=0,high=arr.length-1;

        while(mid<=high){

            if(arr[mid]==0){
                swap(arr,low ,mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static boolean isPalindrome(String s){
        int left =0;
        int right=s.length()-1;

        while(left<right){

            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;

                continue;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static String stringReverse(String s){
        char[]arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;

        while(i<j){

            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        return new String(arr);
    }

    public static boolean isPalindrome2(String s,int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    public static boolean validPalindromeII(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return isPalindrome2(s,i+1,j)||isPalindrome2(s,i,j-1);
            }
        }

        return true;
    }

    
    public static void main(String[]args){

        //1.Dutch National Flag
        int arr[]={2,0,2,1,1,0};
        dutchNationalFlagAlgo(arr);

        System.out.println(Arrays.toString(arr));

        //2.Valid Palindrome

        String s="A man, a plan, a canal: Panama";

        isPalindrome(s);

        System.out.println(isPalindrome(s));


        //3.Reverse String 

        String s1="Hello";

        //Reverse string using simple loop

        for(int i=s.length()-1;i>=0;i--){
            s1 += s.charAt(i);
        }

        stringReverse(s1);

        System.out.println(stringReverse(s1));

        //4.Valid palindrome ||

        String s4="abca";

        validPalindromeII(s4);

        System.out.println(validPalindromeII(s4));











    }
}
