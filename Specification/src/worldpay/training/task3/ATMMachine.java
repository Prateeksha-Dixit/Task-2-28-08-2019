package worldpay.training.task3;

public class ATMMachine {
	
ATMCard atm;
	
	public void setCard(ATMCard atm)
	{
		this.atm=atm;
	}
	
	public void showBalance() 
	{
		if(atm!=null)
		{
			atm.displayBalance();
		}
		else
		{
			System.out.println("No Card Inserted");
		}
	}
	
	public void showWithdraw()
	{
		if(atm!=null)
		{
			atm.withdrawMoney();
		}
		else
		{
			System.out.println("No Card Inserted");
		}
	}

	public void showPin()
	{
		if(atm!=null)
		{
			atm.pinGeneration();
		}
		else
		{
			System.out.println("No Card Inserted");
		}
	}

	public static void main(String[] args) {
		
		ATMMachine atmMachine= new ATMMachine();
		atmMachine.setCard(new SBICard());
		atmMachine.showBalance();
		atmMachine.showPin();

	}

}
