package ba.bitcamp.vjezbe;

public class CreditCard {

	private int cardNumber;
	private String bank;
	private int expiringMonth;
	private int expiringYear;
	private int accauntBalance;

//	public CreditCard(int cardNumber, String bank, int expiringMonth,
//			int expiringYear, int accauntBalance) {
//		this.cardNumber = cardNumber;
//		this.bank = bank;
//		this.expiringMonth = expiringMonth;
//		this.expiringYear = expiringYear;
//		this.accauntBalance = accauntBalance;
//	}

	public void addMoney(int money) {
		accauntBalance += money;
	}

	public void removeMoney(int money) {
		accauntBalance -= money;
	}

	public int getAccauntBalance() {
		return accauntBalance;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + ", bank=" + bank
				+ ", expiringMonth=" + expiringMonth + ", expiringYear="
				+ expiringYear + ", accauntBalance=" + accauntBalance + "]";
	}
	
	
	

}