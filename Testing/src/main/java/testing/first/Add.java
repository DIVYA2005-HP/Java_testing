package testing.first;

import java.util.Scanner;

public class Add {

		
		public static int sum(int a,int b) {
			return a+b;
		}
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a= sc.nextInt();
			System.out.println("Enter First number");
			int b=sc.nextInt();
			System.out.println("Enter second number");
			int s=sum(a,b);
			System.out.println("Sum:"+s);
	

	}

}
