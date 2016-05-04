package com.edu.qdu.car;

public class Bus extends Moto {
	private int seatCount = 0;

	public Bus(String MotoNo) {
		super(MotoNo);
	}

	@Override
	public double rentFee(int day) {
		if (seatCount >= 16) {
			setType(">16");
			setFee(2000);
		} else {
			setType("<16");
			setFee(1000);
		}
		return super.rentFee(day);
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

}
