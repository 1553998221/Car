package com.edu.qdu.car;

import java.util.Scanner;

public class Sys {
	public void rentMoto() {
		String[] carType = { "����","�µ�" ,"����"  };
		int[] busType = { 10, 32 };
		String yn = null;
		int index = 0;
		
		// int m = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("welcome");
		System.out.println("��������Ҫ���޵ĳ�����������");
		int num = input.nextInt();
		int[] days = new int[num];
		int[] sels = new int[num];
		String[] types = new String[num];
		double[] totalFees = new double[num];
		double sum = 0;
		do {
			// for (int i = 0; i < num; i++) {
			// if (types[i] == null) {
			// index = i;
			// }
			// }
			System.out.println("��������Ҫ���޳�����������");
			days[index] = input.nextInt();
			System.out.println("1���γ�  2���ͳ�");
			sels[index] = input.nextInt();
			if (sels[index] == 1) {
				Moto moto = new Car("³ B88888");
				moto.setType("�γ�");
				System.out.println("��ѡ����Ҫ���޽γ������ͣ� 1������ 2���µ� 3������");
				sels[index] = input.nextInt();
				((Car) moto).setTypes(carType[sels[index] - 1]);//(carType[sels[index] - 1]);
				totalFees[index] = moto.rentFee(days[index]);
				types[index] = moto.getType();
				// ������
			} else {
				Moto moto = new Bus("³ A88888");
				moto.setType("�ͳ�");
				System.out.println("��ѡ����Ҫ���޿ͳ������ͣ� 1�� < 16 2�� > 16");
				sels[index] = input.nextInt();
				((Bus) moto).setSeatCount(busType[sels[index] - 1]);
				totalFees[index] = moto.rentFee(days[index]);
				types[index] = moto.getType();
			}
			index++;
			// ����ܽ��

		} while (index < num);

		for (int i = 0; i < num; i++) {
			System.out.println("��" + (i + 1) + "����\t" + types[i] + "\t\t" + totalFees[i]);
			sum += totalFees[i];
		}
		System.out.println("�⳵�ܻ��ѣ�"+sum);
	}

	public static void main(String[] args) {
		new Sys().rentMoto();
	}
}
