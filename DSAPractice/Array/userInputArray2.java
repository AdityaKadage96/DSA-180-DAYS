package DSAPractice.Array;

import java.io.*;

public class userInputArray2 {
    public static void main(String[] args) throws IOException{
        //Input by using BufferedReader class

       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // if we write this line before that we need to add throws IOException and also we need to import io pacakge

        System.out.print("Enter array size:");
       // int size=br.readLine();//error: incompatible types: String cannot be converted to int
       //int size=Integer.parseInt(br.readLine());//This working

       //----------------------------------------------------------------------------------
       
        BufferedReader brI=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter array size:");
        int size=Integer.parseInt(brI.readLine());

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(brI.readLine());

        }

        System.out.println("User Enter Array Elements:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }




    }
}
