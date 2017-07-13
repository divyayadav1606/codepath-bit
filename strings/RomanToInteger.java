/**
 * Given a roman numeral, convert it to an integer.
 */
public class Solution {
    public int romanToInt(String a) {
        char[] c = a.toCharArray();
        int[] num = new int[c.length];

        for (int i = 0; i < c.length; i++) {
            switch(c[i]) {
                case 'M':
                    num[i] = 1000;
                    break;
                case 'D':
                    num[i] = 500;
                    break;
                case 'C':
                    num[i] = 100;
                    break;
                case 'L':
                    num[i = 50;
                    break;
                case 'X' :
                    num[i] = 10;
                    break;
                case 'V':
                    num[i] = 5;
                    break;
                case 'I':
                    num[i] = 1;
                    break;
            }
        }

        int sum = 0;
        for(int i = 0; i < num.length-1; i++){
            if(num[i] < num[i+1])
                sum -= num[i];
            else
                sum += num[i];
        }
        return sum + num[num.length - 1];

    }
}
