package Arrays;
class Student{
	
	
	int rollno;
	String name;
	int age;
}

public class Program9 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Dinesh";
		s1.age=18;
		
		Student s2=new Student();
		s2.rollno=5;
		s2.name="Vinay";
		s2.age=20;
		
		Student s3=new Student();
		s3.rollno=8;
		s3.name="Akhi";
		s3.age=21;
		
		
		
		Student students[]=new Student[3];
		
		
		  students[0]=s1; 
		  students[1]=s2; 
		  students[2]=s3;
		 
		
		
		 for(int i=0;i<students.length;i++) 
		 { 
			 System.out.println(students[i].name+" : " +students[i].rollno);
		
	
		 }

	}

}
