import java.util.Arrays;
class Solution {
    public int maximumWealth(int[][] accounts) {
 int[] maxi= new int[accounts.length];
        for(int i=0;i<accounts.length;i++) {
            
            for(int j=0;j<accounts[0].length;j++) {
                int l=0;
                int r=accounts[0].length-1;
                maxi[i]=Arrays.stream(accounts[i], l,r+1).sum();


            }
        }

        return Arrays.stream(maxi).max().getAsInt();
        
    }
}