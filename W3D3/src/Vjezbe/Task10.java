package Vjezbe;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		
		int[] array1= new int[100];
		
		for (int i=0;i<array1.length;i++) {
		
			array1[i]=i+1;
			if (array1[i]>10){
				array1[i]%=10;
			}else if (array1[i]==10) {
				array1[9]=0;
			}
		}
		System.out.println(Arrays.toString(array1));
	}

}
