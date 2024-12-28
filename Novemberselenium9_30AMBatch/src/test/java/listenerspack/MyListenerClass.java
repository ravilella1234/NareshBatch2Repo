package listenerspack;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import launcher.BaseTest;

public class MyListenerClass extends BaseTest  implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println(result.getMethod().getMethodName() + " - has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " - has Passed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " - has Failed ");
		
		//WebDriver driver;
		/*try {
			driver = (WebDriver)(result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance()));
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " - has skipped ");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " - has failed with Timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println( context.getName() +"  has started the executions....");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " has completed the executions....");
	}
	
	
}
