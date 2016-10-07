package datastructure;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {
	public static int maxHistogram(int input[]) {
		Stack<Integer> st = new Stack<Integer>();
		int area = 0;
		int maxArea = -1;
		int i;

		for (i = 0; i < input.length;) {
			if (st.isEmpty() || input[st.peek()] <= input[i])
				st.add(i++);
			else {
				int top = st.pop();

				if (st.isEmpty())
					area = input[top] * i;
				else
					area = input[top] * (i - st.peek() - 1);

				if (area > maxArea)
					maxArea = area;

			}

		} // for closes

		while (!st.isEmpty()) {
			int top = st.pop();
			if (st.isEmpty())
				area = input[top] * i;
			else
				area = input[top] * (i - st.peek() - 1);
			if (area > maxArea)
				maxArea = area;

		}

		return maxArea;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();

		int maxArea = maxHistogram(a);
		System.out.println(maxArea);

	}
}
