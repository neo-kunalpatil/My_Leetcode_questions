class Solution {

void reverse(int[] arr , int l , int h) {
        int n= arr.length;
        
        while(l<h) {
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;

            l++;
            h--;
        }
}
    
 public void rotate(int[] nums, int k) {

        int n= nums.length;
        k=k%n;
       reverse(nums,0,n-1);
       reverse(nums,0,k-1);
       reverse(nums, k,n-1);


       
         
        
    }
}