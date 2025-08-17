package zoho_prac;
//Leetcode--->leetcode
import java.util.*;
public class First_nonrepeat_chrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine().toLowerCase();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),1);
			}
			else {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(map.get(ch)==1) {
				System.out.print("The non repeating chrct is" + " " + ch);
				break;
			}
			else {
				System.out.print("Their is no repeating chrct");
			}
		}
	}
}

