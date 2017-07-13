/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.
 */
public class Solution {
    public int lengthOfLastWord(final String a) {
        char[] c = a.toCharArray();
        int count = 0;

        for (int i = c.length -1;  i >= 0; i--) {
            if(c[i] != ' ') {
                count++;
                continue;
            } else if (count == 0)
                continue;
            else
                break;
        }

        return count;
    }
}