package varshini_java;

import java.util.Random;
public class randomprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand=new Random();
		int newnum=0;
		
		while(newnum!=5) {
			newnum=rand.nextInt(11);
			System.out.println(newnum);
		}
	}

}
