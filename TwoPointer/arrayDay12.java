package TwoPointer;

import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class arrayDay12 {

    public static void sortTwoColors(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
           
            if(arr[i]==0){
                i=i+1;
            }else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j=j-1;
            }
        }
    }

    public static void sortColors(int arr[]){
        int i=0;
        int j=arr.length-1;
        int k=0;

        while(k<=j){

            if(arr[k]==1){
                k=k+1;
            }else if(arr[k]==2){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;

                j=j-1;
            }else{
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;

                i=i+1;
                k=k+1;
            }
        }
    }

    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        int len=0;
        ListNode l=head;

        while(l!=null){
            len = len +1;
            l=l.next;
        }

        int d=len-n+1;
        ListNode prev=dummy;
        ListNode curr=head;

        int i=0;

         while(i<(d-1)){
            curr=curr.next;
            prev=prev.next;
            i=i+1;
         }

        return dummy.next;
    }
    public static void main(String[]args){
        
        //1.Sort Two colors

        int arr[]={0,1,1,1,0,1,0,1};
        
        sortTwoColors(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    
        //2.Sort Colors

        int arr2[]={2,0,2,1,1,0};
        sortColors(arr2);

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }


        //3.Remove Nth Node from end of list








    }
}
