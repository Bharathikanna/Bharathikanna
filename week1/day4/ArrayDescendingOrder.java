package week1.day4;

import java.util.Arrays;

public class ArrayDescendingOrder {
	
	public static void main(String[] args) {
		
		int [] number = {10,50,40,20,30};
		
		Arrays.sort(number);
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
			
		}
		for (int i = number.length-1;i>=0; i--) {
			System.out.println(number[i]);
			
		}
		
	}
}
