package Arrays;

class Human1{
	private int x;
	private int y;
	private String name;
	
	public Human1() {
		x=12;
		name="Vinny";
		
	}
	public Human1(int a, String s) {
		x=a;
		name=s;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Program18 {

	public static void main(String[] args) {
		
Human1 objHuman1=new Human1();
Human1 obj=new Human1(18, "Navin");

//objHuman1.setName("Dinesh");
//objHuman1.setX(10);
System.out.println(objHuman1.getName());
System.out.println(obj.getName()+ ":"+ obj.getX());
	}

}
