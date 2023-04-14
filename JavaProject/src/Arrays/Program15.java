package Arrays;
class Humans{
	private int age;
	private String nm;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	
}
public class Program15 {

	public static void main(String[] args) {
		
Humans humans=new Humans();
humans.setAge(40);
humans.setNm("Dinesh");
System.out.println(humans.getAge() + ":" + humans.getNm());
	}

}
