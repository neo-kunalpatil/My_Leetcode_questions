class Solution {

    public boolean isPalindrome(String s) {

        return check(s, 0, s.length() - 1);

    }

    boolean check(String s, int left, int right) {

        // Base Case
        if (left >= right) {
            return true;
        }

        // Skip non-alphanumeric character from left
        if (!Character.isLetterOrDigit(s.charAt(left))) {
            return check(s, left + 1, right);
        }

        // Skip non-alphanumeric character from right
        if (!Character.isLetterOrDigit(s.charAt(right))) {
            return check(s, left, right - 1);
        }

        // Compare characters (case-insensitive)
        if (Character.toLowerCase(s.charAt(left))
                != Character.toLowerCase(s.charAt(right))) {

            return false;
        }

        // Recursive call
        return check(s, left + 1, right - 1);
    }
}