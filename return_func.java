package varshini_java;

public class return_func {
	int varshini(int money)
	{
		int soap=100;
		int rem=soap-money;
		return rem;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		return_func obj=new return_func();
		int remainder=obj.varshini(25);
		System.out.print(remainder);
	}

}
