/**
 * Checkpoint 5
 * Find the kth smallest element in an unsorted array of non-negative integers.
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> a, int k) {
        PriorityQueue<Integer> q = new PriorityQueue();

        for(int i = 0; i < a.size(); i++)
            q.add(a.get(i));

        for(int i = 0; i < k-1; i++)
            q.poll();

        return q.peek();
    }
}