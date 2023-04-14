package Arrays;


class Stud{
	int marks;
	String name;
	int age;
}
public class Program10 {

	public static void main(String[] args) {
		
		
		Stud std1=new Stud();
		std1.name="Dinesh";
		std1.marks=70;
		std1.age=30;
		Stud std2=new Stud();
		std2.name="Kalyani";
		std2.age=30;
		std2.marks=80;
		Stud std3=new Stud();
		std3.name="Akhila";
		std3.age=30;
		std3.marks=80;
		Stud std[]=new Stud[3];
		std[0]=std1;
		std[1]=std2;
		std[2]=std3;
		
		for(Stud st:std) {
			System.out.println("Name is: " + st.name + " Age is: " +st.age+" Marks: " +st.marks);
		}
	}

}
