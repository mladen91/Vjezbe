package vjezbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Task2 {

	public static void main(String[] args) {

		BufferedReader in;
		JFileChooser open = new JFileChooser();
		int counter=0;
		
		int nothingInHand = 0;
		int onePair = 0;
		int twoPairs = 0;
		int threeOfAKind = 0;
		int straight = 0;
		int flush = 0;
		int fullHouse = 0;
		int fourOfAKind = 0;
		int straightFlush = 0;
		int royalFlush =0;

		int action = open.showOpenDialog(null);

		if (action == JFileChooser.APPROVE_OPTION) {
			File f = open.getSelectedFile();
			try {
				in = new BufferedReader(new FileReader(f));
				
				while(in.ready()){
				String line = in.readLine();
			
				StringTokenizer st = new StringTokenizer(line, " ");
				char c = line.charAt(line.length()-1);
				
				
				switch (c) {
				case '0':
					nothingInHand++;
					break;
				case '1':
					onePair++;
					break;
				case '2':
					twoPairs++;
					break;
				case '3':
					threeOfAKind++;
					break;
				case '4':
					straight++;
					break;
				case '5':
				flush++;
				break;
				case '6':
					fullHouse++;
					break;
				case '7':
					fourOfAKind++;
					break;
				case '8':
					straightFlush++;
					break;
				case '9':
					royalFlush++;
					break;
				}
				
				
				String s = st.nextToken();
				counter++;
				
				}
				System.out.println(counter);
				
				System.out.println("Nothing in hand: "+nothingInHand);
				System.out.println("One pair: "+onePair);
				System.out.println("Two pairs: "+twoPairs);
				System.out.println("Three of a kind: "+threeOfAKind);
				System.out.println(("Straight: "+straight));
				System.out.println("Flush: "+flush);
				System.out.println("Full House: "+fullHouse);
				System.out.println("Four of a kind: "+fourOfAKind);
				System.out.println("Straight flush: "+straightFlush);
				System.out.println("Royal flush: "+ royalFlush);

				
				
				
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
