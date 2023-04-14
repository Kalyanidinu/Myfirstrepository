package Arrays;
class Laptop1{
	String model;
	int price;
	//We need to assign 
	public String toString() {
		return model+":"+price;
	}
	public boolean equals(Laptop that) {
		if(this.model.equals(that.model) && this.price==that.price){
			return true;
			
		}
		return false;
	}



public class Program26 {

	public static void main(String a[]) {
		Laptop1 lp=new Laptop1();
		lp.model="HP";
		lp.price=2000;
		//By default it has taken hashcode value, toString method it has taken, So value not displaying
		//System.out.println(lp);

		
		Laptop1 lp2=new Laptop1();
		lp2.model="HP";
		lp2.price=2000;
		
		boolean result=lp.equals(lp2);
		System.out.println(result);
		
	}

}
}
