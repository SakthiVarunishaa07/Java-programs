public class Q12_LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            boolean[] visited = new boolean[256];
            int len = 0;

            for (int j = i; j < s.length(); j++) {
                if (visited[s.charAt(j)]) break;

                visited[s.charAt(j)] = true;
                len++;
            }

            if (len > max) max = len;
        }

        System.out.println(max);
    }
}