package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = tc.nextDouble();
		rectangle.height = tc.nextDouble();
		
		System.out.println("Area rectangle: " + rectangle.Area());
		System.out.println("Perimeter rectangle: " + rectangle.Perimeter());
		System.out.println("Diagonal rectangle: " + rectangle.Diagonal());


		tc.close();
	}

}
