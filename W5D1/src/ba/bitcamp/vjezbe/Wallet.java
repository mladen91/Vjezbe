package ba.bitcamp.vjezbe;

public class Wallet {

	private int moneyQuantity;
	private CreditCard[] cardArray;
	
	public Wallet(int maxCards) {
		this.moneyQuantity = 0;
		this.cardArray = new CreditCard[maxCards];
	} 
	
	public void addMoneyToWallet(int money) {
		moneyQuantity += money;
	}
	
	public void removeMoneyFromWallet(int money) {
		if (moneyQuantity - money >=0) {
		moneyQuantity -= money;
		}else {
			System.out.println("You can't do that!");
		}
	}
	
	public void addCard (CreditCard c) {
		for (int i = 0; i < cardArray.length; i++) {
			if (cardArray[i] == null) {
				cardArray[i] = c;
				break;
			}
					
		}
	}
	public int getWalletBalance() {
		return moneyQuantity;
	}
	
	public int getNumberOfCards() {
		return cardArray.length; 
	}
	
	public CreditCard getCardBalance(int i) {
		return cardArray[i];
	}
	
	

	
}
