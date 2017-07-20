/**
 * https://www.interviewbit.com/problems/max-non-negative-subarray/
 */
public class Solution {

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long sum = 0;
        int start = 0;
        long maxSum = Integer.MIN_VALUE;
        int maxStart = 0;
        int count = 0;
        int maxCount = 0;

        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < a.size(); i++) {
            if (count == 0)
                start = i;
            if (a.get(i) >= 0 ) {
                count++;
                sum += a.get(i).intValue();
                if ((sum > maxSum) || ((sum == maxSum) && (count > maxCount))) {
                    maxSum = sum;
                    maxStart = start;
                    maxCount = count;
                }
            } else {
                sum = 0;
                count = 0;
            }
        }

        for (int i = maxStart; i < maxStart + maxCount; i++)
            result.add(a.get(i));

        return result;
    }
}