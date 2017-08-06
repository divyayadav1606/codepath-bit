public class Solution {
    // DO NOT MODIFY THE LIST
    public int singleNumber(final List<Integer> a) {
        int single = 0;

        for (int i : a) {
            single ^= i;
        }

        return single;
    }
}