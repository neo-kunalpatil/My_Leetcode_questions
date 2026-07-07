import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int idx=0;
        Deque<Integer> dq = new ArrayDeque<>();
        int n=nums.length;
        int[] res=new int[n-k+1];


        for(int i=0;i<n;i++) {
   //remove unnecesary  numbers
   while(!dq.isEmpty() && dq.peekFirst()<=i-k) {
    dq.removeFirst();
   }
  


   while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]) {
     dq.removeLast();
   }
dq.addLast(i);

if(i>=k-1) {
    res[idx++]= nums[dq.peekFirst()];
}

        }

        
        return res;
            }
}