package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe8 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i =0;i<arr.length;i++){
			System.out.println("请输入一个数");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int min=arr[0];
		for(int i= 0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("最小值是"+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*char arrf [] = {'a','f','y','h','k','s','e'};
		Arrays.sort(arrf);
		char[] arr = Arrays.copyOf(arrf, arrf.length+1);
		char a='m';
		
		int b=0;
		System.out.println(Arrays.toString(arr));
		for(int i = arr.length-1;i>=0;i--){
			if(a>arr[i]){				
				b=i;
				System.out.println(b);
				break;
			}
		}
		for(int i =arr.length-1;i>b;i--	){
			arr[i]= arr[i-1];			
		}
		arr[b]='m';
		System.out.println(Arrays.toString(arr));*/
		
		
		
	}
}
