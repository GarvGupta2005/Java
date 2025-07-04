import java.util.ArrayList;
import java.util.List;

class Solution {
    // Approach: Single Pass with Character Search
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for (int idx = 0; idx < words.length; idx++) {
            if (words[idx].indexOf(x) != -1) {
                ans.add(idx);
            }
        }

        return ans;
    }
}
