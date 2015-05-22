package ba.BITCamp.Mladen.MojPaket;

public class Area {

	public static void main(String[] args) {
		int a=2, b=3, r=5;
		double pi=3.14;
		int P=a*b;
		int O=2*(a+b);
		//Formula za povrsinu kruga je:r*r*pi//
		double Pk=(r*r*pi);
		//Formula za obim kruga je:2*r*pi //
		double Ok=(2*r*pi); 
		
		
		System.out.println("Povrsina je:"+P);
		System.out.println("Obim je:"+O);
		System.out.println("Povrsina kruga je: "+Pk);
		System.out.println("Obim kruga je:"+Ok);

	}

}
