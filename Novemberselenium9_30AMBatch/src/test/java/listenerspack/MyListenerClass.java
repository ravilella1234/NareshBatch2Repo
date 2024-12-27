package listenerspack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListenerClass implements ITestListener
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
