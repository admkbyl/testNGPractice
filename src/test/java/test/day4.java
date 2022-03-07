package test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class day4 {

//rahulonlinetutor@gmail.com
	
	
		
		@Parameters({ "URL" , "APIKey/usrname"})
		@Test
		public void webloginHomeLoan(String URL , String key)
		{
			//selenium
			System.out.println("webloginhomePersonalLoan");
			System.out.println(URL);
			System.out.println(key);
			
		}
		
		
		@Test(groups={"Smoke"})
		public void MobileLoginHomeLoan()
		{
			//Appium
			System.out.println("MobileloginHome");
		}
		
		@Test
		public void LoginAPIHomeLoan()
		{
			//Rest API automation
			System.out.println("APIloginHome");
		}
	}
	

