package LearningJavaprograms;

class MyFirstCls{
	int a;
	int b;
	String c;
	public void setA(int x) {
		a = x;
	}
	public int getA() {
		return a;
	}
	public void setB(int y) {
		b = y;
	}
	public int getB() {
		return b;
	}
	public void setC(String z) {
		c = z;
	}
	public String getC() {
		return c;
	}
	
	
	
	
}



public class SetterAndGetterMethods {

	public static void main(String[] args) {
		
		MyFirstCls obj=new MyFirstCls();
		obj.setA(8);
		obj.setB(9);
		obj.setC("Venkateshwara");
		System.out.println(obj.getA()+":"+obj.getB()+":"+obj.getC());
		
		
		
	}

}
