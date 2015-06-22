package ba.bitcamp.predavanja;

public class OuterClass {

	 int number;
	 public InnerClass ic;
	
	 public OuterClass(){
		 this.number=5;
		 this.ic = new InnerClass(20);
	 }
	 
	class InnerClass{
		private int innerNumber;
		private int number;
		
		public InnerClass(int number){
			this.number = number;
		}
		
		public void PrintVariables(int number){
			System.out.println("Param number: "+number);
			System.out.println("Param number: "+this.number);
			System.out.println("Param number: "+OuterClass.this.number);
		}
		
	}
}
