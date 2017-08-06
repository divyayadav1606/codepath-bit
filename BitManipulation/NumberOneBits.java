public class Solution {
    public int numSetBits(long a) {
        int bits = 0;

        while (a > 0) {
            if ((a & 1) != 0)
                bits++;
            a >>= 1;
        }

        return bits;
    }
}
