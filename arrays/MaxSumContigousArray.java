/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 */
public class Solution {
    // DO NOT MODFIY THE LIST.
    public int maxSubArray(final List<Integer> A) {

        int sum = Integer.MIN_VALUE;
        int last = 0;

        for (int num : A) {

            last += num;
            sum = Math.max(sum, last);
            if (last < 0)
                last = 0;
        }

        return sum;

    }
}