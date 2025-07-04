class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        int idx = 0;
        List<Integer> ans = new ArrayList<>();

        for(idx = 0; idx<words.length; idx++)
        {
            String word = words[idx];
            for(int j = 0; j<word.length(); j++)
            {
                if(word.charAt(j)==x)
                {
                    ans.add(idx);
                    break;
                }
            } 
            
        }
        return ans;
    }
}
