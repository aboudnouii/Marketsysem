package bank;
import java.util.Scanner;
import time.Date;
public class Account {
	private float amount;
	private CreditCard card;
	//private Transaction transaction;
	public Account(float amount) {
		this.amount = amount;
	}

	public CreditCard getCard() {
		return card;
	}

	private void setCard(CreditCard card) {
		this.card = card;
	}
	public void setCard()
	{
		String pin;
		String ccv;
		Scanner scanner =new Scanner(System.in);
		boolean b=false;
		do {
			
			if(b)
				System.out.println("again");
			pin = scanner.next();
			b=(pin.length()!=4);
		}while(b);
		b=false;
		do {
			if(b)
				System.out.println("again");
			ccv = scanner.next();
			b=(ccv.length()!=3);
		}while(b);
		int day=scanner.nextInt();
		int mounth=scanner.nextInt();
		int year=scanner.nextInt();
		Date dateEnd = new Date(day,mounth,year);
		
		CreditCard card = new CreditCard(pin,ccv,this,dateEnd);
		setCard(card);
		scanner.close();
	}
	public float getAmount() {
		return amount;
	}
	public void withDraw(float money) {
		this.amount = +money;
	}
	public String toString() {
		return "The Balance is : "+amount;
	}
}
