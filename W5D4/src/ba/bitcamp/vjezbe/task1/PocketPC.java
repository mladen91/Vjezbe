package ba.bitcamp.vjezbe.task1;

public class PocketPC extends PortableComputer {

	protected boolean supportTouchInterface;
	protected boolean supportSimCards;
	protected boolean supportMicroSdCards;

	public boolean isSupportTouchInterface() {
		return supportTouchInterface;
	}

	public void setSupportTouchInterface(boolean supportTouchInterface) {
		this.supportTouchInterface = supportTouchInterface;
	}

	public boolean isSupportSimCards() {
		return supportSimCards;
	}

	public void setSupportSimCards(boolean supportSimCards) {
		this.supportSimCards = supportSimCards;
	}

	public boolean isSupportMicroSdCards() {
		return supportMicroSdCards;
	}

	public void setSupportMicroSdCards(boolean supportMicroSdCards) {
		this.supportMicroSdCards = supportMicroSdCards;
	}

	public void printTypeInfo(){
		System.out.println("They are used widely. Their main advantage is portability, and functionality.");
		System.out.println("The main idea is possibility of configurations as you wish.");
	} 
	public String toString(){
		String s="";
		s= "Support touch interfaces: "+supportTouchInterface;
		s=s+"\nSIM card supported: "+supportSimCards;
		s=s+"\nMicroSD card supported: "+supportMicroSdCards;
		return s;
	}
}
