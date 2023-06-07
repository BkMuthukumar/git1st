package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void saving() {
		System.out.println("AXIS BANK SAVING: 1000");
		super.saving();
	}
@Override
public void fixed() {
	System.out.println("AXIS BANK FIXED:100000");
	super.fixed();
}
@Override
public void deposit() {
	System.out.println("AXIS BANK  DEPOSIT: 200000");
	super.deposit();
//<<<<<<< HEAD
	System.out.println("sghdw");
	System.out.println("sghdw");
//=======
	System.out.println("git working or not");
//>>>>>>> e602f71920d21c770ebc762477e8f0b9daba7d2f
}
// MAIN 
   public static void main(String[] args) {
	//OBJECT
	   AxisBank a =new AxisBank();
	   // call method
	   a.deposit();
	   a.fixed();
	   a.saving();
}
}
