public class Q13_StringCompression {
    public static void main(String[] args) {
        String s = "aabcc";
        String result = "";

        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result += s.charAt(i - 1) + "" + count;
                count = 1;
            }
        }

        System.out.println(result);
    }
}