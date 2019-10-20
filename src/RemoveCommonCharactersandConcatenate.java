import java.util.HashMap;
import java.util.Scanner;

public class RemoveCommonCharactersandConcatenate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s1 = sc.next();
			String s2= sc.next();
			modifiedString(s1,s2);
		}
	}

	private static void modifiedString(String s1, String s2) {
		String result="";
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();

		for(int i=0;i<s1.length();i++) {
			map1.put(s1.charAt(i), 1);
		}
		for(int i=0;i<s2.length();i++) {
			map2.put(s2.charAt(i), 1);
		}
		for(int i=0;i<s1.length();i++) {
			if(!map2.containsKey(s1.charAt(i))) {
				result+=s1.charAt(i);
			}
		}
		for(int i=0;i<s2.length();i++) {
			if(!map1.containsKey(s2.charAt(i))) {
				result+=s2.charAt(i);
			}
		}
		if(result=="")
			System.out.println("-1");
		else
		   System.out.println(result);
	}

}
