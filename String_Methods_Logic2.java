package learningString;

public class String_Methods_Logic2 {

	public static void main(String[] args) {
		String_Methods_Logic2 obj = new String_Methods_Logic2();

		String message = "one two three";
		System.out.println("The Given String :" + message);

		String my_str = print_reverse_string(message);
		
		System.out.println("The String Reversed :" + my_str);

		print_reverse_string_literal(my_str);

	}

	static String print_reverse_string(String s1) {

		char[] a = s1.toCharArray();

		char[] t = new char[a.length];

		int j = a.length - 1;

		for (int i = 0; i < a.length / 2; i++) {

			t[i] = a[i];

			a[i] = a[j];

			a[j] = t[i];

			j--;

		}

		// converting a char[] into String
		String str = new String(a);
		return str;

	}

	static void print_reverse_string_literal(String s) {

		System.out.print("Words reversed in reversed String :");

		String[] a = s.split(" ");

		String[] array = new String[a.length];

		for (int i = 0; i < a.length; i++) {
			array[i] = print_reverse_string(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
