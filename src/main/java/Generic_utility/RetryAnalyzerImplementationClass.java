package Generic_utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementationClass implements IRetryAnalyzer  {

	int count = 1;
	int retrycount=3;
	@Override
	public boolean retry(ITestResult result) {
		
		while(count<=retrycount)
		{
			count++;
			return true;
			
		}
		return false;
	}
	
}
