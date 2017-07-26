package demo;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		String[] names = new String[4];
		String[] dishMegs = new String[4];// 菜品
		int[] times = new int[4];
		String[] addresses = new String[4];
		int[] states = new int[4];// 订单状态
		double[] sumPrices = new double[4];

		names[0] = "张情";
		dishMegs[0] = "红烧带鱼2份";
		addresses[0] = "金水区";
		times[0] = 12;
		states[0] = 1;
		sumPrices[0] = 76.0;

		names[1] = "张三";
		dishMegs[1] = "红烧带鱼2份";
		addresses[1] = "金水区";
		times[1] = 12;
		states[1] = 0;
		sumPrices[1] = 76.0;

		String[] disNames = { "红烧带鱼", "鱼香肉丝", "时令蔬菜" };
		double[] prices = new double[] { 38.0, 20.0, 10.0 };
		int[] praseNums = new int[3];

		Scanner sc = new Scanner(System.in);
		int num = -1;
		boolean isExit = false;

		do {
			System.out.println("欢迎来到点餐系统");
			System.out.println("***************************");
			System.out.println("1：我要订餐");
			System.out.println("2：查看订单");
			System.out.println("3：签收订单");
			System.out.println("4：删除订单");
			System.out.println("5：我要点赞");
			System.out.println("6：退出系统");
			System.out.println("******************************");
			System.out.println("请选择：");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				int j =1;
				System.out.println("我要订餐");
				System.out.println("订餐人");
				names[j+2] = sc.next();
				System.out.println("菜名");
				dishMegs[j+2]=sc.next();
				System.out.println("送餐时间");
				times[j+2]=sc.nextInt();
				System.out.println("送餐地点");
				addresses[j+2]=sc.next();
				System.out.println("订单状态");
				states[j+2]=sc.nextInt();
				System.out.println("总金额");
				sumPrices[j+2]=sc.nextInt();
				j++;
			
			case 2:
				System.out.println("查看订单");
				System.out.println("序号\t" + "订餐人\t" + "菜名\t\t" + "送餐时间\t" + "送餐地点\t" + "订单状态\t" + "总金额");

				for (int i = 0; i < names.length; i++) {
					if (names[i] != null) {
						String state = (states[i] == 0) ? "以订单" : "已完成";
						System.out.println(i + "\t" + names[i] + "\t" + dishMegs[i] + "\t\t" + times[i] + "\t"
								+ addresses[i] + "\t" + state + "\t" + sumPrices[i]);
					}
				}
				break;
			case 6:
				isExit = true;
				break;
			default:
				isExit = true;
				break;
			}
			if(!isExit){
				System.out.println("输入0返回主菜单");
				num = sc.nextInt();
			}else{
				break;
			}
			
			
		} while (num == 0);
		System.out.println("谢谢使用");
		
	}
}
