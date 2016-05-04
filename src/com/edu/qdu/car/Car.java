package com.edu.qdu.car;

public class Car extends Moto {
	private String types =null;// ±¦Âí¡¢±¼³Û¡¢°ÂµÏ

	public Car(String MotoNo) {
		super(MotoNo);
	}

	@Override
	public double rentFee(int day) {
		// need day & type
		if (types.equals("±¦Âí")) {
			setType("±¦Âí");
			setFee(500);
		} else if (types.equals("±¼³Û")) {
			setType("±¼³Û");
			setFee(600);
		} else {
			setType("°ÂµÏ");
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
