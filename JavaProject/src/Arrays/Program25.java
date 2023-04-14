package Arrays;

class Laptop{
	String model;
	int price;
	public String toString() {
		return model+":"+price;
	}
	
}



public class Program25 {

	public static void main(String[] args) {
		Laptop obj=new Laptop();
		obj.model="Lenovo";
		obj.price=1000;
		System.out.println(obj);
	}

}
