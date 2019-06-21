package cg;

import java.util.Scanner;

public class CheckNumber {
	public static boolean checkNumber(int number) {
		int n=number;
		int d=n%10;
		n=n/10;
		while(n>0) {
			int e=n%10;
			if(d<e) {
				return false;
			}
			d=e;
			n=n/10;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		boolean inc=checkNumber(number);
		if(inc==true)
		System.out.println(number+" is an increasing number");
		else
			System.out.println(number+" is not an increasing number");
		sc.close();
		

	}

}
