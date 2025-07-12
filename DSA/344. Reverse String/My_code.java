class Solution {
    public void reverseString(char[] s) {
        
        char[] t = new char[s.length];
        int j = 0;

        for (int i = s.length - 1; i >= 0; i--) {
            t[j++] = s[i];
        }
        
        // changes can only be made in s
        for (int i = 0; i < s.length; i++) {
            s[i] = t[i];
        }

        // t cant be return beacause function is void
    }
}
