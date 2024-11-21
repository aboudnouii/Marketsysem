package bank;

import time.Date;

public class CreditCard {
	private Account bankAccount;
	private String pin;
	private String ccv;
	private Date endDate;

	public CreditCard(String pin, String ccv, Account bankAccount, Date endDate) {
		this.bankAccount = bankAccount;
		this.pin = pin;
		this.ccv = ccv;
		this.endDate = endDate;
	}

	public String getCcv() {
		return ccv;
	}

	public Date getEndDate() {
		return endDate;
	}

	public String withDraw(float money, String pin) {
		if (pin == this.pin)
			return withDraw(money) ? "WithDraw Succed" : "WithDraw is Failed";
		return "PIN is wrong";
	}

	public boolean withDraw(float money) {
		if (checkAmount(money)) {
			this.bankAccount.withDraw(money);
			return true;
		}
		return false;
	}

	public boolean checkAmount(float money) {
		if (money > 0 && money <= bankAccount.getAmount())
			return true;
		return false;
	}
}
