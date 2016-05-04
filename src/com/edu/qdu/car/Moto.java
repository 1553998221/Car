package com.edu.qdu.car;

public abstract class Moto {
	private String MotoNo;
	private double fee;
	private String type;
	
	
	public double rentFee(int day){
		return day * fee;
	}

	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Moto(String MotoNo){
		this.MotoNo = MotoNo;
	}
	

	public String getMotoNo() {
		return MotoNo;
	}

	public void setMotoNo(String motoNo) {
		MotoNo = motoNo;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
