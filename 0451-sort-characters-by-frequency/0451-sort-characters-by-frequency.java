class Solution {
     public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        // Step 1: Count frequencies
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Convert map to list of characters
        List<Character> chars = new ArrayList<>(freq.keySet());

        // Step 3: Sort characters by frequency in descending order
        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        // Step 4: Build result string
        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            int count = freq.get(ch);
            for (int i = 0; i < count; i++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
