/**
 * Checkpoint 5
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * Example : [1,1,2] have the following unique permutations
 * [1,1,2], [1,2,1], [2,1,1]
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> num) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        results.add(new ArrayList<Integer>());

        for (int i = 0; i < num.size(); i++) {
            Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
            for (List<Integer> l : results) {
                for (int j = 0; j < l.size() + 1; j++) {
                    l.add(j, num.get(i));
                    ArrayList<Integer> T = new ArrayList<Integer>(l);
                    l.remove(j);
                    currentSet.add(T);
                }
            }
            results = new ArrayList<ArrayList<Integer>>(currentSet);
        }

        return results;
    }
}