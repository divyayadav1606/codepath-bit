/**
 * Checkpoint 2
 * Print concentric rectangular pattern in a 2d matrix. The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.
 * E.g. Input = 3
 * Expected output -
     3 3 3 3 3
     3 2 2 2 3
     3 2 1 2 3
     3 2 2 2 3
     3 3 3 3 3
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = 2*a -1;
        int mid = n/2;

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList();
            for (int j = 0; j < n; j++) {
                int rowDiff = Math.abs(mid - i);
                int colDiff = Math.abs(mid - j);

                if (rowDiff > colDiff)
                    row.add(rowDiff + 1);
                else
                    row.add(colDiff + 1);

            }
            result.add(row);
        }
        return result;
    }
}
