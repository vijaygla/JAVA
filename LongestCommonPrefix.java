public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            // Update the prefix to the common substring
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[]s= {"fLower", "fLow", "fLight"};
        System.out.println(longestCommonPrefix(s));
        
    }
}
