package Lab1;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		float a, b, c;
		Scanner scanner = new Scanner(System.in);
	
	//nhap a
		System.out.print("Nhap a = ");
		a = scanner.nextFloat();
	//nhap b
		System.out.print("Nhap b = ");
		b = scanner.nextFloat();
	//nhap c
		System.out.print("Nhap c = ");
		c = scanner.nextFloat();
		
	//tinh
		double delta = Math.pow(b, 2) - 4 * a * c;
		
	//kiem tra
		
		if (delta < 0)
			System.out.printf("Phuong trinh vo nghiem", delta);
		else
			System.out.printf("\nPhuong trinh co nghiem la: %.2f", delta, Math.sqrt(delta));
		

	}

}
