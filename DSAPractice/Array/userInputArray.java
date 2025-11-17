package DSAPractice.Array;

import java.util.Scanner;
//Arrya input by using Scanner class
public class userInputArray {
    public static void main(String[]args){
    
      System.out.print("Enter size:");
      Scanner sc=new Scanner(System.in);
      int arrSize=sc.nextInt();
      
      int arr[]=new int[arrSize];
      System.out.println("Size of array:"+arr.length);
    
      System.out.println("Enter array elements:");
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }

      System.out.println("Array elements:");
      
      for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
      }
    }
}
