package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入高度");
		int height = sc.nextInt();
		for(int i=1;i<=height;i++){
			int sum= 0;
			for(int j=1;j<=i;j++){
				sum=j*i;
				System.out.print(j+"*"+i+"="+sum+"\t");
			}
			System.out.println();
		}
		

	}
}
