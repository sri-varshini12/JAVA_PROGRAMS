package zoho_prac;

import java.util.*;
public class Int_float {
	
	
	public static int findgcd(int num,int deno) {
		while(deno!=0) {
			int temp=deno;
			deno=num%deno;
			num=temp;
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		int integrpart=(int)a;
		double decimalpart=a-integrpart;
		int convert=(int)(decimalpart*100);
		int gcd=findgcd(convert,100);
		int numerator= convert/gcd;
		int denomerator=100/gcd;
		System.out.print(integrpart +" " + numerator +"/" + denomerator);
	}
}
