package javaPackage;

import java.text.NumberFormat;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
short a=1;
int b= a+5;
System.out.println(b);
		double x=5.5;
double y=x+1;
System.out.println(y);

double p=1.1;
int q=(int)p+2;
System.out.println(q);

String fString="1";
int g=Integer.parseInt(fString)+4;
System.out.println(g);

//NumberFormat
NumberFormat currencys=NumberFormat.getCurrencyInstance();
String gh=currencys.format(832832.923);
System.out.println(gh);
	}

}
