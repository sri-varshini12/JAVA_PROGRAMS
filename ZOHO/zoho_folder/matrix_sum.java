package zoho_prac;

import java.util.*;
public class Matrix_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
		}
	int sum=0;
	for(int k=0;k<3;k++) {
		sum=sum+matrix[k][k];
			}
	System.out.print(sum);
		}
}
