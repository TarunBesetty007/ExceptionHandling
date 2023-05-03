package com.tarun.exceptionHandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount other) throws CurrenciesDoNotmatchException {
		if (!this.currency.equals(other.currency)) {
			// throw new Exception("Currencies " + this.currency + " & " + other.currency +
			// " do not match");
			throw new CurrenciesDoNotmatchException(
					"Currencies " + this.currency + " & " + other.currency + " do not match");
		}
		this.amount = this.amount + other.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotmatchException extends Exception {
	public CurrenciesDoNotmatchException(String message) {
		super(message);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotmatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
