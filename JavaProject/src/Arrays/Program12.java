package Arrays;



class Pen{
	String brand;
	int price;
	static String name;
	
	//Constructor
	public Pen() {
		String s1="Orbit";
		int s2;
		
		System.out.println("called constructor: ");
	}
	
	
	public static void show(Pen pen) {
		System.out.println(pen.brand + ":" +pen.price + ":" +name);
		
		
	}
	//we can not use non static variables in static method
	public static void show1(Pen pen) {
		System.out.println(pen.brand + ":" +pen.price + ":" +name);
	}
}

public class Program12 {

	public static void main(String[] args) throws Exception {
		//Class.forName(null);
Pen p=new Pen();
Pen.name="Oxford";
p.price=80;

System.out.println("The pen name is :" + Pen.name);
System.out.println("Pen price is :"  + p.price);



	}

}
