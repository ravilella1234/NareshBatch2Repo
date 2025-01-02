package excelOperations;

public class Excelperations 
{

	public static void main(String[] args) throws Exception 
	{
		ExcelAPI e1 = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata1.xlsx");
		System.out.println(e1.getCellData("login", 0, 1));
		System.out.println(e1.getCellData("login", "Password", 1));
		e1.setCellData("login", 4, 4, "Passed");
	}

}
