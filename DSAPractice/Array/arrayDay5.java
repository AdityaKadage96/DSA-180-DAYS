package DSAPractice.Array;

public class arrayDay5 {
    public static void main(String[]args){
        //1.Insert element at position
        int []arr={10,20,30,40,50};
        
        int pos=3;
        int val=45;

        int newArr[]=new int[arr.length+1];

        for(int i=0;i<pos;i++){
            newArr[i]=arr[i];
            
        }
        newArr[pos]=val;
        for(int i=pos;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }

        System.out.println("After insertion of newArray:");
        for(int x:newArr){
            System.out.print(x+" ");
        }
        System.out.println();
//------------------------------------------------------------------------------------------------------------------------------------

    //2.Delete element at position

    int arr2[]={10,20,30,40,50};
    int pos1=2;
    int newAr[]=new int[arr2.length-1];

    for(int i=0, j=0;i<arr2.length;i++){
          if(i==pos1) continue;
          newAr[j++]=arr[i];
          
    }
    
    System.out.println("after deletion of array:");
    for(int x:newAr){
        System.out.print(x+" ");
    }
    System.out.println();

//---------------------------------------------------------------------------------------------------------------------------------------

    //3.Replace element at index
    int arr3[]={10,20,30,40,50};
    int index=2;
    int value=47;
    arr[index]=value;
    
    System.out.println("after replacing element in an array");
    for(int x:arr3){
        System.out.println(x+" ");
    }

//-----------------------------------------------------------------------------------------------------------------------------------------
   //3. Shift all zero to end 

   int arr4[]={0,1,0,3,0,12,4};
   
   int idx=0;
   for(int i=0;i<arr4.length;i++){
     if(arr4[i]!=0){
           arr4[idx]=arr4[i];
           idx++;
     }
   }
   while(idx < arr4.length){
       arr4[idx]=0;
       idx++;
   }

   System.out.println("After shifting all zeros to end");
   for(int x:arr4){
    System.out.print(x+" ");
   }
   System.out.println();
//-----------------------------------------------------------------------------------------------------------------

   //4.Moves all negative to one side of array
   int arr5[]={1,-2,3,-4,-5,6,7};
   
   int j=0;
   for(int i=0;i<arr5.length;i++){
      if(arr5[i]<0){// if we write this then all negative will be in left side but when we change arr5>0 then all negative move to the end
        int temp=arr5[i];
        arr5[i]=arr5[j];
        arr5[j]=temp;
        j++;
      }
   }

   System.out.println("Move all negative to one side");
   for(int x:arr5){
    System.out.print(x+" ");
   }
   System.out.println();

    }
}
