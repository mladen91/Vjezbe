package ba.bitcamp.vjezbe;

import java.io.ObjectInputStream.GetField;

public class Main2 {

	public static void main(String[] args) {
		
		Wallet w = new Wallet(2);
		System.out.println(w.getWalletBalance());
		
		CreditCard c1= new CreditCard();
		c1.addMoney(7900);
		System.out.println(c1.getAccauntBalance());
		w.addCard(c1);
		System.out.println(c1);
		CreditCard c2 = new CreditCard();
		c2.addMoney(500);
		w.addCard(c2);
		System.out.println(c2);

		for (int i = 0; i < w.getNumberOfCards(); i++) {
			System.out.println(w.getCardBalance(i).getAccauntBalance());
		}

	}

}
