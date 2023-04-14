package Arrays;

class AA{
	public void show() {
		System.out.println("In show");
	}
	//We can make static only for inner class. Not a outer class
	static class BB{
		public void config() {
			System.out.println("In config");
		}
	}
}
public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AA obj=new AA();
	
obj.show();

AA.BB obj1=new AA.BB();
obj1.config();

	}
	
}
