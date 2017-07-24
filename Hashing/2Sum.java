public class Solution {
    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(a == null || a.size() < 2) return result;

        HashMap<Integer, Integer> hashValues = new HashMap<Integer, Integer>();
        for(int i = 0; i < a.size(); i++) {
            int n = a.get(i);
            if(hashValues.containsKey(b - n)) {
                result.add(hashValues.get(b-n));
                result.add(i + 1);
                return result;
            } else if(!hashValues.containsKey(n)) {
                hashValues.put(n, i+1);
            }
        }
        return result;
    }
}