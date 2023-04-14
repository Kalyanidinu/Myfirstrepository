package Arrays;
//Anonymous inner class
class An{
	public void show() {
		System.out.println("In show method");
	}

}
class Bb extends An{
	public void config() {
		System.out.println("In config method");
	}
}

public class Program30 {

	public static void main(String[] args) {
		
An an=new An()
{
	public void show() {
		System.out.println("In show method");
	}
};
an.show();



	}

}
