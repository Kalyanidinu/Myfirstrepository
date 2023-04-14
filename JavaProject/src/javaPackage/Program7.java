package javaPackage;

class Firsts{
	
	int num=5;
	public int firstsMeth(int f,int g) {
		return f+g;
	}
}
public class Program7 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Firsts firsts=new Firsts();
		Firsts firsts1=new Firsts();
		int j=firsts.firstsMeth(7, 9);
		firsts.num=9;
		
		System.out.println(j);
		System.out.println(firsts.num);
		System.out.println(firsts1.num);
		
		
		

	}

}
