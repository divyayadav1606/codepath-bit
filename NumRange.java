/**
 * Checkpoint 3
 * Given an array of non negative integers A, and a range (B, C),
 * find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C
 *
 * Expected output
 * A : [10, 5, 1, 0, 2]
 * (B, C) : (6, 8)
 * ans = 3 e.g. [5, 1], [5, 1, 0], [5, 1, 0, 2]
 */

public class Solution {
    public int numRange(ArrayList<Integer> a, int b, int c) {
        int count = 0;

        for (int i =0; i < a.size(); i++) {
            int sum = a.get(i);
            if (sum >= b && sum <= c)
                count++;

            for (int j = i+1; j < a.size(); j++) {

                sum += a.get(j);

                if (sum >= b && sum <= c)
                    count++;
                else if (sum > c)
                    break;
            }
        }


        return count;
    }
}