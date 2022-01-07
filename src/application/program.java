package application;

import java.util.Locale;
import java.util.Scanner;
import entities.triangle;

public class program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangle x;
		triangle y;
		x = new triangle();
		y = new triangle();
		
		System.out.println("entre com os dados do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("entre com os dados do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("a area do triangulo x é: %.4f%n",areax);
		System.out.printf("a area do triangulo y é: %.4f%n",areay);
		
		if(areax > areay) {
			System.out.println("area maior e a x");
		}
		else {System.out.println("a area maior e a y");			
	}
		sc.close();
	}
}
