package Arrays;

class MySampleClass{
	public int frstMeth(int c, int d) {
		return c*d;
	}
	public String secMeth(String s) {
		return s;
		
	}

	
	class SecClass extends MySampleClass{
		/*
		 * public int frstMeth(int c, int d) { return c*d+1; }
		 */
	}
}
//Inheritance
public class Program23 {

	public static void main(String[] args) {
		SecClass obj=new SecClass();
		
		int h=obj.frstMeth(4, 5);
		System.out.println(h);
		String s=obj.secMeth("Vinny");
		System.out.println(s);

	}

}
