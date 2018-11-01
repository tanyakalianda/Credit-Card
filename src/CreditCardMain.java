/**
 * 
 * @author Tanya
 *
 */
public class CreditCardMain 
{

	public static void main(String[] args) 
	{
		CreditCard[] cards = new CreditCard[5];
		cards[0] = new CreditCard(1, 1000.00, 0.02, "Tanya" );
		cards[1] = new CreditCard(2, 1000.00, 0.02, "Tanya");
		cards[2] = new CreditCard(3, 1000.00, 0.02, "Tanya");
		cards[3] = new CreditCard(4, 1000.00, 0.02, "Tanya");
		cards[4] = new CreditCard(5, 1000.00, 0.02, "Tanya");
		
		int accountNumber = 2;
		for (CreditCard card: cards)
		{
			if (accountNumber == card.getCardNum())
			{
				card.charge(300.00);
				card.credit(50.00);
			}
			
		}
		
		accountNumber = 4;
		for (CreditCard card: cards)
		{
			if(accountNumber == card.getCardNum())
			{
				card.charge(600.00);
			}
		}
		
		for (CreditCard card: cards)
		{
			System.out.println(card.toString());
		}
	
		
		
	}

}
