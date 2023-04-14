package Arrays;

class Flower{
	int table;
	String bottle;
	//If we are not assign values, Constructor will take default values. 
	public Flower() {
		//System.out.println("I'm in constructor");
		table=19;
		bottle="Aqua";
	}
	public Flower(int p, String q) {
		table=p;
		bottle=q;
	}
	
	public int getTable() {
		return table;
	}
	public void setTable(int table) {
		this.table = table;
	}
	public String getBottle() {
		return bottle;
	}
	public void setBottle(String bottle) {
		this.bottle = bottle;
	}
	
}


public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flower flower=new Flower();
		Flower flower1=new Flower(18, "Naveen");
		/*
		 * flower.setBottle("Purified"); flower.setTable(2);
		 */
		System.out.println(flower.getBottle() + ":" + flower.getTable());
		System.out.println(flower1.getTable() + ":" + flower1.getBottle());
	}

}
