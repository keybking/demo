package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入高度");
		int height = sc.nextInt();
		for(int i=1;i<=height;i++){
			for(int n=height-1;n>i-1;n--){
				System.out.print(" ");
			}
			
			for(int j=0;j<i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i= 1;i<=height;i++){
			for(int n =0;n<height-i;n++)
				System.out.print(" ");
			for(int j =0;j<2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}
}
