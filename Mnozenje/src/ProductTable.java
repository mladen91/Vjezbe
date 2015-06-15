
public class ProductTable {

	public static void main(String[] args) {
		

		TextIO.writeFile("ProductTable.txt");
		
		for (int i=-1;i<10;i++) {
			
			for (int j=-1;j<10;j++) {
			
				if (i==-1 && j==-1) {
					TextIO.putf("*  ");
				}else if (i==0 && j<10) {
					TextIO.putf("-- ");
				}else if (j==0 && i<10) {
					TextIO.putf("|  ");
				}else if(j>0 &&i==-1){
					TextIO.putf("%2d ",j);
				}else if (j==-1 && i>0) {
					TextIO.putf("%2d ",i);
				}
				
				else {
				TextIO.putf("%2d ",i*j);
				}
				
			
		
			}
			TextIO.putln(" ");
		}
		
	}
}
	


