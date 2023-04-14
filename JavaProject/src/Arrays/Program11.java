package Arrays;

public class Program11 {
//Mutable & immutable string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str="Navin"; str=str+"reddy"; System.out.println("Hello " + str);
		 */
		StringBuffer sb=new StringBuffer("Navin");
		sb.append("reddy");
		char x=sb.charAt(1);
		System.out.println(x);
		System.out.println(sb);

	}

}
