package Arrays;

 class Book{
	 //private variables can access only when create method for it.
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int x) {
		 age=x;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String y) {
		 name=y;
	}
}

public class Program14 {

	public static void main(String[] args) {
		
Book book=new Book();
book.setAge(10);
 book.setName("Vinny");
System.out.println(book.getAge() + ":" +book.getName());

	}

}
