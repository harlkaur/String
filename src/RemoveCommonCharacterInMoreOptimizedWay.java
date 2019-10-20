import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveCommonCharacterInMoreOptimizedWay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s1 = sc.next();
			String s2 = sc.next();
			modifiedString(s1, s2);
			System.out.println();
		}
	}

	private static void modifiedString(String s1, String s2) {
		boolean flag = false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			map.put(s1.charAt(i), 1);
		}
		for (int i = 0; i < s2.length(); i++) {
			if (map.containsKey(s2.charAt(i)) && (map.get(s2.charAt(i)) != -1)) {
				map.put(s2.charAt(i), map.get(s2.charAt(i)) + 1);
			} else {
				map.put(s2.charAt(i), -1);
			}
		}

		for (int i = 0; i < s1.length(); i++) {
			if (map.get(s1.charAt(i)) == 1) {
				flag = true;
				System.out.print(s1.charAt(i));
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			if (map.get(s2.charAt(i)) == -1) {
				flag = true;
				System.out.print(s2.charAt(i));
			}
		}
		if (!flag) {
			System.out.print("-1");
		}

	}

}
