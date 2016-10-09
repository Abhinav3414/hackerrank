package algorithm;

import java.util.Scanner;

public class RepeatedString {

	public static boolean isSame(String str) {
		int len = str.length();
		boolean same = false;

		if (len == 1) {
			same = true;
			return same;
		} else {
			for (int i = 1; i < len; i++) {
				if (str.charAt(i - 1) == str.charAt(i))
					same = true;
				else {
					same = false;
					break;
				}
			}
		}

		return same;
	}

	public static int count(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		scan.nextLine();
		long n = scan.nextLong();

		if (isSame(str)) {
			if (str.charAt(0) == 'a')
				System.out.println(n);
			else
				System.out.println(0);
		} else {
			int countA = count(str);

			if (countA == 0)
				System.out.println(0);
			else {
				StringBuilder ss = new StringBuilder();

				int len = str.length();

				long mod = (n % len);
				long val = (n / len);
				long finCount = 0;
				finCount = finCount + (val * countA);

				for (int j = 0; j < mod; j++) {
					if (str.charAt(j) == 'a')
						finCount++;
				}
				System.out.println(finCount);
			}
		}

	}
}