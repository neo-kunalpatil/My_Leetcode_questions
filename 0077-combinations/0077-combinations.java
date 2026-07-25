class Solution {

List<List<Integer>> res= new ArrayList<>();
void comb(int start, int n, int k, List<Integer> ans) {
if(ans.size()==k) {
    res.add(new ArrayList<>(ans));
    return;
}

for(int i=start;i<=n;i++) {
ans.add(i);

comb(i+1,n,k,ans);
ans.remove(ans.size()-1);



}



    }
    public List<List<Integer>> combine(int n, int k) {
        
        List<Integer> ans= new ArrayList<>();

        comb(1,n,k,ans);
        return res;
    }
}