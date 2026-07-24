class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans;
        if(n==1) {
            return true;
        }
        if(n==0) {
            return false;
        }

if(n%2!=0)  {
    return false;

}
else {
        ans= isPowerOfTwo(n/2);
}


return ans;
        
    }
}