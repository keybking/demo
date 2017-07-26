package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe9 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		int index = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入一个数");
			num = sc.nextInt();
			index = i;
			if (i > 0) {
				for (int j = 0; j <= i - 1; j++) {
					if (num < arr[j]) {
						index = j;
						break;
					}
				}
				for (int j = i; j > index; j--) {
					arr[j] = arr[j - 1];
				}
				arr[index] = num;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
