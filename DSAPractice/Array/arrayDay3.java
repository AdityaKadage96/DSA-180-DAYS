package DSAPractice.Array;

import java.util.Scanner;
import java.util.Arrays;
public class arrayDay3 {

   public static void reversArray(int []arr){
     int start=0;
     int end=arr.length-1;
     while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
     }
   }
   public static boolean linearSearch(int[]arr, int key){
        boolean found=false;
        int size=arr.length;
        for(int i=0;i<size;i++){
             if(key==arr[i]){
                found=true;
                System.out.println(i);
                break;
            }
        }
        return found;
    }

    public static boolean binarySearch(int []arr, int key){
        boolean found=false;
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;

         if(arr[mid]==key){
            found=true;
            break;
         }else if(arr[mid]<key){
            low=mid+1;
         }else{
            high=mid-1;
         }
        }

        return found;
    }
    public static void main(String []agrs){
        //1.Linear Search
        int arr[]={4,3,18,13,6};
        //int size=arr.length;
        int key=13;
        //i.solve this way
        // boolean found=false;
        // for(int i=0;i<size;i++){
        //     if(key==arr[i]){
        //         found=true;
        //         System.out.println(i);
        //         break;
        //     }
        // }
       
        //2.solve this way by creating function then call it
        boolean result= linearSearch(arr, key);
       if(result){
        System.out.println("Key found in an array");
       }else{
        System.out.println("Key not found in an array");
       }

       //3.By taking user input from user 
        
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr2[]=new int[size];
        
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++){
            arr2[i]=sc.nextInt();
        }
        System.out.println("Enter key you want to find:");
        int key2=sc.nextInt();

        boolean result2=linearSearch(arr2, key2);

        if(result2){// also in this line we can write if(result2==true)
          System.out.println("Key found in an array");
    
       }else{
        System.out.println("Key not found in an array");
       }
//---------------------------------------------------------------------------------------------------------------

    //2.Binary Search
    
     System.out.println("Binary search function calling here:");

      boolean result3= binarySearch(arr2, key2);

      if(result3){// also in this line we can write if(result2==true)
          System.out.println("Key found in an array");
    
       }else{
        System.out.println("Key not found in an array");
       }


    //3.Count frequency of given element

    int arr3[]={10,20,10,10,30};
    int siz=arr.length;
    int key3=10;
    int count=0;

    for(int i=0;i<siz;i++){
        if(arr[i]==key3){
            count++;
        }
    }

    System.out.println("Count of give element:"+count);

//------------------------------------------------------------------------------------------------------------
//4.Reverse an array
int arr4[]={10,20,30,40,50};
  reversArray(arr4);
 System.out.print("Reverse array:"+Arrays.toString(arr4));

 

// int arr4[]={10,20,30,40,50,60};
// int s=arr4.length;

// System.out.println("Reverse an array element:");
// int low=0;
// int high=s-1;

// while(low<high){
//     int temp=arr[low];
//     arr[low]=arr[high];
//     arr[high]=temp;

//     low++;
//     high--;
// }

// for(int i=0;i<s;i++){
//    System.out.println(arr4[i]);
// }




    }
}
