/**
 * Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p
 * If such an integer is found return 1 else return -1.
 */
public class Solution {

    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);

        for (int i = 0 ; i < A.size()-1; i++) {
            if (A.get(i) == A.get(i+1))
                continue;

            if (A.get(i) == (A.size() - i - 1))
                return 1;
        }

        if (A.get(A.size() - 1) == 0)
            return 1;
        else
            return -1;
    }
}