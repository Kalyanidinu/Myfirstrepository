package javaPackage;


import java.util.Scanner;



public class Scan {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("My name: ");
		String nameString=scanner.nextLine();
		System.out.println("Your name: " + nameString);
		int nmString=scanner.nextInt();
		System.out.println("My age:"+nmString);
		
		String string=scanner.next();
		System.out.println("My spouse name is:"+string);
		
	}

	
}
