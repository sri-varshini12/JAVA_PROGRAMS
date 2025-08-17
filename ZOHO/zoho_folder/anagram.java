package zoho_prac;

import java.util.*;
public  class Anagram {
	public static boolean anagram_check(String str1,String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			if(map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
			}
			else {
			map.put(str1.charAt(i),1);
		
			}
		}
		
		for(int j=0;j<str2.length();j++) {
			if(map.containsKey(str2.charAt(j))) {
				map.put(str2.charAt(j), map.get(str2.charAt(j))-1);
			}
		}
		
		Set<Character> keys=map.keySet();
		
		for(Character key:keys) {
			if(map.get(key)!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		if(anagram_check(str1,str2)) {
			System.out.print("They are anagrams");
		}
		else {
			System.out.print("They are not anagrams");
		}
	}
}
