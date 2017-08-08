public class Solution {
    boolean[] marked;

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        if (a.size() == 0)
            return result;

        marked = new boolean[a.size()];

        generate(a, result, new ArrayList<Integer>(), 0);

        return result;
    }

    private void generate(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> result,
                          ArrayList<Integer> temp, int index) {

        if (index == a.size()) {
            result.add(new ArrayList(temp));
            return;
        }

        for (int i = 0; i < a.size(); i++) {
            if (!marked[i]) {
                marked[i] = true;
                temp.add(a.get(i));
                generate(a, result, temp, temp.size());
                marked[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
