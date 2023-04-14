package LearningJavaprograms;


class FrtCls{
	int java;
	int c;
	int html;
	int marks; 
	
	public String meths1(int x, int y, int z) {
		java=x;
		c=y;
		html=z;
		
		return "marks in Java:"+x+" Marks in C language:"+y+" Marks in HTML:"+z;
	}
}
class ScdCls extends FrtCls{
	String name;
	String streetname;
	String Areaname;

public String meths1(String a, String b, String c) {
	name=a;
	streetname=b;
	Areaname=c;
	return "Name:"+a+"streetname:"+b+"Areaname:"+c;
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		FrtCls frst=new FrtCls();
		
		
String g=frst.meths1(80, 20, 100);

ScdCls obj=new ScdCls();
String kString=obj.name="venki";
String lString=obj.streetname="Missiongates";
String bString=obj.Areaname="dallas";
String b=frst.meths1(90, 70, 80+8);

System.out.println(g);
System.out.println("Name: " + kString+"\n Streetname: " + lString+" \n Areaname: " + bString);
System.out.println(b);
	}

}
