lass Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int startIndex = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);

            if (charIndexMap.containsKey(currentChar)) {
                // Update the start index to the next index of the repeating character
                startIndex = Math.max(startIndex, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }

        return maxLength;
    }
}
