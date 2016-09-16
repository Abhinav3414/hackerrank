package algorithm;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		scan.nextLine();
		Set<String> gemSet = new HashSet<String>();
		Set<String> gemSet2 = new HashSet<String>();

		String str = scan.nextLine();
		char charArr[] = str.toCharArray();
		for (char c : charArr) {
			gemSet.add(String.valueOf(c));
		}

		if (t > 1) {

			for (int i = 1; i < t; i++) {
				gemSet2.clear();
				String str2 = scan.nextLine();
				char charArr2[] = str2.toCharArray();
				for (char c : charArr2) {
					gemSet2.add(String.valueOf(c));
				}
				gemSet.retainAll(gemSet2);

			}
			System.out.println(gemSet.size());
		} else {
			System.out.println(gemSet.size());
		}

	}

}
