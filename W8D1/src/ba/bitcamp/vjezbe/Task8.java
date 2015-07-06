package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		

		int[] arr = new int[]{2,3,4,5,6,7,8};
		int counter=0;
		int counter1=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0){
				counter++;
			}else {
				counter1++;
			}
		}
		
		int [] helpArrEven = new int[counter];
		int [] helpArrOdd = new int[counter1];
		int j=0;
		int k=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2==0){
				helpArrEven[j]=arr[i];
				j++;
			}else if(arr[i]%2==1){
				helpArrOdd[k]=arr[i];
				k++;
			}
		}
		int l = 0;
		for (int i = 0; i < arr.length; i++) {
			
			if (i<=helpArrOdd.length){
			arr[i]=helpArrEven[i];	
			}else if(i>=helpArrEven.length){
				arr[i]=helpArrOdd[l];
				l++;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
