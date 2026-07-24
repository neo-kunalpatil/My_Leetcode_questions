class Solution {


void reverse(int f, int l , char[] s) {

    if(l<f) {
        return;
    }
 char temp=s[f];
 s[f]=s[l];
 s[l]=temp;

 reverse(++f,--l,s);


    }


    public void reverseString(char[] s) {
        int n= s.length;
        int f=0;
        int l=n-1;

        reverse(f,l,s);

        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}