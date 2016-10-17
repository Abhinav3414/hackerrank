package algorithm;

import java.util.Scanner;

public class FlippingTheMatrix {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int kl = 0; kl < t; kl++) {
			int n = in.nextInt();
			int a[][] = new int[2 * n][2 * n];
			for (int i = 0; i < 2 * n; i++) {
				for (int j = 0; j < 2 * n; j++) {
					a[i][j] = in.nextInt();
				}
			}
			long sum = 0l;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (a[i][j] < a[i][2 * n - j - 1]
							|| a[i][j] < a[2 * n - i - 1][j]
							|| a[i][j] < a[2 * n - i - 1][2 * n - j - 1]) {
						a[i][j] = Math.max(a[i][2 * n - j - 1], Math.max(a[2
								* n - i - 1][j],
								a[2 * n - i - 1][2 * n - j - 1]));
					}
					sum = sum + a[i][j];
				}
			}

			System.out.println(sum);
			sum = 0;
		}

	}

}
