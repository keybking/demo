package ba5;

import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		String arr[] = new String[]{"李宁","特步"	,"ad","贵人鸟"};
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		int score;
		boolean a = false;
		int s[] = new int[]{1,3,4,3,4,5,};
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<s.length;i++){
			System.out.println("chengji");
			int sys = sc.nextInt();
			if(s[i]==sys){
				a= true;
				break;
			}
		}
		System.out.println(a?"猜对了":"猜错了");
	}
}
