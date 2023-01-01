package Easy;

public class Longest_Common_Prefix {
	public String longestCommonPrefix(String[] strs) {
		String S = "";
		char[] a = strs[0].toCharArray();
		for (int i = 0; i < a.length -1; i++) {
			int count = 0,count1 = 0;
			for (int j = 0; j < strs.length; j++) {
				if (strs[j].charAt(i) == a[i]) {
					count++;
				}
			}

			if (count >= strs.length) {
				S = S + String.valueOf(a[i]);
			}
			if (count < strs.length) {
				break;
			}

		}
		if (strs.length == 1 && strs[0].length() == 1) {
			return strs[0];
		}
		return S;
	}
	public String longestCommonPrefix1(String[] strs) {
		String S = "";
		
		
	
		return S;
	}

	public static void main(String[] args) {
		String k[] = { "flower", "flow", "flight" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix(k) + "<-fl");
		String k1[] = { "dog", "racecar", "car" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix(k1) + "<-null");
		String k2[] = { "a" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix(k2) + "<-a");
		String k3[] = { "ab", "a" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix(k3) + "<-a");
		String k4[] = { "cir", "car" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix(k4) + "<-c");
		String k5[] = { "aa", "ab" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix(k5) + "<-a");
		String k6[] = { "aa", "aa" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix(k6) + "<-aa");
		
		System.out.println("=============================================================");
		
		String L[] = { "flower", "flow", "flight" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix1(L) + "<-fl");
		String L1[] = { "dog", "racecar", "car" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix1(L1) + "<-null");
		String L2[] = { "a" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix1(L2) + "<-a");
		String L3[] = { "ab", "a" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix1(L3) + "<-a");
		String L4[] = { "cir", "car" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix1(L4) + "<-c");
		String L5[] = { "aa", "ab" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix1(L5) + "<-a");
		String L6[] = { "aa", "aa" };
		System.out.println(new Longest_Common_Prefix().longestCommonPrefix1(L6) + "<-aa");
		
	
	}

}
