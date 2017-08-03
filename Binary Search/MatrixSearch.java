public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        if (a == null)
            return 0;

        int row = a.size();
        int col = a.get(0).size();

        int low = 0;
        int high = row * col -1;

        while(low <= high){
            int mid = (low + high)/2;
            int mRow = mid/col, mCol = mid%col;

            if(a.get(mRow).get(mCol) == b)
                return 1;

            if(a.get(mRow).get(mCol) < b)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return 0;
    }
}
