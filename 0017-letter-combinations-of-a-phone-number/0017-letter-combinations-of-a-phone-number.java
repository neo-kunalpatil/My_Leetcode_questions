class Solution {
    List<String> res = new ArrayList<>();

    void arrange(int i, String digits , StringBuilder curr) {
        String[] map = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    if(i==digits.length()) {
        res.add(curr.toString());
        return;
    }

    String letter= map[digits.charAt(i)- '0'];

    for(int ind=0;ind<letter.length();ind++) {
        curr.append(letter.charAt(ind));

        arrange(i+1,digits,curr);

        curr.deleteCharAt(curr.length()-1);


    }

    }
    public List<String> letterCombinations(String digits) {

        if(digits.length()==0) {
            return res;
        }

        arrange(0,digits, new StringBuilder());
        return res;


        

    }
}