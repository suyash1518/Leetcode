class Solution {
    public int myAtoi(String s) {
        s= s.trim();
        if(s.isEmpty()) return 0;

        int sign=1, i=0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
          sign = (s.charAt(0) == '-') ? -1: 1;
          i++;
        }

        int num = 0;
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0'; // Convert char to integer
        
        // **Check for overflow before updating `num`**
        if (num > (Integer.MAX_VALUE / 10) || (num == Integer.MAX_VALUE / 10 && digit > 7)) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        num = num * 10 + digit; // Build the number safely
        i++;
    }

    return num * sign; // Apply the sign and return result
}
}