package KadansPattern;

public class arrDay22 {

    public static  int maximumSum(int[] arr) {
        int n=arr.length;
        int noDel=arr[0];
        int oneDel=arr[0];
        int result=arr[0];

        for(int i=1;i<n;i++){
            int prevNoDel=noDel;

            noDel=Math.max(arr[i],noDel+arr[i]);
            oneDel=Math.max(prevNoDel,oneDel+arr[i]);


            result=Math.max(result,Math.max(noDel,oneDel));
        }

        return result;
    }
    public static void main(String[]args){

        //1.Maximum subarray sum with one deletion
        int arr[]={1,-2,0,3};
        
        maximumSum(arr);

        System.out.println(maximumSum(arr));
        

    }
}
