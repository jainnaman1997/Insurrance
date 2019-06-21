package cg;

import java.util.Scanner;

public class CalculateSum {

	static int calculateSum(int n) {
		int sum=0, i=0, j=1;
		while(i<n) {
			if(j%3==0 || j%5==0) {
				sum+=j;
				i++;
			}
			j++;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a natural number");
		int n=sc.nextInt();
		int sum=calculateSum(n);
		System.out.println("Sum of first "+n+" natural numbers which are divisble by 3 or 5 is "+sum);
		sc.close();

	}

}
