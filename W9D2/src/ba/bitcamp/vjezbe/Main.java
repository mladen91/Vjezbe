package ba.bitcamp.vjezbe;

public class Main {

	public static void main(String[] args) {
		// StringStack ss = new StringStack();
		// ss.push("Mladen");
		// ss.push("Ajdin");
		// ss.pop();
		// System.out.println(ss.isEmpty());
		// System.out.println(ss.peek());
		// System.out.println(ss);

		StringStackLink ssl = new StringStackLink();
		ssl.push("Mladen");
		ssl.push("Ajdin");
		System.out.println(ssl.search("Ajdin"));
		System.out.println(ssl);

	}

}
