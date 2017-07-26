package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入高度");
		int height = sc.nextInt();
		for(int i=height;i>=1;i--){
			for(int j=0;j<i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
