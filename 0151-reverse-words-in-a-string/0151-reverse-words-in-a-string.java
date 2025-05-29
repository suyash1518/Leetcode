class Solution {
    public String reverseWords(String s) {
        s = new StringBuilder(s.trim()).reverse().toString();
        int n = s.length();  

        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < n) {
            StringBuilder word = new StringBuilder();

            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            while (i < n && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }

            if (word.length() > 0) {
                ans.append(word.reverse().toString()).append(" ");
            }
        }

        return ans.toString().trim();
    }
}
