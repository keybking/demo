package ba5;

import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {
		System.out.println("请输入会员本月的消费记录");
		Scanner sc = new Scanner(System.in);
		double sum =0;
		double m;
		double arr[]=new double[5];
		for(int i= 0;i<5;i++){
			System.out.println("请输入第"+(i+1)+"笔消费金额");
			 m = sc.nextDouble();
			 arr[i]=m;
			sum+=m;
		}
		System.out.println("序号"+"\t"+"金额");
		for(int i =0;i<5;i++){
			System.out.println(i+1+"\t"+arr[i]);
		}
		System.out.println("总金额为：\t"+sum);
	}
}
