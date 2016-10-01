package datastructure;

import java.util.Scanner;
import java.util.Stack;

class StackNode {
	int val;
	int currMax;

	public StackNode() {
	}

	public StackNode(int val, int currMax) {
		this.val = val;
		this.currMax = currMax;
	}

	public String toString() {
		return ("val " + val + " max " + currMax);
	}
}

public class MaximumElement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Stack<StackNode> st = new Stack<StackNode>();

		int n = scan.nextInt();

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int q = scan.nextInt();

			if (q == 1) {
				int element = scan.nextInt();
				if (element > max)
					max = element;

				st.push(new StackNode(element, max));

			} else if (q == 2) {
				st.pop();
				if (st.isEmpty())
					max = 0;
				else {
					StackNode sta = st.peek();
					max = (sta.currMax);
				}
			} else {
				StackNode sta = st.peek();
				System.out.println(sta.currMax);

			}
			// System.out.println(st);
		}
		// System.out.println(st);

	}
}