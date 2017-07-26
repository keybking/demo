package ba5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exe5 {
	public static void main(String[] args) {
		int array [] = {1111,521,432,344,265,0};
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = sc.nextInt();
		int index = array.length-1;
		for(int i = 0;i<array.length;i++){
			if(num>array[i]){
				index = i;
				break;
			}
		}
		for(int i = array.length-1;i>index;i--){
			array[i]=array[i-1];
		}
		array[index] =num;
		System.out.println(Arrays.toString(array));
	}
}
