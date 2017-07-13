/**
 * Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.
 */
public class Solution {
    public static final int DIR_RIGHT = 0;
    public static final int DIR_DOWN = 1;
    public static final int DIR_LEFT = 2;
    public static final int DIR_UP = 3;
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int rows = a.size();
        int columns = a.get(0).size();
        int T = 0, B = rows-1, R = columns-1, L = 0;
        int dir = DIR_RIGHT;

        while(T <= B && L <= R) {
            switch(dir) {
                case DIR_RIGHT:
                    for (int i = L; i <=R; i++)
                        result.add(a.get(T).get(i));
                    T++;
                    break;
                case DIR_DOWN:
                    for (int i = T; i <= B; i++)
                        result.add(a.get(i).get(R));
                    R--;
                    break;
                case DIR_LEFT:
                    for (int i = R; i >= L; i--)
                        result.add(a.get(B).get(i));
                    B--;
                    break;
                case DIR_UP:
                    for (int i = B; i >= T; i--)
                        result.add(a.get(i).get(L));
                    L++;
                    break;
            }
            dir = (dir+1)%4;
        }

        return result;
    }
}
