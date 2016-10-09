package algorithm;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int c[] = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {

			c[i] = scan.nextInt();
			if (i == k) {
			} else
				sum = sum + c[i];
		}
		sum = sum / 2;
		int paid = scan.nextInt();

		if (paid == sum)
			System.out.println("Bon Appetit");
		else
			System.out.println(paid - sum);

	}
}