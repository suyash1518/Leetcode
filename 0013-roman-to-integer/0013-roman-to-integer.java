class Solution {
    public int romanToInt(String s) {
        // Map Roman numerals to their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        // Initialize result
        int total = 0;
        
        // Loop through the string
        for (int i = 0; i < s.length(); i++) {
            // Get the value of the current character
            int currentVal = romanMap.get(s.charAt(i));
            
            // If the current value is less than the next value, subtract it
            if (i < s.length() - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                // Otherwise, add the value
                total += currentVal;
            }
        }
        
        return total;
    }
}
