package learningString;

public class String_methods_logic {

	public static void main(String[] args) {

		String_methods_logic s = new String_methods_logic();
		s.print_endswith_methods();
		s.print_startswith_methods();
		s.print_contains_method();
		s.print_uppercase_method();

	}

	void print_endswith_methods() {
		String s1 = "joshua";
		String s2 = "uua";

		// System.out.println(s1.endsWith("uua"));

		boolean b = false;
		int j = s2.length();// 2
		int i = 0;

		while (i < s2.length()) {
			if (s2.charAt(i) == s1.charAt(s1.length() - j)) {
				b = true;

			} else {
				b = false;
				break;
			}
			i++;
			j--;

		}
		if (b == false) {
			System.out.println("false");
		} else
			System.out.println("true");

	}

	void print_startswith_methods() {
		String s1 = "joshua";
		String s2 = "joo";

		// System.out.println(s1.startsWith("joo"));

		boolean b = false;

		int i = 0;

		while (i < s2.length()) {
			if (s2.charAt(i) == s1.charAt(i)) {
				b = true;

			} else {
				b = false;
				break;
			}
			i++;

		}
		if (b == false) {
			System.out.println("false");
		} else
			System.out.println("true");

	}

	void print_contains_method() {

		String s1 = "java";
		String s2 = "vaa";
		String t = null;

		// System.out.println(s1.contains("vap"));

		boolean b = false;

		for (int j = 0; j < s2.length(); j++) // s2 index =j
		{
			for (int i = 0; i < s1.length(); i++) // s1 index =i
			{
				if (s2.charAt(j) == s1.charAt(i)) {

					int m = i;
					int n = i + s2.length();

					for (int k = 0; k < s2.length(); k++) {
						if (n > s1.length() - 1) {
							break;
						}

						t = s1.substring(m, n);

					}
				}

			}
			if (t == null) {
				System.out.println(false);
				break;
			} else if (t.equals(s2)) {
				System.out.println(true);
				break;
			}

		}

	}

	void print_uppercase_method() {
		String s = "abcdefghijklmnopqrstuvwxyz";// index j

		String input = "aeiou";// index i
		int t;
		char[] temp = new char[s.length()];
		char c;

		for (int j = 0; j < s.length(); j++) {
			for (int i = 0; i < input.length(); i++) {
				if (s.charAt(j) == input.charAt(i)) {
					t = s.charAt(j);
					t = t - 32;
					c = (char) t;
					temp[j] = c;
					break;

				} else {
					temp[j] = s.charAt(j);
				}
			}
		}
		System.out.println(temp);
	}
}
