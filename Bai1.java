package Lab1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		String name;
		float diemTB;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho ten sinh vien: ");
		name = scanner.nextLine();
		System.out.print("Nhap DTB cua sinh vien : ");
		diemTB = scanner.nextFloat();
		
		System.out.print("Ho ten cua sinh vien: " + name);
		System.out.print("DTB cua sinh vien: " + diemTB);

	}

}
