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
    public static void main(String []args){
      //Day 86-Time needed to buy tickets

      int ticket[]={2,3,2};
      int k=2;
      timeRequiredToBuy(ticket, k);
      System.out.println(timeRequiredToBuy(ticket, k));
    }
}