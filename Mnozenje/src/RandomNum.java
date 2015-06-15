
public class RandomNum {

	public static void main(String[] args) {
		
		
		int d= (int)(Math.random()*5+1);
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int sum4=0;
		int sum5=0;
		
		for (int i=0;i<1001;i++)
		{
			
			if (d==1) {
				sum1++;
			}else if (d==2) {
				sum2++;
			}else if (d==3) {
				sum3++;
			}else if (d==4) {
				sum4++;
			}else {
				sum5++;
			}
		

		}
		System.out.println( "Prvi je "+sum1+"drugi "+ sum2+" treci "+sum3+"cetvrti "+sum4+"peti "+ sum5);
	}

}
