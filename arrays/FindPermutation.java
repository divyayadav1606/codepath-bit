/**
 * https://www.interviewbit.com/problems/find-permutation/
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        int i = 1, j = B, k = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(k = 0 ; k < A.length(); k++) {
            if (A.charAt(k) == 'D') {
                result.add(j);
                j--;
            } else if (A.charAt(k) == 'I') {
                result.add(i);
                i++;
            }
        }

        if (A.charAt(A.length()-1) == 'I') {
            result.add(j);
        } else if (A.charAt(A.length()-1) == 'D') {
            result.add(i);
        }
        return result;
    }
}
