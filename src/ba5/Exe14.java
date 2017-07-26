package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe14 {
	public static void main(String[] args) {
		int[] arr = {12,43,2,65,45,1};
		int temp;
		for(int i = 0;i<arr.length-1;i++){
			
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp =arr[j];     
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		

	}
}
