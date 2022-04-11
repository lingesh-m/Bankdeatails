package org.bank;

public class Hdfcbank implements Statebank,Bankofindia {

	@Override
	public void fixed() {
		System.out.println("fixed 10%"); 
		
	}

	@Override
	public void deposit() {
	System.out.println("deposit 4.5%");
		
	}

	@Override
	public void saving() {
 		System.out.println("saving 3%");
	}

	@Override
	public void current() {
		System.out.println("current 4%");
	}
	public static void main(String[] args) {
	 Hdfcbank H=new Hdfcbank();
	 H.current();
	 H.deposit();
	 H.fixed();
	 H.saving();
	}

}
