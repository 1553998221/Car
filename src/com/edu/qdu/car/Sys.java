package com.edu.qdu.car;

import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		String[] carType = { "宝马", "奔驰", "奥迪" };
		int[] busType = { 10, 32 };
		String yn = null;
		int index = 0;
		int m = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("请输入您要租赁的车辆的数量：");
		int num = input.nextInt();
		int[] days = new int[num];
		int[] sels = new int[num];
		String[] types = new String[num];
		double[] totalFees = new double[num];
		do {
			for (int i = 0; i < num; i++) {
				if (types[i] == null) {
					index = i;
				}
			}
			System.out.println("请输入你要租赁车辆的天数：");
			days[index] = input.nextInt();
			System.out.println("1、轿车  2、客车");
			sels[index] = input.nextInt();
			if (sels[index] == 1) {
				Moto moto = new Car("鲁 B88888");
				moto.setType("轿车");
				System.out.println("请选择您要租赁轿车的类型： 1、宝马 2、奥迪 3、奔驰");
				sels[index] = input.nextInt();
				((Car) moto).setType(carType[sels[index] - 1]);
				types[index] = moto.getType();
				totalFees[index] = moto.rentFee(days[index]);
				// 输出结果
			} else {
				Moto moto = new Bus("鲁 A88888");
				moto.setType("客车");
				System.out.println("请选择您要租赁客车的类型： 1、 < 16 2、 > 16");
				sels[index] = input.nextInt();
				((Bus) moto).setSeatCount(busType[sels[index] - 1]);
				totalFees[index] = moto.rentFee(days[index]);
				types[index] = moto.getType();
			}
			m++;
			// 总输出结果

		} while (m < num);

		for (int i = 0; i < num; i++) {
			System.out.println("第" + (i + 1) + "辆车\t" + types[i] + "\t" + totalFees[i]);
		}
	}

	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
