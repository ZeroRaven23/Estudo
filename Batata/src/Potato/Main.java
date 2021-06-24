package Potato;

import java.util.Scanner;

public class Main {
	static int i,i1,i2;
	static double d,d1,d2;
	
public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual valor 1");
		i = in.nextInt(); //5
		System.out.println("Qual valor 2");
		i1 = in.nextInt(); //4
		//d = i + i1; System.out.println("Double Soma" + d);
		Batatinha.patata(); // ativar a outra função
		tatata();
}
public static void tatata() {
	Batatinha.r = i - i1;
	System.out.println("Sub : " + Batatinha.r);
}}
