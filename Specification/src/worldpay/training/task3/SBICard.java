package worldpay.training.task3;

public class SBICard implements ATMCard {
	@Override
	public void displayBalance() {
		System.out.println("Balance from SBI Card");

	}

	@Override
	public void withdrawMoney() {
		System.out.println("Debited from SBI Card");

	}

	@Override
	public void pinGeneration() {
		System.out.println("Pin generated for SBI Card");

	}

}
