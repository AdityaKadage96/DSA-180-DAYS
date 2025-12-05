package SlowFastPointer;

public class arrayday19 {

     public static int findDuplicate(int[] nums) {
        int slow=nums[0];
        int fast=nums[nums[0]];

        while(true){
            slow=nums[slow];
            fast=nums[fast];
            fast=nums[fast];

            if(slow==fast){
               break;
               
            }
            
            
        }
            slow=0;
             while(slow!=fast){
                    slow=nums[slow];
                    fast=nums[fast];

                }

            return slow;

        
    }
    public static void main(String[]args){
        //1.Find duplicate number

        int nums[]={1,2,3,2,2};

        findDuplicate(nums);

        System.out.println(findDuplicate(nums));


    }
}
