/**
 * Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {

        int carry = 1;
        int size = a.size();
        int i = size - 1;

        while (carry > 0 && i >= 0) {
            int sum = a.get(i) + carry;

            if (sum > 9) {
                carry = sum / 10;
                a.set(i, sum % 10);
                i--;
            } else {
                a.set(i, sum);
                carry = 0;
            }
        }

        if (carry > 0)
            a.add(0, carry);


        while(a.get(0) == 0 )
            a.remove(0);


        return a;
    }
}
