package SlowFastPointer;

public class linkedlistday18 {

    public static int fun(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            n=n/10;
            sum=sum+d*d;
        }

        return sum;
    }
    public static boolean isHappy(int n){
        int slow=n;
        int fast=n;
        
        while(fast!=1){
            slow=fun(slow);
            fast=fun(fast);
            fast=fun(fast);

            if(slow==fast && slow!=1){
                return false;
            }
        }
        fast=1;
        return true;
    }
    public static void main(String[]args){
        //1.Happy Number

        int n=19;
        isHappy(n);
        System.out.println(isHappy(n));
    }
}
