package ba.bitcamp.predavanja;

public class MainFooBar {

	public static void main(String[] args) {

		OuterClass oc = new OuterClass();
		
		System.out.println(oc);
		
		Foo[] f = new Foo[3];
		f[0] = new Foo(10);
		f[1] = new Foo(20);
		f[2] = new Foo(30);

		
		Bar[] b = new Bar[3];
		b[0] = new Bar("mladen");
		b[1]= new Bar("abe");
		b[2] = new Bar("abcdd");



		System.out.println(getMax(f));
	}

	private static Compare getMax(Compare[] array) {
		Compare max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max.compare(array[i]) == -1) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static Bar getMax(Bar[] array) {
		Bar max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max.compare(array[i]) == -1) {
				max = array[i];
			}
		}
		return max;
	}

}
