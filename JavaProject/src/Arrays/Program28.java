package Arrays;

abstract class Car{
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic() {
		System.out.println("play music");
	}
}

abstract class Wagnor extends Car{
	public void drive() {
		System.out.println("drive");
	}
	public void fly() {
		System.out.println("fly");
	}
}

class updatedWagnor extends Wagnor{  //Concrete class
	
}
public class Program28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new updatedWagnor();
c.drive();
c.playMusic();
c.fly();
}

}
