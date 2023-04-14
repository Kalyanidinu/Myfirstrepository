package Arrays;


class Different{
	public int firstMeth(int a, int b) {
		return a+b;
	}
	
	public int secondMeth(int a, int b) {
		return a*b;
	}
}
public class Program21 {

	public static void main(String[] args) {
		
Different different=new Different();
int k=different.firstMeth(2, 9);
System.out.println(k);
int u=different.secondMeth(2, 6);
System.out.println(u);
	}

}
