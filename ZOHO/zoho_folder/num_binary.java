package zoho_prac;

import java.util.*;
public class Num_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary="";
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a>0) {
			int remainder=a%2;
			binary=remainder+binary;
			a=a/2;
		}
		System.out.print(binary);
	}

}
