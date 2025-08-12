package varshini_java;
import java.util.Scanner;
public class funct_2 {
	void varshini(int number) {
		if (number%2==0) {
			System.out.print("The number is even");
		}
		else {
			System.out.print("The number is odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		funct_2 obj=new funct_2();
		obj.varshini(number);
	}

}
