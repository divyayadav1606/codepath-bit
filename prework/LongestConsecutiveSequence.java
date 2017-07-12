/**
 * Checkpoint 5
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * Your algorithm should run in O(n) complexity.
 */
public class Solution {
    public int longestConsecutive(final List<Integer> a) {
        HashSet<Integer> S = new HashSet<Integer>();

        for (int i = 0; i < a.size(); i++)
            S.add(a.get(i));

        int count = 0;

        for (int i = 0; i < a.size(); i++) {
            int val = a.get(i);
            int counter = 0;
            if (!S.contains(val - 1)) {
                while (S.contains(val)) {
                    val++;
                    counter++;
                }
                if (count < counter)
                    count = counter;
            }
        }
        return count;
    }
}