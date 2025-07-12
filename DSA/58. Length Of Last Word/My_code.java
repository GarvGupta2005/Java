class Solution {
    public int lengthOfLastWord(String s) {

        // Made Array of strings splitting spaces 
        String[] words = s.split(" ");
        int len = words.length;
        
        return words[len-1].length();
    }
}
