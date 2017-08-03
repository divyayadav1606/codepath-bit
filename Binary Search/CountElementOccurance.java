public class Solution {
    // DO NOT MODIFY THE LIST

    private int findOccurance(final List<Integer> a, int b, boolean isFirst) {
        int low = 0;
        int high = a.size() - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high)/2;

            if (a.get(mid) == b) {
                result = mid;

                if (isFirst)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (a.get(mid) > b) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    public int findCount(final List<Integer> a, int b) {
        int firstOccurance = findOccurance(a, b, true);

        if (firstOccurance == -1)
            return 0;

        int lastOccurance = findOccurance(a, b, false);

        return lastOccurance - firstOccurance + 1;
    }
}
