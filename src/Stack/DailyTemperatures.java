//Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
package Stack;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};
        Stack<Integer> st = new Stack<>();
        int[] res = new int[temp.length];
        int idx = 0;
        for (int i = 0; i < temp.length; i++) {
            while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
                idx = st.pop();
                res[idx] = i - idx;
            }
            st.push(i);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}