
package DSAPractice.Array;

public class arrayDay4 {
    public static void main(String []args){
        //1. Swap alternate element

        int arr[]={10,20,30,40,50};

        int size=arr.length-1;

        for(int i=0;i<size;i+=2){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        }
        System.out.println();
//------------------------------------------------------------------------------------------------------------------------
       
       //2.Find second largest element in an array

       int arr2[]={2,5,28,17,45,9};

       int max1=Integer.MIN_VALUE;
       int max2=Integer.MIN_VALUE;

       for(int i=0;i<arr2.length;i++){
        if(arr2[i]>max1){
            max2=max1;
            max1=arr2[i];
        }else if(arr2[i]!=max1 && arr2[i]>max2){
            max2=arr2[i];
        }
       }

       System.out.println("first max number:"+max1);
       System.out.println("Second max number:"+max2);

//------------------------------------------------------------------------------------------------------------------------------------------------------------
       //3.Check array is sorted or not

       int arr3[]={1,2,9,6,7,8};

       boolean sorted=true;

       for(int i=1;i<arr3.length;i++){
          if(arr3[i]<arr3[i-1]){
               sorted=false;
               break;
          }
       }

       System.out.println("Check array sorted or not:"+sorted);
//--------------------------------------------------------------------------------------------------------------------------------------------------------
      //4.Reverse only half of the array

      System.out.println("Reverse only half of the array:");

      int arr4[]={10,20,30,40,50,60,70,80};
      
      int n=arr4.length;
      int half=n/2;
      int low=0;
      int high=half-1;
      
      while(low<=high){
    
         int temp=arr4[low];
         arr4[low]=arr4[high];
         arr4[high]=temp;
         low ++;
         high --;
      }
      
      for(int i=0;i<arr4.length;i++){
        System.out.print(arr4[i] +" ");
      }

      System.out.println();
      
   //-------------------------------------------------------------------------------------------------------------

   //5.Swap first and last element of the array

   System.out.println("Swap first and last element of the array:");

    int arr5[]={10,20,30,40,50};
    
    int left=0;
    int right=arr5.length-1;

        int temp=arr5[left];
        arr5[left]=arr5[right];
        arr5[right]=temp;
        
   

    for(int x:arr5){
        System.out.print(x+" ");
    }


    }
}
