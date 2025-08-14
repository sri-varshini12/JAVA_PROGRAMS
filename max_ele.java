package varshini_java;

public class max_elem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,2,5,7,1};
		int max_ele=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max_ele) {
				max_ele=arr[i];
			}
		}
		System.out.print(max_ele);
	}

}
