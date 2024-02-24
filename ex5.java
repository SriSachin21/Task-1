package guvipractice;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		if(amount<500) {
			System.out.println("No discount is applied");
		}
		else if(amount >=500 && amount<=1000) {
			System.out.println("10% discount is applied");
		}
		else if(amount >1000) {
			System.out.println("20% discount is applied");
		}
		
	}

}
