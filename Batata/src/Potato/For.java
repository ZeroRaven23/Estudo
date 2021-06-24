package Potato;

import java.util.Arrays;
import java.util.Scanner;

public class For {
	static int i,i1,i2,i3;
	static int a[];
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual valor 1");
		i1 = in.nextInt(); //5 
		i3 = i1+1;
		int[] a = new int[i3];
		for(i=0;i>-1;i++) {
			System.out.println("Qual valor");
			i2 = in.nextInt();
			a[i] = i2;
			if(i == i1) {break;}
			System.out.println(Arrays.toString(a));
			}
		System.out.println(Arrays.toString(a));
		}}
