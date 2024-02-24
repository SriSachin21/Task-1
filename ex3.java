package guvipractice;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int temp=0;
		int rem=0;
		while(value!=0) {
			rem=value%10;
			temp=temp*10+rem;
			value=value/10;
		}
		System.out.println(temp);
	}

}
