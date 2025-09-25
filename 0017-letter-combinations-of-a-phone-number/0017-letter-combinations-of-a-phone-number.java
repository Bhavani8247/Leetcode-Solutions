import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result; // edge case: empty input
        }

        // Mapping of digits to letters
        String[] phoneMap = {
            "",    // 0
            "",    // 1 (no mapping)
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };

        backtrack(result, phoneMap, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String[] phoneMap, String digits, int index, StringBuilder path) {
        // Base case: if path length == digits length → found a combination
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        // Get current digit
        String letters = phoneMap[digits.charAt(index) - '0'];

        // Try each letter for this digit
        for (char letter : letters.toCharArray()) {
            path.append(letter); // choose
            backtrack(result, phoneMap, digits, index + 1, path); // explore
            path.deleteCharAt(path.length() - 1); // backtrack
        }
    }
}
