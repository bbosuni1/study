package com.kh.product;

public class Tv extends Product{
	
	private int channel = 1;

	public Tv() {
		super();
	}

	public Tv(String model, String color, String brend) {
		super(model, color, brend);
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(this.getModel() + " : " +channel + " 번 채널을 확인합니다");
	}

}
