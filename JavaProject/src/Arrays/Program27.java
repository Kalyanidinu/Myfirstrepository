package Arrays;

class A1{
	public void show1() {
		System.out.println("In A1");
	}
}

class B1 extends A1{
	public void show2() {
		System.out.println("In B1");
	}
}

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A1 obj=new B1();
B1 obj1=(B1)obj;
obj.show1();
obj1.show2();
	}

}
