package DSAPractice.Array;

import java.util.Arrays;

public class arrayDay6 {
    public static void main(String[]args){
        //1.Count duplicate

        int arr[]={1,2,1,4,1};

        int count=0;
        for(int i=0;i<arr.length;i++){

            boolean isDuplicate=false;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    isDuplicate=true;
                    break;
                }
            }

            boolean alreadyCounted=false;
            for(int k=0;k<i;k++){
                if(arr[k]==arr[i]){
                    alreadyCounted=true;
                    break;
                }
            }

            if(isDuplicate && !alreadyCounted){
                count++;
            }
        }

        System.out.println(count);

//------------------------------------------------------------------------------------------------
      //2.Count unique element in an array

      int arr2[]={1,2,1,3,6,1,1};

      int unique=0;
      for(int i=0;i<arr2.length;i++){
         boolean isUnique=false;

         for(int j=0;j<arr2.length;j++){
            if(i!=j && arr2[i]==arr2[j]){
            isUnique=true;
              break;
            }
         }
         if(isUnique) unique++;
      }

      System.out.println(unique);

//---------------------------------------------------------------------------------------------------------------------------------------------
  //3.Find element with max frequency

    int arr4[]={1,2,1,3,6,1,1};
    Arrays.sort(arr4);

    int maxFreq=0;
    int ele=arr4[0];
    
    for(int i=0;i<arr.length;){
        int count1=1;
        int j=i+1;

        while(j<arr4.length && arr4[j]==arr4[i]){
            count1++;
            j++;
        }

        if(count1>maxFreq){
            maxFreq=count1;
            ele=arr4[i];
        }
      i=j;
    }

    System.out.println("max frequency element:"+ele);
    System.out.println("Frequency:"+ maxFreq);

//------------------------------------------------------------------------------------------------------------------------------------------------
  //4.Majority elements (Moores voting alogrithm)

    int arr5[]={1,2,4,5,3,1,1,};

    int majEle=0;
    int count5=0;

    for(int i=0;i<arr.length;i++){
        
        if(count5==0){
            majEle=arr5[i];
        }

        if(arr5[i]==majEle){
            count5++;
        }else{
            count5--;
        }
    }

    System.out.println("Majority element:"+majEle);


      
    }



}
