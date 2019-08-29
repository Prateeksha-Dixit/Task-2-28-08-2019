package worldpay.training.task3;

public class HSBCCard implements ATMCard {

	@Override
	public void displayBalance() {
		System.out.println("Balance from HSBC Card");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("Debit from HSBC Card");

	}

	@Override
	public void pinGeneration() {
		System.out.println("Pin generation for HSBC Card");

	}

}
