/**
 * You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
 * f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
 *
 * https://www.interviewbit.com/problems/maximum-absolute-difference/
 */
public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int ans = 0, n = A.size();

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            max1 = Math.max(max1, A.get(i) + i);
            max2 = Math.max(max2, A.get(i) - i);
            min1 = Math.min(min1, A.get(i) + i);
            min2 = Math.min(min2, A.get(i) - i);
        }
        ans = Math.max(ans, max2 - min2);
        ans = Math.max(ans, max1 - min1);
        return ans;
/**        int max = Integer.MIN_VALUE;
 int size = A.size();
 int f = 0;

 for (int i = 0; i < size; i++) {

 for (int j = i+1; j < size; j++) {
 if (i == j)
 f = 0;
 else
 f = Math.abs(A.get(i) - A.get(j)) + Math.abs(i-j);

 max = Math.max(f, max);
 }
 }
 return max;
 */
    }
}
