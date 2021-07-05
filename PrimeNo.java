package algoprograms;

import java.util.Scanner;

public class PrimeNo {
	//method to calculate prime no
	public void findprimeNo()       
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first no : ");
		int first = sc.nextInt();
		System.out.print("Enter last no : ");
		int last = sc.nextInt();
		System.out.println("Prime numbers between " + first + " and " + last + " are : ");
		int count;
		for (int i = first; i <= last; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2)
				System.out.println(i);
		}
	}
	//main method
			public static void main(String[] args) {
				PrimeNo primeNoRange=new PrimeNo();
				primeNoRange.findprimeNo();
		
	}
}

