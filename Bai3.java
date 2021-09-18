package Lab1;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		
		float canh;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Nhap chieu dai canh : ");
			canh = scanner.nextFloat();
		} while (canh <= 0);

		System.out.printf("The tich cua khoi chu nhat la: %.2f", Math.pow(canh, 3));
		
	}

}
