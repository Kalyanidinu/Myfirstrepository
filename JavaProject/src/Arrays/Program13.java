package Arrays;
class Human{
	private int age=11;
	private String nameString="navin";
	public int getAge() {
		return age;
	}
	public String getNameString() {
		return nameString;
	}
}

public class Program13 {
//Private variables should have to create methods, other wise won't access them directly.
	public static void main(String[] args) {
		Human human=new Human();
		human.getAge();
		
		human.getNameString();
System.out.println(human.getAge()+ ":" + human.getNameString());
	}

}
