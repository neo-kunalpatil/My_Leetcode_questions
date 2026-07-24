class Solution {

    void sub(int[] nums , List<Integer> ans ,List<List<Integer>> result, int i) {

        if(i == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);
        sub(nums,ans,result,i+1);

        ans.remove(ans.size()-1);
        sub(nums, ans,result,i+1);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result =new ArrayList<>();
        List<Integer> ans= new ArrayList<>();


        int n= nums.length;

        sub(nums, ans,result, 0);



        return result;



        
    }
}