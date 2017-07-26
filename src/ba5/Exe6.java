package ba5;

import java.util.Arrays;

public class Exe6 {
	public static void main(String[] args) {
		int arr1 [] = {1,2,3,4};
		int arr2 [] = {11,22,33,44};
		System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		Arrays.fill(arr1, 33);
		System.out.println(arr1);
		int[] arr4 = Arrays.copyOf(arr1, 3);
		
		
	}
}
