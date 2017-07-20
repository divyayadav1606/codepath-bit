/**
 * https://www.interviewbit.com/problems/hotel-bookings-possible/
 */
public class Solution {
    private int checkout(int checkin, int[] rooms) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] <= checkin)
                return i;
        }
        return -1;
    }

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {

        int[] rooms = new int[K];

        if (arrive.size() != depart.size())
            return false;

        Collections.sort(arrive);
        Collections.sort(depart);

        for ( int i = 0, j = 0; i < arrive.size(); i++) {
            if (j < K) { //free room
                rooms[j] = depart.get(i);
                j++;
            } else {
                int x = checkout(arrive.get(i), rooms);
                if (x == -1)
                    return false;
                rooms[x] = depart.get(i);
            }
        }
        return true;
    }
}
