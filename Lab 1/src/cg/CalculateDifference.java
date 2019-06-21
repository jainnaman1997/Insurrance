package cg;

import java.util.Scanner;

public class CalculateDifference {

	public static int calculateDifference(int n) {
		int sum1=0, sum2=0, diff;
		for(int i=1;i<=n;i++) {
			sum1+=i*i;
			sum2+=i;
		}
		sum2=sum2*sum2;
		diff=sum1-sum2;
		return diff;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a natural number");
		int n=sc.nextInt();
		int diff=calculateDifference(n);
		System.out.println("The difference between the sum of the squares of the first "+n+"\nnatural numbers and the square of their sum is "+diff);
		sc.close();

	}

}
