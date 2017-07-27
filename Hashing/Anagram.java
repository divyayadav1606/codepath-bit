public class Solution {
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        int i = 1;
        for (String str : a) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sorted = new String(temp);

            if (map.containsKey(sorted)) {
                ArrayList<Integer> lst = map.get(sorted);
                lst.add(i);
            } else {
                ArrayList<Integer> lst = new ArrayList<Integer>();
                lst.add(i);
                map.put(sorted, lst);
            }
            i++;
        }

        for (Map.Entry<String, ArrayList<Integer>> entrySet : map.entrySet()) {
            result.add(entrySet.getValue());
        }

        return result;
    }
}
