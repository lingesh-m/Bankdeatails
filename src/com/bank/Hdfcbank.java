package com.bank;

public class Hdfcbank extends Statebank {

	private void current() {
		System.out.println("current 8%");
	}

	@Override
	void saveing() {
		System.out.println("saveing 5%");
		
		
	}
	public static void main(String[] args) {
		
		Hdfcbank h=new Hdfcbank();
		h.current();
		h.deposit();
		h.saveing();
	}
	
}
