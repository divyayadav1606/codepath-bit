/**
 * https://www.interviewbit.com/problems/count-and-say/
 */
public class Solution {
    public String countAndSay(int a) {
        if (a == 1)
            return "1";
        if (a == 2)
            return "11";

        String str= "11";
        for (int i = 3; i <= a; i++) {
            int count = 1;
            StringBuffer result = new StringBuffer();

            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) != str.charAt(j-1))
                {
                    result.append(count);
                    result.append(str.charAt(j-1));
                    count = 1;
                }
                else count++;
            }
            result.append(count);
            result.append(str.charAt(str.length()-1));
            str = result.toString();
        }
        return str;
    }
}
