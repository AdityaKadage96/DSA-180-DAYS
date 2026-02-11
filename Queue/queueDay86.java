package Queue;

public class queueDay86{

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int ti=0;

        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                ti +=Math.min(tickets[i],tickets[k]);
            }else{
                ti +=Math.min(tickets[i], tickets[k]-1);
            }
        }

        return ti;
    }

    public static int passThePillow(int n, int time){
        int cycle=2*(n-1);
        int t=time % cycle;

        if(t<n){
            return t+1;
    
        }else{
            return n-(t-(n-1));
        }
    }
    public static void main(String []args){
      //Day 86-Time needed to buy tickets

      int ticket[]={2,3,2};
      int k=2;
      timeRequiredToBuy(ticket, k);
      System.out.println(timeRequiredToBuy(ticket, k));


      //Day 87- Pass the pillow

      int time=5;
      int n=4;
      passThePillow(n, time);
      System.out.println(passThePillow(n, time));
    }
}