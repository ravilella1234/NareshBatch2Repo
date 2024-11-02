package icici.loans.homeloans;

public  abstract class  AbstractDemoClass implements Laptop
{
	
	@Override
	public void copy() {
		System.out.println("AbstractDemoClass copy code");
	}

	@Override
	public void paste() {
		System.out.println("AbstractDemoClass paste code");
	}

	@Override
	public void cut() {
		System.out.println("AbstractDemoClass cut code");
	}
}
