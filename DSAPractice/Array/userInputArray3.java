package DSAPractice.Array;
import java.util.Scanner;

public class userInputArray3 {
    public static void main(String[]args){
      //1.Sum of array elements
    //   System.out.print("Enter size of array:");
    //   Scanner sc=new Scanner(System.in);
    //   int size=sc.nextInt();
    //   int arr[]=new int[size];
    //   System.out.println("Enter array element:");

    //   for(int i=0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    //   }

    //   int sum=0;
    //   for(int i=0;i<arr.length;i++){
    //     sum=sum+arr[i];
    //   }
    //   System.out.println("Sum of array is:"+ sum);

      //-------------------------------------------------------------------

    //2.Find key element in array
    System.out.println("Enter size of array:");
    Scanner scI=new Scanner(System.in);
    int size=scI.nextInt();
    int arr[]=new int[size];

    System.out.println("Enter array elements:");
    for(int i=0;i<arr.length;i++){
        arr[i]=scI.nextInt();
    }
    
    System.out.println("Array elments which we enter:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
    }
    System.out.println();
    
    System.out.println("Enter num which is you want to find in array:");
    int num=scI.nextInt();
    
    boolean found=false;
    for(int i=0;i<arr.length;i++){

        if(num==arr[i]){
            System.out.println("KEY FOUND WHICH ENTER YOU");
            found=true;
            break;
        }
    }

    if(found==true){
        System.out.println("key is found");
    }else{
        System.out.println("key is Not found");
    }



    }
}
