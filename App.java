package pac;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		while (true) {
			System.out.println("������a");
			Scanner sc = new Scanner(System.in);
			String user_str = sc.nextLine();
			if (!user_str.equals("a")) {
				System.out.println("������Ĳ���a������������");
				continue;
			}
			int x = (int) (Math.random() * 100);
			int y = (int) (Math.random() * 100);
			System.out.println("���ɵ���������ǣ�" + "(" + x + "," + y + ")");
		}
	}
}
