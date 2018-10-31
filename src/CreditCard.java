/**
 * 
 * @author tkalianda19
 *
 */
public class CreditCard
{
	private final int CARDNUM;
	private double limit;
	private double balance;
	private double interestRate;
	private String holderName;
	
	public CreditCard (int cardNumber, double lim, double interest, String name)
	{
		CARDNUM = cardNumber;
		limit = lim;
		balance = 0;
		interestRate = interest;
		holderName = name;
	}

	/**
	 * adds the amount charged to the balance
	 * @param amount       Amount charged
	 */
	public void charge(double amount)
	{
		if (balance + amount <= limit)
		{
			balance = balance + amount;
		}
	}
	
	/**
	 * Subtracts the amount credited from the balance
	 * @param amount   Amount credited
	 */
	public void credit(double amount)
	{
		balance = balance - amount;
	}
	
	/**
	 * Adds the interest rate to the balance
	 */
	public void chargeInterest()
	{
		balance = balance + (interestRate * balance);
	}
	
	/**
	 * returns the card number of the credit card (a constant)
	 * @return Card Number
	 */
	public int getCardNum()
	{
		return CARDNUM;
	}
	
	/**
	 * returns the limit of the credit card
	 * @return limit
	 */
	public double getLimit()
	{
		return limit;
	}
	
	/**
	 * returns the current balance stored in the credit card
	 * @return balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * returns the interest rate 
	 * @return interest rate
	 */
	public double getInterestRate()
	{
		return interestRate;
	}
	
	/**
	 * returns the account holder's name
	 * @return            account holder's name
	 */
	public String getHolderName()
	{
		return holderName;
	}
	
	/**
	 * converts the card into a string representation
	 * prints card number, name, balance, interest rate, and limit
	 */
	public String toString()
	{
		return "Card Number: " + CARDNUM +  " Name: " + holderName + " Balance: " + balance + " Rate: " + interestRate + " Limit: " + limit;
	}
	
}
