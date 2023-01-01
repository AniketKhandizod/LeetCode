package Easy;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		char d[] = s.toCharArray();
		String S = "";
		for (int i = d.length - 1; i >= 0; i--) {
			S = S + d[i];
		}

		if (s.equalsIgnoreCase(S)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		System.out.println(new PalindromeNumber().isPalindrome(-121));
	}

}
