package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			int n = 0;
			System.out.println("请输入第" + i + "个人所购三件商品的价格");
			for (int j = 0; j < 3; j++) {
				System.out.print("第" + (j + 1) + "件商品价格为：");
				int price = sc.nextInt();
				if (price < 300) {
					continue;
				} 
				n++;

			}
			
			System.out.println("第" + i + "个人有" + n + "件商品享受八折");
		}

	}
}
