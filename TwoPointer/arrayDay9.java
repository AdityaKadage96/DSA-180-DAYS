package TwoPointer;

import java.util.*;
public class arrayDay9 {

    public static int[] squaringSortedArray(int arr[]){
       // int n=arr.length;
        List<Integer>neg=new ArrayList<>();
        List<Integer>pos=new ArrayList<>();

        for(int num:arr){
            if(num<0){
                neg.add(num);
            }else{
                pos.add(num);
            }
        }

        for(int i=0;i<neg.size();i++){
            neg.set(i,neg.get(i)*neg.get(i));
        }

        Collections.reverse(neg);

        for(int i=0;i<pos.size();i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }

        int n1=neg.size();
        int n2=pos.size();

        int []res=new int[n1+n2];
        
        int i=0,j=0,id=0;

        while(i<n1 && j<n2){
            if(neg.get(i) <= pos.get(j)){
                res[id]=neg.get(i);
                id++;
                i++;
            }else{
                res[id]=pos.get(j);
                id++;
                j++;
            }
        }

        while(i<n1){
            res[id++]=neg.get(i++);

        }

        while(j<n2){
            res[id++]=pos.get(j++);
        }

        return res;


    }
    public static void main(String[]args){
        int arr[]={-4,-1,2,3,6,8};
       //1.Squaring sorted arrayd 
        squaringSortedArray(arr);
        System.out.println(arr);//[I@251a69d7

        System.out.println(Arrays.toString(squaringSortedArray(arr)));
    }
}
