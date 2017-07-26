package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe7 {
	public static void main(String[] args) {
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
		
		
		int b=0;
		char arrn[] = {'q','e','t','t',	'u','o'};
		Arrays.sort(arrn);
		char arrn1[] = Arrays.copyOf(arrn, arrn.length+1);
		char aa = 'm';
		for(int i= 0;i<arrn1.length-1;i++){
			if(aa<arrn1[i]){
				b=i;
				break;
			}
		}
		for(int i = arrn1.length-1;i>b;i--){
			arrn1[i] = arrn[i-1];
		}
		arrn1[b] = 'm';
		System.out.println(Arrays.toString(arrn1));
	}
}
