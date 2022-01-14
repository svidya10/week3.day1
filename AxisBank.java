package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
	System.out.println("Child Deposit");	
	}
	public static void main(String[] args) {
		AxisBank bank = new AxisBank();
		bank.savings();
		bank.fixed();
		bank.deposit();

	}

}
