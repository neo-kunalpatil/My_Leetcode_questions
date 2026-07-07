import java.util.*;
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rq= new ArrayDeque<>();
         Queue<Integer> dq= new ArrayDeque<>();
    int n=senate.length();

         for(int i=0;i<n;i++) {
            if(senate.charAt(i)=='R') {
                rq.add(i);
            }
            else {
                dq.add(i);
            }}

            while(!rq.isEmpty() && !dq.isEmpty()) {
                int r1= rq.remove();
                int d1=dq.remove();

                if(r1<d1) {
                    rq.add(r1+n);
                }
                else {
                    dq.add(d1+n);
                }
            }

            if(dq.isEmpty()) {
                return "Radiant";
            }
            else {
                return "Dire";
            }



        
    }
}