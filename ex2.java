package guvipractice;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		//Getting input from user
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("Given is Positive");
			
		}else {
			System.out.println("Given number is Negative");
		}

	}

}
