public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] sumArray = new int[a.size()];
        int maxLen = 0;
        int start =-1;
        int end = -1;
        int sum = 0;

        map.put(0, -1);

        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);

            if (map.containsKey(sum)) {
                int val = map.get(sum);
                if (maxLen < (i - val)) {
                    maxLen = i - val;
                    start = val +1;
                    end = i;
                }
            } else {
                map.put(sum, i);
            }
        }

        if (start >=0 && end >= 0 ) {
            for(int i = start ; i <=end; i++)
                result.add(a.get(i));
        }

        return result;
    }
}
public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] sumArray = new int[a.size()];
        int maxLen = 0;
        int start =-1;
        int end = -1;
        int sum = 0;

        map.put(0, -1);

        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);

            if (map.containsKey(sum)) {
                int val = map.get(sum);
                if (maxLen < (i - val)) {
                    maxLen = i - val;
                    start = val +1;
                    end = i;
                }
            } else {
                map.put(sum, i);
            }
        }

        if (start >=0 && end >= 0 ) {
            for(int i = start ; i <=end; i++)
                result.add(a.get(i));
        }

        return result;
    }
}
