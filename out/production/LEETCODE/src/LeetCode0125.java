public class LeetCode0125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        int m = s.length();
        if (m <= 1) return true;
        for (int i = 0; i < m / 2; i++) {
            if (s.charAt(i) != s.charAt(m - 1 - i)) return false;
        }
        return true;
    }
}
