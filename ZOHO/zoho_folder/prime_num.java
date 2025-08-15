package zoho_prac;


import java.util.*;
public class Find_prime {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers");
		int n=sc.nextInt();
		System.out.println("Enter the numbers");
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.print(Arrays.toString(nums));
		for(int i=0;i<n;i++) {
			if(isprime(nums[i])) {
				System.out.println(nums[i] + " ");
			}
		}
		
	}
	public static boolean isprime(int num) {
		if(num<=1)return false;
		for(int j=2;j*j<=num;j++) {
			if(num%j==0) {
				return false;
			}
		}
		return true;
		
	}

}
