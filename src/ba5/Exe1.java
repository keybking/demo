package ba5;

public class Exe1 {
	public static void main(String[] args) {
		int arr [] = {32,32,23,43,43};
		int sum = 0;
		for(int i  = 0;i<arr.length;i++){
			sum= sum+ arr[i];
		}
		System.out.println(sum/arr.length);
	}
}
