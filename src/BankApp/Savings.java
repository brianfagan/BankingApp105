package BankApp;

public class Savings extends Account {
   private double serviceFee;
   private double annualInterestRate;
   private double minBalance;
   public double getServiceFee() {
	return serviceFee;
}
public void setServiceFee(double serviceFee) {
	this.serviceFee = serviceFee;
	
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setAnnualInterestRate(double annualInterestRate) {
	
	
	this.annualInterestRate = annualInterestRate;
	annualInterestRate=.06;
}
public double getMinBalance() {
	return minBalance;
}
public void setMinBalance(double minBalance) {
	this.minBalance = minBalance;
}

   
}
