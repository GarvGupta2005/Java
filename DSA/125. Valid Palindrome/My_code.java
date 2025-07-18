class Solution {
    public boolean isPalindrome(String s) {

        String palindrome = "";
        String lower_case = s.toLowerCase().replaceAll("[\\W_]", "");  // non-word characters and underscore

       
        for (int i = lower_case.length() - 1; i >= 0; i--) {
            palindrome = palindrome + lower_case.charAt(i); 
        }
        if (palindrome.equals(lower_case))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
