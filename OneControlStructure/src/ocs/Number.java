package ocs;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your number n: ");
		int n = scan.nextInt();

		int i = 1;
		int j = 1;
		int k = 1;
		
		printStar(i, j, k, n);		
	}

	private static void printStar(int i, int j, int k, int n) {
		if (i >= 1 && j >= 1 && j <= n-i){
			System.out.print(".");
			printStar(i, j+1, k, n);
		} else if (i >= 1 && i <= n && k <= i){
			System.out.print(i);
			printStar(i, j, k+1, n);			
		} else if (i >= 1 && i <= n && k > i){
			System.out.print("\n");
			printStar(i+1, 1, 1, n);
		} else if (i > n){
		}
	}
}