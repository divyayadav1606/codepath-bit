public class Solution {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            int next = (mid + 1) % a.size();
            int prev = (mid + a.size() - 1) % a.size();

            if (a.get(mid) == b)
                return mid;

            if (a.get(low) <= a.get(mid)) {
                if (b >= a.get(low) && b <= a.get(mid))
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (b >= a.get(mid) && b <= a.get(high))
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
