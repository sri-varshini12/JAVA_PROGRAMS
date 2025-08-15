package zoho_prac;

import java.util.*;

public class Str_integr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		String[] words=sentence.split(" ");
		String[] original=new String[words.length];
		for(String word:words) {
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				if(Character.isDigit(ch)) {
					original[Character.getNumericValue(ch)]=word.replaceAll("\\d","");
				}
			}
		}
		String result=String.join(" ", original);
		System.out.print(result);
		

	}

}

