package DSAPractice.Sorting;

public class day8Sorting {

    public static void bubbleSort(int arr[]){
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted array by using bubble sort:");
        for(int x:arr){
            System.out.print(x+" ");
        }

        System.out.println();
    }

    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
             int min=arr[i];
             int minIdx=i;

             for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIdx=j;
                }
             }

             int temp=arr[i];
             arr[i]=arr[minIdx];
             arr[minIdx]=temp;
        }

         System.out.println("Sorted array by using Selection sort:");
        for(int x:arr){
            System.out.print(x+" ");
        }

        System.out.println();

        
    }

    public static void insertionSort(int arr[]){
         int n=arr.length;

         for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
         }

        System.out.println("Sorted array by using Insertion sort:");
        for(int x:arr){
            System.out.print(x+" ");
        }

        System.out.println();
    }

    public static void main(String[]args){
         int arr[]={5,1,4,2,8};

        //1.Bubble sort
        bubbleSort(arr);

        //2.Selection sort
        selectionSort(arr);

        //3.Insertion sort
        insertionSort(arr);



        
    }
}
