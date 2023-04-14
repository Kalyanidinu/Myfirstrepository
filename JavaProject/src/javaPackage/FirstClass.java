package javaPackage;

import java.util.Arrays;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers= {1,8,6,9,5};
Arrays.sort(numbers);
System.out.println(numbers.length);
//System.out.println(Arrays.sort(numbers));
numbers[0]=1;
numbers[1]=2;
System.out.println(Arrays.toString(numbers));
 


	}

}
