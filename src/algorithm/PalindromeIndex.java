package algorithm;

import java.util.Scanner;

public class PalindromeIndex {

	public static boolean checkPalindrome(String s, int index) {
		boolean isPalin = true;

		String left = s.substring(0, index);
		String right = s.substring(index + 1, s.length());

		StringBuilder sB = new StringBuilder(left);
		sB.append(right);

		int len = sB.length();

		for (int i = 0, j = len - 1; i < len / 2 && j >= len / 2; i++, j--) {
			if (sB.charAt(i) != sB.charAt(j)) {
				isPalin = false;
				break;
			}
		}

		return isPalin;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		scan.nextLine();

		for (int z = 0; z < t; z++) {
			String str = scan.nextLine();
			int len = str.length();
			int flag = 0;
			int iIndex = 0, jIndex = 0;

			for (int i = 0, j = len - 1; i < len / 2 && j >= len / 2; i++, j--) {
				if (str.charAt(i) != str.charAt(j)) {
					flag = 1;
					iIndex = i;
					jIndex = j;

					boolean isPalin = checkPalindrome(str, jIndex);
					if (isPalin == true)
						System.out.println(jIndex);
					else
						System.out.println(iIndex);

					break;
				}
			}

			if (flag == 0)
				System.out.println(-1);
		}

	}
}