/**
 * For Given Number N find if its COLORFUL number or not
 * Return 0/1
 * COLORFUL number: A number can be broken into different contiguous sub-subsequence parts. Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
 * And this number is a COLORFUL number, since product of every digit of a contiguous subsequenc
 */
public class Solution {
    public int colorful(int a) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();

        while (a > 0) {
            arr.add(0, a % 10);
            a = a/10;
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j <arr.size(); j++) {
                int prod =1;

                for (int k = i; k <= j; k++)
                    prod =  prod * arr.get(k);

                if (set.contains(prod))
                    return 0;
                else
                    set.add(prod);
            }
        }
        return 1;
    }
}
