package Practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("User Enter number ");
		
		int num=sc.nextInt();
				
				
				
		 StringBuilder str=new StringBuilder();
		 str.append(num);
		 StringBuilder reverse=str.reverse();
		 
		 System.out.println("Reverse Number is "+reverse);
		

	}

}
