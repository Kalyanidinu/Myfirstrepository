package LearningJavaprograms;

class MyFrstCls{
	int rollno;
	String name;
	char Section;
	int marks;
	public String frstMeth(int x, String y) {
		rollno=x;
		name=y;
		return "Roll no is " +x + " Student name is:"+y;
	}
	
	
	public String secMeth(int x, String y,char z, int p) {
		rollno=x;
		name=y;
		Section=z;
		marks=p;
		return "Roll no is:"+x + " Student name is:"+y + " Grade is:"+z + "Section:"+p;
	}
}
public class MethodOverload {

	public static void main(String[] args) {
		MyFrstCls mfc=new MyFrstCls();
		String gString=mfc.frstMeth(6, "Venkateshwara");
		String h=mfc.secMeth(12, "Om Namashivaya", 'A', 560);
System.out.println(gString);
System.out.println(h);
	}

}
