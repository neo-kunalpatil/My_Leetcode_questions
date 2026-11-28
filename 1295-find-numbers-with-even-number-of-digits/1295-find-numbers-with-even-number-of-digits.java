class Solution {
    public int findNumbers(int[] nums) {
        int n= nums.length;
        int count=0;
  int digit=0;
        for(int i=0;i<n;i++) {
            while(nums[i]>0) {
                nums[i]=nums[i]/10;
                digit++;
            }
           if(digit%2==0) {
            count++;
           }
           digit=0;
        }

        return count;
        
    }
}