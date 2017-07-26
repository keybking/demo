package ba5;

import java.util.Arrays;
import java.util.Scanner;

public class Exe10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double average = 0;
		double[] arr = new double[3];
		for (int i = 1; i <= arr.length; i++) {
			double sum = 0;
			System.out.println("第" + i + "班学生的成绩");
			for (int j = 1; j <=4; j++) {
				System.out.print("第" + j + "个学生的成绩");
				double score = sc.nextDouble();
				sum += score;
			}
			average = sum / 4;
			System.out.println("第" + i + "班学生的成绩平均成绩" + average);
		}

	}
}
