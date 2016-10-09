package algorithm;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		String str2 = str.replaceAll(" ", "");

		int l = str2.length();
		int ceil = (int) Math.ceil(Math.sqrt(l));
		int floor = (int) Math.floor(Math.sqrt(l));

		if (ceil * floor < l)
			floor++;

		String[][] ss = new String[floor][ceil];

		int temp = 0;
		int j = 0;
		while (temp < l) {
			if (j == floor - 1) {
				String lastStr = str2.substring(temp, l);

				int patchLen = ceil - lastStr.length();
				StringBuilder sB = new StringBuilder(lastStr);

				while (patchLen > 0) {
					sB.append(" ");
					patchLen--;
				}
				ss[j][0] = sB.toString();

			} else
				ss[j][0] = str2.substring(temp, temp + ceil);

			temp = temp + ceil;
			j++;
		}

		int z = 0;
		while (z <= floor) {
			int flag = 0;
			for (int i = 0; i < floor; i++) {
				String sq = ss[i][0];
				System.out.print(sq.charAt(z));
				if (sq.charAt(z) == ' ')
					flag = 1;
			}

			if (flag == 1) {
			} else
				System.out.print(" ");
			z++;
		}

	}

}
