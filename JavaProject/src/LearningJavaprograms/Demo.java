package LearningJavaprograms;

public class Demo {

	public static void main(String[] args) {

		AdvCalculation adv=new AdvCalculation();
		Calculation cal=new Calculation();
		
		int x=adv.sub(8, 9);
		int y=adv.div(2, 3);
        int z= cal.add(2, 6);
        int r=cal.mul(2, 3);
        String f=adv.name1("Venkateshwara");
        String g=adv.name2("Om Namashivaya");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(r);
		System.out.println(f);
		System.out.println(g);
	}

}
