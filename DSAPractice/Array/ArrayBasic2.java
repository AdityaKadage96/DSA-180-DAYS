package DSAPractice.Array;

public class ArrayBasic2 {
    public static void main(String[] args){
        int arr1[]={10,20,30,40};
        int arr2[]=new int []{10,20,30};

        System.out.println(System.identityHashCode(arr1));//622488023
        System.out.println(System.identityHashCode(arr2));//1933863327

        // if we comapare both array arr1 and arr2 identityhashcode both array have different identityhashcode menas they store in different location
        
        //1.Array Declaration, initialization
        int arr[]={10,20,30};//initialization of array

            //int arrInt2[]= new int[];//error: array dimension missing
            //int arrInt3[]=new int[5];// This declaration working

            //int arrInt4[]=new int[5]{10,20,30,40};//error: array creation with both dimension expression and initialization is illegal

            //int arrInt5[]=new int[]{ }; //This declaration working

            //int arrInt6[]=new int[3]{ };//error: array creation with both dimension expression and initialization is illegal

        //2.Accessing array elements
        System.out.println(arr[0]);//10
        System.out.println(arr[1]);//20
        System.out.println(arr[2]);//30
        //System.out.println(arr[3]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        //if we try to access element which is not present in array , we will get Exception which is ArrayIndexOutOfBoundsException

        //3.Updatation of array elements

        arr[0]=25;
        arr[1]=50;
        System.out.println("After updatation of array:");
        System.out.println(arr[0]);//25
        System.out.println(arr[1]);//50
        System.out.println(arr[2]);//30

        //4.Array Declaration then accessing element

        int arr4[]=new int[5];
        System.out.println(arr4[0]);//0
        System.out.println(arr4[1]);//0
        System.out.println(arr4[2]);//0
        System.out.println(arr4[3]);//0
        System.out.println(arr4[4]);//0

        float arr5[]=new float[5];
        System.out.println(arr5[0]);//0.0
        System.out.println(arr5[1]);//0.0
        System.out.println(arr5[2]);//0.0
        System.out.println(arr5[3]);//0.0
        System.out.println(arr5[4]);//0.0

        char arr6[]=new char[5];
        System.out.println(arr6[0]);//blanck space
        System.out.println(arr6[1]);//blanck space
        System.out.println(arr6[2]);//blanck space
        System.out.println(arr6[3]);//blanck space
        System.out.println(arr6[4]);//blanck space

        String arr7[]=new String[5];
        System.out.println(arr7[0]);//null
        System.out.println(arr7[1]);//null
        System.out.println(arr7[2]);//null
        System.out.println(arr7[3]);//null
        System.out.println(arr7[4]);//null


        //5.Array declaration and then assign elements
        
        //Array declaration
        int arrInt[]=new int[5];

        //Array elements Assigning by using index
        arrInt[0]=25;
        arrInt[1]=50;
        arrInt[2]=60;
        arrInt[3]=70;
        arrInt[4]=80;

        //Accessing array elements by using index

        System.out.println(arrInt[0]);//25
        System.out.println(arrInt[1]);//50
        System.out.println(arrInt[2]);//60
        System.out.println(arrInt[3]);//70
        System.out.println(arrInt[4]);//80

       //Accessing array elements by using for loop

       for(int i=0;i<arrInt.length;i++){
          System.out.print(arrInt[i] + " "); //25 50 60 70 80
       }












    }
}
