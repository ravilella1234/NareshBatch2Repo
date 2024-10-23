package icici.loans.carloans;

public class Hdfc implements Rbi
{

	public static void main(String[] args) 
	{
		Hdfc h = new Hdfc();
		h.deposit();
		h.withdrawl();
	}

	@Override
	public void deposit() {
		System.out.println("iam overridden deposit in Hdfc ");
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overridden withdrawl in Hdfc ");
	}

}
