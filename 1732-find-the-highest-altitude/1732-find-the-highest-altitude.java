import java.util.Arrays;
class Solution {
    public int largestAltitude(int[] gain) {

        int n= gain.length;

        int altitude=0;
        int maxaltitude=0;
        for(int i=0;i<n;i++) {
            altitude+=gain[i];


            maxaltitude= Math.max(altitude , maxaltitude);

        }


        return maxaltitude;
        }
        
    }
