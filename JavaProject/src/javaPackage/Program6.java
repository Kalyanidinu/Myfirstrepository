package javaPackage;


class Calculators{
	public int firstMethod(int a,int b) {
		return a+b;
		
	}
	public int secondMeth(int c, int d, int e) {
		return c*d*e;
		
	}
}

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculators cal=new Calculators();
		int x=cal.firstMethod(8, 9);
		System.out.println(x);
		int y=cal.secondMeth(1, 2, 3);
		System.out.println(y);
		
	}

}
