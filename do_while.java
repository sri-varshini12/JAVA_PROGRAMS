package varshini_java;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		do {
			System.out.println("Enter the number>10");
			count=sc.nextInt();
			
		}while(count<10);
	}

}
