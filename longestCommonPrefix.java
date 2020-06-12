class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        int n = Math.min(strs[0].length(),strs[strs.length-1].length());
        for (int i = 0; i < n; i++) {
            if (strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
                ans += strs[0].charAt(i);
            }
            else {
                return ans;
            }
        }
        return ans;
    }
}