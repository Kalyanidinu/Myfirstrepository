package Arrays;
//Dynamic method
//It will work in only inheritance.
class A{
	public void show() {
		System.out.println("In A show");
	}
}

	class B extends A{
		public void show() {
			System.out.println("in B show");
		}
	}
class C extends A{
	public void show() {
		System.out.println("in C show");
	}
}
public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new A();
obj.show();
obj=new B();

obj.show();


obj=new C();
obj.show();
	}

}
