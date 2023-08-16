package com.abs;

public class IciciOfficial extends IciciBank {

	@Override
	public void loanToEmoloyee() {

		System.out.println("Loan TO Employees- 2%");
		
	}

public static void main(String[] args) {
	
	IciciOfficial n = new IciciOfficial();
	n.homeLoan();
	n.personalLoan();
	n.loanToEmoloyee();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
}
