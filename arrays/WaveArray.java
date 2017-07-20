/**
 * https://www.interviewbit.com/problems/wave-array/
 */
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        Collections.sort(a);

        for(int i = 0; i < a.size() - 1; i = i+2) {
            int temp = a.get(i);
            a.set(i, a.get(i+1));
            a.set(i+1, temp);
        }

        return a;
    }
}
