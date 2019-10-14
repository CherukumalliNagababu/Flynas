package testCases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;
import modules.BrowserContants;
import modules.dummy;
import modules.flynasModule;
import modules.passengersDetails;
import pageobjects.BaseClass;
import pageobjects.Database;




public class flynasFlow {
	static WebDriver driver;
	private int iTestCaseRow;

	private Database PnrDetails;
	@Test
	public void test() throws Exception {
		
		if (BrowserContants.ENV.equals("PRD")) {
			RestAssured.baseURI = BrowserContants.PRD_API_URL;
			System.out.println(BrowserContants.PRD_API_URL);
		} else if (BrowserContants.ENV.equals("STG")) {
			RestAssured.baseURI = BrowserContants.STG_API_URL;
			System.out.println(BrowserContants.STG_API_URL);
		}
		//RestAssured.baseURI ="http://commonrehlat.azurewebsites.net/v1/scraping";
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "text/json");
		Response response = request.get("/GetBookingFromQueue");
		System.out.println("Response body: " + response.body().asString());
		String s=response.body().asString();
		System.out.println(s);
		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);
		
		Gson g = new Gson();
		Database[] mcArray = g.fromJson(s, Database[].class);
		List<Database> p = Arrays.asList(mcArray);
		for(Database data:p){
		try{
			PnrDetails=data;
			passengersDetails.readPnrId(PnrDetails);
			
				
				/*if(!data.PnrId.equals("143710"))
				{
					continue;
				}*/
				System.out.println(PnrDetails.PnrId);
				
				String[] depar=data.DepartureDate.split("-");
				
				String Dep_date=depar[0];
				String Dep_Mon=depar[1];
				String Dep_year=depar[2];
				System.out.println("DepartureDate:"+Dep_date);
				 System.out.println("DepartureMonth:"+Dep_Mon);
				 System.out.println("DepartureYear:"+Dep_year);
				String Ret_date= null;
				String Ret_Mon = null;
				String Ret_year= null;
				
				if(data.TripType.toLowerCase().equals("roundtrip")){
               String[] retu=data.ReturnDate.split("-");
				
				 Ret_date=retu[0];
				 Ret_Mon=retu[1];
				 Ret_year=retu[2];
				 System.out.println(Ret_date);
				 System.out.println(Ret_Mon);
				 System.out.println(Ret_year);
				 System.out.println(PnrDetails.TripType);
				 System.out.println(PnrDetails.From);
				 System.out.println(PnrDetails.To);
				}
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			System.setProperty("webdriver.chrome.driver", "D:\\jarfiles\\chromedriver.exe");
			driver = new ChromeDriver(options);
	
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
			// Log.info("Implicit wait applied on the driver for 10 seconds");
			driver.manage().deleteAllCookies();
			driver.get("https://www.flynas.com/en");
			new BaseClass(driver);
			
			flynasModule.tripType(PnrDetails,driver);
			
			flynasModule.enterFromTocitys(PnrDetails,driver);
			flynasModule.modifySearch(PnrDetails,Dep_date,Dep_Mon,Dep_year,Ret_date,Ret_Mon,Ret_year,driver);
			//flynasModule.selectFlightNumberAndCurrency(PnrDetails.Baggage,Float.parseFloat(PnrDetails.Amount),PnrDetails,driver);
			//flynasModule.selectFlightNumberReturn(PnrDetails.Baggage,Float.parseFloat(PnrDetails.Amount),PnrDetails,driver);
			dummy.selectFlightNumberReturn(PnrDetails.Baggage,Float.parseFloat(PnrDetails.Amount),PnrDetails,driver);
			flynasModule.enterDetails(PnrDetails,driver);
			passengersDetails.enterCardDetails(PnrDetails,driver);
			//passengersDetails.returnStatus(PnrDetails);
			//driver.quit();
			System.out.println("PNR ID:"+PnrDetails.PnrId +"  "+PnrDetails.Domain+" PASS ");
		
		}
		
	   catch(Exception e)
		{
			// pnrId, Domain, status, remarks

		    passengersDetails.returnStatus_fail(PnrDetails.Domain,PnrDetails.PnrId,flynasModule.status);
			System.out.println("PNR ID:"+PnrDetails.PnrId +" DOMAIN NAME "+PnrDetails.Domain+"  FAIL  "+""+e.getMessage());
			System.out.println(e);
				
			continue;
		}
		}
		
		
	}
	
	
}
