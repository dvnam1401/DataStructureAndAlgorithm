package quy_hoach_dong;

public class LongestPalindromicSubsequence {
    public static int lps(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // một ký tự là Palindromic
        for(int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for(int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if(str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }
}
