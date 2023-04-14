package javaPackage;

class Ball{
	public void method1() {
		System.out.println("My playing ball");
	}
	//Here given number is lessthan 10 so return 0
	public int method2(int x) {
		if(x>=10) {
		return x;
		}
		else {
			
		
		return 0;
		}
	}
	
	public String method3(String str) {
		
		return str;
	}



}

public class Program5 {

	public static void main(String[] args) {
		Ball ball=new Ball();
		ball.method1();
		int y=ball.method2(12);
		String xString=ball.method3("saraswathi");
		System.out.println(y);
		System.out.println(xString);
		
	}

}
