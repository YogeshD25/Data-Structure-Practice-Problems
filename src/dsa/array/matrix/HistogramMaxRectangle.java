package dsa.array.matrix;

import java.util.Stack;

public class HistogramMaxRectangle {

    public static void main(String args[]) {

        int[] inputArr = {2, 1, 5, 6, 2, 3};

        int[] rb = new int[inputArr.length];

        Stack<Integer> st = new Stack<>();
        st.push(inputArr.length - 1);
        rb[inputArr.length - 1] = inputArr.length;

        for (int i = inputArr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && inputArr[i] < inputArr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[i] = inputArr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }


        int[] lb = new int[inputArr.length];

        st = new Stack<>();
        st.push(0);
        lb[0] = -1;

        for (int i = 1; i < inputArr.length; i++) {
            while (st.size() > 0 && inputArr[i] < inputArr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < inputArr.length; i++) {
            int width = rb[i] - lb[i] - 1;

            int area = inputArr[i] * width;

            if (maxArea < area) {
                maxArea = area;
            }
        }

        System.out.println(maxArea);
    }
}
