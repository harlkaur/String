import java.util.Scanner;

public class RemoveleadingzerosfromanIPaddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			removeLeadingZeros(str);
			System.out.println();
		}
	}

	private static void removeLeadingZeros(String str) {
		String[] s = str.split("\\.");
		String[] temp = new String[s.length];
		int k = 0;
		for (String ss : s) {
			if (ss.startsWith("0")) {
				int i = Integer.parseInt(ss);
				temp[k++] = String.valueOf(i);
			} else {
				temp[k++] = ss;
			}
		}

		for (int count = 0; count < temp.length - 1; count++) {
			System.out.print(temp[count] + ".");
		}
		System.out.print(temp[temp.length - 1]);
	}
}
