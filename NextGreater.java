/**
 * Checkpoint 4
 * Given an array, find the next greater element G[i] for every element A[i] in the array.
 * The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array.
 * Example:
 * Input : A : [4, 5, 2, 10]
 * Output : [5, 10, 10, -1]
 */
public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        int i = 0, j = 0;
        for (i = 0; i < a.size(); i++) {
            for (j = i+1; j < a.size(); j++) {
                if (a.get(j) > a.get(i)) {
                    a.set(i, a.get(j));
                    break;
                }
            }
            if (j == a.size())
                a.set(i, -1);
        }
        return a;
    }
}
