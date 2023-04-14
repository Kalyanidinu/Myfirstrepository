package Arrays;



class Practice{
	public int add(int n1, int n2) {
		return n1+n2;
	}
	class Promotion extends Practice{
		
		 public int add(int n1, int n2) 
		 { 
			 return n1+n2+1; 
			 }
		 
		
	}

}
public class Program22 {

	public static void main(String[] args) {
		
		Promotion pract=new Promotion();
		int d=pract.add(1, 4);
		System.out.println(d);
	}
	}

