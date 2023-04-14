package LearningJavaprograms;
//Method overloading means method name same, But type of arguments different.
class MyFirstClass{
	int x;
	int y;
	public int practMethod(int a, int b) {
		return a*b;
	}
}
class MySecClass extends MyFirstClass{
	int x;
	int y;
	int z;
	String p;
	public int practMethod(int a, int b) {
		x=a;
		y=b;
		
		return a+b;
	}
	
	public String practMethod(String d) {
		p=d;
		return d;
	}
	
}

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MyFirstClass mf=new MyFirstClass();
		int r=mf.practMethod(8, 2);
		MySecClass ms=new MySecClass();
		
		String t=ms.practMethod("Venkateshwara");
		
		MyFirstClass obj=new MyFirstClass();
		obj=new MySecClass();
		int k=obj.practMethod(8, 1);
		System.out.println(r);
		
		System.out.println(t);
		System.out.println(k);
	}

}
