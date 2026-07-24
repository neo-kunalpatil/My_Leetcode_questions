class Solution {
public double myPow(double x, int n) {

   long N=n;
   if(N<0) {
    x=1/x;
    N=-n;
   }

   return pow(x,N);
        
        
    }
private double pow(double x, long n) {

    if(n==0) {
            return 1;
        }
        

double answer= pow(x,n/2);
if(n%2==0) {
    
    return answer*answer;
}
else  {
    return answer*answer*x;
}
    }

}
