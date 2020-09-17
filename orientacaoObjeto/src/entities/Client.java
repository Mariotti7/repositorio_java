package entities;

public class Client {

	private int numberAccount;
	private String accountHolder;
	private double depositBalance;
	private char deposite;

	public char getDeposite() {
		return deposite;
	}

	public void setDeposite(char deposite) {
		this.deposite = deposite;
	}

	public Client(int numberAccount, String accountHolder, double depositBalance, char deposite) {
		super();
		this.numberAccount = numberAccount;
		this.accountHolder = accountHolder;
		this.depositBalance = depositBalance;
		this.deposite = deposite;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getDepositBalance() {
		return depositBalance;
	}

	public void setDepositBalance(double depositBalance) {
		this.depositBalance = depositBalance;
	}
	
	
	
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void addDepositeValue(double depositeValue) {
		this.depositBalance += depositeValue;
	}
	
	public void withDrawValue(double withDrawValue, double tax) {
		this.depositBalance -= (withDrawValue + tax);
		
	}

	public String toString() {
		return "Account "
				+getNumberAccount()
				+", Holder: "
				+getAccountHolder()
				+", Balance: $ "
				+String.format("%.2f", getDepositBalance());
	}
	

}
