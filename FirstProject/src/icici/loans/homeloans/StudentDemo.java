package icici.loans.homeloans;

public class StudentDemo 
{
	private int sno;
	private String name;
	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) 
	{
		StudentDemo obj = new StudentDemo();
		//System.out.println(obj.sno);
		//System.out.println(obj.name);
		
		obj.setSno(1744);
		obj.setName("ravi");
		System.out.println(obj.getSno());
		System.out.println(obj.getName());
	}

}
