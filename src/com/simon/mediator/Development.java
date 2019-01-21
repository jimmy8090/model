package com.simon.mediator;

public class Development implements Department {

	private Mediator m;
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);
	}

	@Override
	public void selfAction() {
		System.out.println("ר�Ŀ��У�������Ŀ");
		
		
	}

	@Override
	public void outAction() {
		System.out.println("development�㱨����");

	}

}