/**
 * You are in an infinite 2D grid where you can move in any of the 8 directions :
 * You are given a sequence of points and the order in which you need to cover the points. \
 * Give the minimum number of steps in which you can achieve it.
 */
public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        if (X.size() != Y.size())
            return 0;

        int steps = 0;

        for(int i = 1; i < X.size(); i++)
            steps += Math.max( Math.abs(X.get(i) - X.get(i-1)), Math.abs(Y.get(i) - Y.get(i-1)) );

        return steps;
    }
}