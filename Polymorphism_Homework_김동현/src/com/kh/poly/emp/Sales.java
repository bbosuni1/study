package com.kh.poly.emp;

public class Sales extends Employee implements Bonus {


	public Sales() {
		super();
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive() {
		
	}

}
