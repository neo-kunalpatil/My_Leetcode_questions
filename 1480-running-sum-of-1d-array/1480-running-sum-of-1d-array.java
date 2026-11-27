import java.util.Arrays;
class Solution {
    public int[] runningSum(int[] nums) {
        int[] res= new int[nums.length];

        for(int i=0;i<nums.length;i++) 
        {
               int L= 0;
               int R= i;
                int sum=Arrays.stream(nums, L, R + 1).sum();
                res[i] =sum;
            }


            return res;
        }
        
    }
