package Lab1;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		
		float ChieuDai, ChieuRong;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Nhap chieu dai : ");
			ChieuDai = scanner.nextFloat();
		} while (ChieuDai <= 0);
		do {
			System.out.print("Nhap chieu rong: ");
			ChieuRong = scanner.nextFloat();
		} while (ChieuRong <= 0);

		System.out.printf("\nChu vi hinh chu nhat la: %.2f", (ChieuDai + ChieuRong) * 2);
		System.out.printf("\nDien tich hinh chu nhat la: %.2f ", ChieuDai * ChieuRong);
		System.out.printf("\nCanh nho nhat cua hinh chu nhat la: %.2f", Math.min(ChieuDai, ChieuRong));
		

	}

}
