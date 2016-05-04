package com.edu.qdu.car;

public class Car extends Moto {
	private String types =null;// �������ۡ��µ�

	public Car(String MotoNo) {
		super(MotoNo);
	}

	@Override
	public double rentFee(int day) {
		// need day & type
		if (types.equals("����")) {
			setType("����");
			setFee(500);
		} else if (types.equals("����")) {
			setType("����");
			setFee(600);
		} else {
			setType("�µ�");
			setFee(400);
		}
		return super.rentFee(day);
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}



}
