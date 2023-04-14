package LearningJavaprograms;


//Inheritance
class Calc{
	 
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public int sub(int n1, int n2) {
	return n1-n2;
}
}
class AdvCalc extends Calc{
	public int add(int n1, int n2) {
		return n1*n2;
	}
	public int sub(int n1, int n2) {
	return n1/n2;
}
}

public class Inheritance {

	public static void main(String[] args) {
		Calc calc=new Calc();
		AdvCalc c=new AdvCalc();
		int r1=calc.sub(4, 2);
		int r2=calc.add(3, 8);
		int r3=c.add(4, 2);
		int r4=c.sub(3, 8);
		System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
		}

}
