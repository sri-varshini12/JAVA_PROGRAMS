package zoho_prac;

import java.util.*;
public class Coin_sum {

	
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static double result(int n,int r) {
		double res=fact(n)/(fact(r)*fact(n-r));
		double resul=res/(Math.pow(2,n));
		return resul;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		System.out.print(result(n,r));
	}

}
