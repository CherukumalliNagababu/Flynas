package modules;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Container;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageobjects.Database;
import pageobjects.PageUtils;
import pageobjects.flynasPage;


public class flynasModule extends passengersDetails {
	  private static WebDriver driver;
	
	public static String status;
	
	
	public static void tripType(Database pnrDetails,WebDriver driver) throws Exception {
		try{
		
		if ("OneWay".equals(pnrDetails.TripType)) {
			
			PageUtils.clickElement(driver,flynasPage.oneyWay_f());
			System.out.println("Select OneWay Trip");
			
		} else if ("RoundTrip".equals(pnrDetails.TripType))
			//flynasPage.roundTrip_f().click();
			System.out.println("Select Round Trip");
		  
		
		}
		catch(Exception e)
		{
			status="TripType error";
			PageUtils.getScreenShot(pnrDetails.PnrId,driver);
			driver.quit();
			
		}
		PageUtils.getScreenShot(pnrDetails.PnrId,driver);
		
	}
	
	public static void enterFromTocitys(Database pnrDetails,WebDriver driver ) throws Exception
	{
		try{
		PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
		PageUtils.clickElement(driver,flynasPage.clk_From());
		
		PageUtils.sendKeysAfterClearingElement(driver, flynasPage.txt_From(), pnrDetails.From);
		flynasPage.txt_CityName_Enter(pnrDetails.From).click();
		
		
		System.out.println("Select From City:"+pnrDetails.From);
		PageUtils.sendKeysAfterClearingElement(driver, flynasPage.txt_To(), pnrDetails.To);
		flynasPage.txt_CityName_Enter(pnrDetails.To).click();
		System.out.println("Select TO City:"+pnrDetails.To);
		
		
		flynasPage.drp_date_clk().sendKeys(Keys.TAB);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[contains(text(),'1 Adult')]")).click();
		//Thread.sleep(1000);
		

		int Adult = Integer.parseInt(pnrDetails.Adults);
		System.out.println(Adult);
		for (int i = 0; i < Adult - 1; i++) {
			flynasPage.adult_increase().click();
		}
		int Child = Integer.parseInt(pnrDetails.Childs);
		System.out.println(Child);
		for (int i = 0; i < Child; i++) {
			flynasPage.child_increase().click();

		}
		int infant = Integer.parseInt(pnrDetails.Infants);
		System.out.println(infant);

		for (int i = 0; i < infant; i++) {
			flynasPage.infant_increase().click();
		}
		
        
         PageUtils.getScreenShot(pnrDetails.PnrId,driver);
         System.out.println("Select Number of Passengers");
         PageUtils.clickElement(driver, flynasPage.btn_Search());
         alertBox(driver);
		
	}

	catch(Exception e)
	{
		status="Home page Error";
		PageUtils.getScreenShot(pnrDetails.PnrId,driver);
		driver.quit();
	}
	}
	
	public static void modifySearch(Database pnrDetails,String d,String m,String y,String r_d,String r_m,String r_y,WebDriver driver) throws Exception
	{
		Date mDate = new Date();
		 DateFormat date = new SimpleDateFormat("dd MMM");
		 String Date=date.format(mDate);
		 PageUtils.isElementLocated(driver, By.xpath("//div[@id='divModifyheader']/h2"));
		 PageUtils.waitForElementTextToBe(driver, flynasPage.bookingPage_Text(), "*KSA VAT 5% is applied for Domestic Flights only");
		 String s=flynasPage.bookingPage_Text().getText();
		 System.out.println(s);
		 Thread.sleep(2000);
		try{
		if("OneWay".equals(pnrDetails.TripType))
		{
			PageUtils.isElementDisplayed(driver, flynasPage.btn_Modify());
			//PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL_ENGINE);
			 PageUtils.clickElement(driver, flynasPage.btn_Modify());
			 //PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.isElementDisplayed(driver, flynasPage.btn_depe());
			 PageUtils.clickElement(driver, flynasPage.btn_depe());
			// PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.isElementDisplayed(driver, flynasPage.border_MandY_D());
			 PageUtils.clickElement(driver, flynasPage.border_MandY_D());
			// PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.isElementDisplayed(driver, flynasPage.border_Year_D());
			 PageUtils.clickElement(driver, flynasPage.border_Year_D());
			 //PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.isElementDisplayed(driver, flynasPage.select_Year_D(y));
			 PageUtils.clickElement(driver, flynasPage.select_Year_D(y));
			// PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 flynasPage.select_Month_D(m);
			 //PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
			 flynasPage.SelectDate(d);
			// PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
			 String GetDate= flynasPage.get_date_value().getText();
			 // System.out.println("Depature Date Verify:"+GetDate);
			  String[] depar1=GetDate.split(" ");
			  String Dep_date_Web=depar1[0];
			  System.out.println("Departure Date Web verify:"+Dep_date_Web);
			 // System.out.println("Api Date verify:"+pnrDetails.DepartureDate);
			  String[] depar=pnrDetails.DepartureDate.split("-");
			  String Dep_date_Api=depar[0];
			  System.out.println("Departure Date API:"+Dep_date_Api);
			  if(Dep_date_Web.equals(Dep_date_Api))
			  {
				  System.out.println("Oneway:Departure:Both Web And Api Dates Are Match");
			  }
			  else
			  {
				  System.out.println("Oneway:Departure:Dates Are Not Matching");
				  driver.quit();
				  
			  }
			    
			 
		
		}
		else if("RoundTrip".equals(pnrDetails.TripType))
		{
		
			PageUtils.isElementDisplayed(driver, flynasPage.btn_Modify());
			//PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL_ENGINE);
			 PageUtils.clickElement(driver, flynasPage.btn_Modify());
			 //PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.isElementDisplayed(driver, flynasPage.btn_depe());
			 PageUtils.clickElement(driver, flynasPage.btn_depe());
			// PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.isElementDisplayed(driver, flynasPage.border_MandY_D());
			 PageUtils.clickElement(driver, flynasPage.border_MandY_D());
			// PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.isElementDisplayed(driver, flynasPage.border_Year_D());
			 PageUtils.clickElement(driver, flynasPage.border_Year_D());
			 //PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.isElementDisplayed(driver, flynasPage.select_Year_D(y));
			 PageUtils.clickElement(driver, flynasPage.select_Year_D(y));
			// PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 flynasPage.select_Month_D(m);
			 //PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
			 flynasPage.SelectDate(d);
			// PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
			 String GetDate= flynasPage.get_date_value().getText();
			//System.out.println("Depature Date Verify:"+GetDate);
			  String[] depar1=GetDate.split(" ");
			  String Dep_date_Web=depar1[0];
			  System.out.println("RoundTrip:Departure Date Web verify:"+Dep_date_Web);
			 // System.out.println("Api Date verify:"+pnrDetails.DepartureDate);
			  String[] depar=pnrDetails.DepartureDate.split("-");
			  String Dep_date_Api=depar[0];
			  System.out.println("RoundTrip:Departure Date API:"+Dep_date_Api);
			  if(Dep_date_Web.equals(Dep_date_Api))
			  {
				  System.out.println("RoundTrip:Departure:Both Web And Api Dates Are Match");
			  }
			  else
			  {
				  System.out.println("RoundTrip:Departure:Dates Are Not Matching");
				  driver.quit();
				  
			  }

			if(GetDate.equals(Date))
			{
				System.out.println(GetDate+":equals:"+Date);
				flynasPage.btn_Return().click();
			}
			 PageUtils.isElementDisplayed(driver, flynasPage.border_MandY_R());
				PageUtils.clickElement(driver, flynasPage.border_MandY_R());
				 PageUtils.isElementDisplayed(driver, flynasPage.border_Year_R());
				PageUtils.clickElement(driver, flynasPage.border_Year_R());
				flynasPage.select_Year_R(r_y);
				//Thread.sleep(1000);
				flynasPage.select_Month_new_R(r_m);
				//Thread.sleep(1000);
				flynasPage.SelectDate(r_d);
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
			String GetReturnDate= flynasPage.getReturn_date_value().getText();
			 //System.out.println("Return Date Verify:"+GetReturnDate);
			  String[] depar_R=GetReturnDate.split(" ");
			  String Ren_date_Web=depar_R[0];
			  System.out.println("Return Date Web verify:"+Ren_date_Web);
			 // System.out.println("Api Date verify:"+pnrDetails.ReturnDate);
			  String[] Return=pnrDetails.ReturnDate.split("-");
			  String Return_date_Api=Return[0];
			  System.out.println("Return Date API:"+Return_date_Api);
			  if(Ren_date_Web.equals(Return_date_Api))
			  {
				  System.out.println("Round Trip:Return:Both Web And Api Dates Are Match");
			  }
			  else
			  {
				  System.out.println("Round Trip:Return:Dates Are Not Matching");
				  driver.quit();
				  
			  }
		
		
		
		
		}
		}
		catch(Exception e)
		{
			status="Modify date change errors";
			PageUtils.getScreenShot(pnrDetails.PnrId,driver);
			driver.quit();
		}
		PageUtils.getScreenShot(pnrDetails.PnrId,driver);
		 PageUtils.clickElement(driver, flynasPage.btn_ModifySearch());
		//flynasPage.btn_ModifySearch().click();
		//Thread.sleep(5000);
		
	}
	
	
	public static void selectFlightNumberAndCurrency(String baggage,double currency,Database pnrDetails,WebDriver driver) throws Exception
	{
		
		 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		flynasPage.flight_Numbers(pnrDetails.DepartureFlightNumber,pnrDetails);
		 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		System.out.println("flynasPage.flightNumber:" + flynasPage.flightNumber);

		if (flynasPage.flightNumber.equals(pnrDetails.DepartureFlightNumber)) {
			if (flynasPage.baggage20_kg().getText().equals(baggage)) {
				System.out.println("Plus" + flynasPage.baggage20_kg().getText());
				System.out.println("API Baggage:" + pnrDetails.Baggage);
				flynasPage.Plus_currency_value().click();
				Thread.sleep(5000);
				String total = flynasPage.rightside_Total_Value().getText();
				String sp[] = total.split(" ");
				// System.out.println(sp[0]);
				System.out.println(sp[1]);
				// String Plus_Value=flynasPage.Plus_currency_value().getText();
				String Plus_Value = sp[1];
				String plu = Plus_Value.replaceAll(",", "");
				float Plus = Float.parseFloat(plu);

				if (currency >= Plus) {
					
					// flynasPage.baggage20_kg().click();
					flynasPage.Plus_currency_value().click();
					System.out.println("API Amount:" + pnrDetails.Amount);
					System.out.println("WebSite Amount:" + Plus);
				} else {
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Plus);
					driver.quit();
					
					
				}

			} else if (flynasPage.baggage30_kg().getText().equals(baggage)) {
				System.out.println("Premium:" + flynasPage.baggage30_kg().getText());
				System.out.println("API Baggage:" + pnrDetails.Baggage);

				flynasPage.Premium_currency_value().click();
				Thread.sleep(5000);
				String total = flynasPage.rightside_Total_Value().getText();

				String sp[] = total.split(" ");
				// System.out.println(sp[0]);
				System.out.println(sp[1]);
				// String
				// Premium_Value=flynasPage.Premium_currency_value().getText();
				String Premium_Value = sp[1];
				String Premi = Premium_Value.replaceAll(",", "");
				float Premium = Float.parseFloat(Premi);

				if (currency >= Premium) {
					
					flynasPage.Premium_currency_value().click();
					System.out.println("API Amount:" + pnrDetails.Amount);
					System.out.println("WebSite Amount:" + Premium);
				} else {
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Premium);
					driver.quit();
					
					
				}
			}

			else if ("0".equals(baggage)) {

				System.out.println("API Baggage:" + pnrDetails.Baggage);
				String Light_Value = flynasPage.Light_currency_value().getText();
				flynasPage.Light_currency_value().click();
				String Lig = Light_Value.replaceAll(",", "");
				float Light = Float.parseFloat(Lig);

				if (currency >= Light) {
				
					flynasPage.Light_currency_value().click();
					System.out.println("API Amount:" + pnrDetails.Amount);
					System.out.println("WebSite Amount:" + Light);
				} else {
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Light);
					driver.quit();
					
					
				}

			}

		} else {
			
			System.out.println("FLight Number Does Not Match");
			driver.quit();
			
			
		}

		flynasPage.btn_Continue().click();
		Thread.sleep(5000);

		if (flynasPage.btn_PopUp().getText().equals("continue with the current choice")) {

			flynasPage.btn_PopUp().click();
			Thread.sleep(15000);

		}

		Thread.sleep(10000);
		
	}

	
	public static void enterDetails(Database pnrDetails,WebDriver driver) throws Exception
	{
		
		try{
		passengersDetails.paxAPI(pnrDetails);
		
		String numofAdults =pnrDetails.Adults; 
		String numofChilds = pnrDetails.Childs;
		String numofInfants = pnrDetails.Infants;
		
		if (numofAdults.equals("1")) {
			passengersDetails.adult1();
		
		} else if (numofAdults.equals("2")) {
			System.out.println("Adults 2-----------------");
			passengersDetails.adult1();
			passengersDetails.adult2();
		}
		else if (numofAdults.equals("3")) {
			passengersDetails.adult1();
			passengersDetails.adult2();
			passengersDetails.adult3();
		}
		else if (numofAdults.equals("4")) {
			passengersDetails.adult1();
			passengersDetails.adult2();
			passengersDetails.adult3();
			passengersDetails.adult4();
		}
		else if (numofAdults.equals("5")) {
			passengersDetails.adult1();
			passengersDetails.adult2();
			passengersDetails.adult3();
			passengersDetails.adult4();
			passengersDetails.adult5();
		
		}
		else if (numofAdults.equals("6")) {
			passengersDetails.adult1();
			passengersDetails.adult2();
			passengersDetails.adult3();
			passengersDetails.adult4();
			passengersDetails.adult5();
			passengersDetails.adult6();
		}
		else if (numofAdults.equals("7")) {
			passengersDetails.adult1();
			passengersDetails.adult2();
			passengersDetails.adult3();
			passengersDetails.adult4();
			passengersDetails.adult5();
			passengersDetails.adult6();
			passengersDetails.adult7();
		}
		else if (numofAdults.equals("8")) {
			passengersDetails.adult1();
			passengersDetails.adult2();
			passengersDetails.adult3();
			passengersDetails.adult4();
			passengersDetails.adult5();
			passengersDetails.adult6();
			passengersDetails.adult7();
			passengersDetails.adult8();
		}
		else if (numofAdults.equals("9")) {
			passengersDetails.adult1();
			passengersDetails.adult2();
			passengersDetails.adult3();
			passengersDetails.adult4();
			passengersDetails.adult5();
			passengersDetails.adult6();
			passengersDetails.adult7();
			passengersDetails.adult8();
			passengersDetails.adult9();
		}
	
		if(numofChilds.equals("1"))
		{
			if ("1".equals(numofAdults)) {
				passengersDetails.child1(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child2(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child3(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child4(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child5(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child6(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child7(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("8".equals(numofAdults)) {
				passengersDetails.child8(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			
		}
		else if(numofChilds.equals("2"))
		{
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child1(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child2(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child3(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child4(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child5(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child6(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child7(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("8".equals(numofAdults)) {
				passengersDetails.child8(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child2(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child3(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child4(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child5(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child6(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child7(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child8(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			
		}
		else if(numofChilds.equals("3"))
		{
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child1(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child2(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child3(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child4(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child5(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child6(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child7(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("8".equals(numofAdults)) {
				passengersDetails.child8(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child2(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child3(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child4(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child5(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child6(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child7(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child8(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
             System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child3(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child4(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child5(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child6(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child7(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child8(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			
		
			
		}
		else if(numofChilds.equals("4"))
		{
			

			if ("1".equals(numofAdults)) {
				passengersDetails.child1(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child2(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child3(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child4(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child5(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child6(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child7(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("8".equals(numofAdults)) {
				passengersDetails.child8(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child2(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child3(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child4(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child5(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child6(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child7(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child8(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
             System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child3(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child4(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child5(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child6(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child7(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child8(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child4(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child5(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child6(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child7(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("5".equals(numofAdults)) {
				passengersDetails.child8(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			}
		
		}
		else if(numofChilds.equals("5"))
		{
			if ("1".equals(numofAdults)) {
				passengersDetails.child1(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child2(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child3(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child4(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child5(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child6(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child7(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("8".equals(numofAdults)) {
				passengersDetails.child8(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child2(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child3(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child4(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child5(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child6(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child7(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child8(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
             System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child3(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child4(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child5(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child6(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child7(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child8(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child4(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child5(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child6(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child7(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("5".equals(numofAdults)) {
				passengersDetails.child8(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			}
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child5(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child6(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child7(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child8(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			}
			
		}
		else if(numofChilds.equals("6"))
		{
			if ("1".equals(numofAdults)) {
				passengersDetails.child1(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child2(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child3(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child4(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child5(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child6(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child7(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("8".equals(numofAdults)) {
				passengersDetails.child8(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child2(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child3(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child4(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child5(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child6(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child7(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child8(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
             System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child3(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child4(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child5(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child6(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child7(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child8(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child4(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child5(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child6(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child7(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("5".equals(numofAdults)) {
				passengersDetails.child8(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			}
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child5(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child6(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child7(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child8(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child6(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child7(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child8(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);

			}
				
		}
		else if(numofChilds.equals("7"))
		{
			if ("1".equals(numofAdults)) {
				passengersDetails.child1(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child2(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child3(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child4(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child5(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child6(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child7(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("8".equals(numofAdults)) {
				passengersDetails.child8(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child2(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child3(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child4(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child5(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child6(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child7(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child8(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
             System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child3(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child4(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child5(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child6(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child7(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child8(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child4(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child5(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child6(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child7(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("5".equals(numofAdults)) {
				passengersDetails.child8(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			}
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child5(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child6(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child7(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child8(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child6(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child7(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child8(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child7(child_7_Title,child_7_firstname,child_7_lastname,child7_dof_d,child7_dof_m,child7_dof_y,child7_doc_Type,child_7_IC,child7_doc_Number,child7_pass_d,child7_pass_m,child7_pass_y,child_7_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child8(child_7_Title,child_7_firstname,child_7_lastname,child7_dof_d,child7_dof_m,child7_dof_y,child7_doc_Type,child_7_IC,child7_doc_Number,child7_pass_d,child7_pass_m,child7_pass_y,child_7_nation);

			}
		}
		
		
		else if(numofChilds.equals("8"))
		{
			if ("1".equals(numofAdults)) {
				passengersDetails.child1(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child2(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child3(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child4(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child5(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child6(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child7(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			else if ("8".equals(numofAdults)) {
				passengersDetails.child8(child_1_Title,child_1_firstname,child_1_lastname,child1_dof_d,child1_dof_m,child1_dof_y,child1_doc_Type,child_1_IC,child1_doc_Number,child1_pass_d,child1_pass_m,child1_pass_y,child_1_nation);

			}
			System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child2(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child3(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child4(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child5(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child6(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child7(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
			else if ("7".equals(numofAdults)) {
				passengersDetails.child8(child_2_Title,child_2_firstname,child_2_lastname,child2_dof_d,child2_dof_m,child2_dof_y,child2_doc_Type,child_2_IC,child2_doc_Number,child2_pass_d,child2_pass_m,child2_pass_y,child_2_nation);

			}
             System.out.println("----");
			
			if ("1".equals(numofAdults)) {
				passengersDetails.child3(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child4(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("3".equals(numofAdults)) {
				passengersDetails.child5(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("4".equals(numofAdults)) {
				passengersDetails.child6(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("5".equals(numofAdults)) {
				passengersDetails.child7(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			else if ("6".equals(numofAdults)) {
				passengersDetails.child8(child_3_Title,child_3_firstname,child_3_lastname,child3_dof_d,child3_dof_m,child3_dof_y,child3_doc_Type,child_3_IC,child3_doc_Number,child3_pass_d,child3_pass_m,child3_pass_y,child_3_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child4(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child5(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child6(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child7(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			} else if ("5".equals(numofAdults)) {
				passengersDetails.child8(child_4_Title,child_4_firstname,child_4_lastname,child4_dof_d,child4_dof_m,child4_dof_y,child4_doc_Type,child_4_IC,child4_doc_Number,child4_pass_d,child4_pass_m,child4_pass_y,child_4_nation);

			}
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child5(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child6(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child7(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			} else if ("4".equals(numofAdults)) {
				passengersDetails.child8(child_5_Title,child_5_firstname,child_5_lastname,child5_dof_d,child5_dof_m,child5_dof_y,child5_doc_Type,child_5_IC,child5_doc_Number,child5_pass_d,child5_pass_m,child5_pass_y,child_5_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child6(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child7(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);

			} else if ("3".equals(numofAdults)) {
				passengersDetails.child8(child_6_Title,child_6_firstname,child_6_lastname,child6_dof_d,child6_dof_m,child6_dof_y,child6_doc_Type,child_6_IC,child6_doc_Number,child6_pass_d,child6_pass_m,child6_pass_y,child_6_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child7(child_7_Title,child_7_firstname,child_7_lastname,child7_dof_d,child7_dof_m,child7_dof_y,child7_doc_Type,child_7_IC,child7_doc_Number,child7_pass_d,child7_pass_m,child7_pass_y,child_7_nation);
			} else if ("2".equals(numofAdults)) {
				passengersDetails.child8(child_7_Title,child_7_firstname,child_7_lastname,child7_dof_d,child7_dof_m,child7_dof_y,child7_doc_Type,child_7_IC,child7_doc_Number,child7_pass_d,child7_pass_m,child7_pass_y,child_7_nation);

			}
			
			System.out.println("----");

			if ("1".equals(numofAdults)) {
				passengersDetails.child8(child_8_Title,child_8_firstname,child_8_lastname,child8_dof_d,child8_dof_m,child8_dof_y,child8_doc_Type,child_8_IC,child8_doc_Number,child8_pass_d,child8_pass_m,child8_pass_y,child_8_nation);
			} 
		}
		
		
		Integer totalValue = Integer.parseInt(numofChilds) + Integer.parseInt(numofAdults);
		System.out.println("totalValue:" + totalValue);
		String numberAsString = Integer.toString(totalValue);
		System.out.println(numberAsString);
		
		if ("1".equals(numofInfants)) {
			if ("1".equals(numberAsString)) {
			   passengersDetails.Infant1(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
			} else if ("2".equals(numberAsString)) {
				 passengersDetails.Infant2(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
				
			} else if ("3".equals(numberAsString)) {
				 passengersDetails.Infant3(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
			} else if ("4".equals(numberAsString)) {
				 passengersDetails.Infant4(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
			
			} else if ("5".equals(numberAsString)) {
				 passengersDetails.Infant5(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
				
			} else if ("6".equals(numberAsString)) {
				 passengersDetails.Infant6(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
				
			} else if ("7".equals(numberAsString)) {
				 passengersDetails.Infant7(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
				
			} else if ("8".equals(numberAsString)) {
				 passengersDetails.Infant8(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
				
			}
			
		}
		
		if ("2".equals(numofInfants)) {
			
			if ("1".equals(numberAsString)) {
				   passengersDetails.Infant1(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
				} else if ("2".equals(numberAsString)) {
					 passengersDetails.Infant2(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					
				} else if ("3".equals(numberAsString)) {
					 passengersDetails.Infant3(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
				} else if ("4".equals(numberAsString)) {
					 passengersDetails.Infant4(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
				
				} else if ("5".equals(numberAsString)) {
					 passengersDetails.Infant5(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					
				} else if ("6".equals(numberAsString)) {
					 passengersDetails.Infant6(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					
				} else if ("7".equals(numberAsString)) {
					 passengersDetails.Infant7(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					
				} else if ("8".equals(numberAsString)) {
					 passengersDetails.Infant8(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					
				}
			      System.out.println("----");
			     if ("1".equals(numberAsString)) {
				   passengersDetails.Infant2(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
				} else if ("2".equals(numberAsString)) {
					 passengersDetails.Infant3(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					
				} else if ("3".equals(numberAsString)) {
					 passengersDetails.Infant4(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
				} else if ("4".equals(numberAsString)) {
					 passengersDetails.Infant5(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
				
				} else if ("5".equals(numberAsString)) {
					 passengersDetails.Infant6(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					
				} else if ("6".equals(numberAsString)) {
					 passengersDetails.Infant7(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					
				} else if ("7".equals(numberAsString)) {
					 passengersDetails.Infant8(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					
				} 
		}
			
			if ("3".equals(numofInfants)) {
				
				if ("1".equals(numberAsString)) {
					   passengersDetails.Infant1(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					} else if ("2".equals(numberAsString)) {
						 passengersDetails.Infant2(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					} else if ("3".equals(numberAsString)) {
						 passengersDetails.Infant3(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					} else if ("4".equals(numberAsString)) {
						 passengersDetails.Infant4(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					
					} else if ("5".equals(numberAsString)) {
						 passengersDetails.Infant5(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					} else if ("6".equals(numberAsString)) {
						 passengersDetails.Infant6(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					} else if ("7".equals(numberAsString)) {
						 passengersDetails.Infant7(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					} else if ("8".equals(numberAsString)) {
						 passengersDetails.Infant8(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					}
				      System.out.println("----");
				     if ("1".equals(numberAsString)) {
					   passengersDetails.Infant2(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					} else if ("2".equals(numberAsString)) {
						 passengersDetails.Infant3(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
						
					} else if ("3".equals(numberAsString)) {
						 passengersDetails.Infant4(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					} else if ("4".equals(numberAsString)) {
						 passengersDetails.Infant5(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					
					} else if ("5".equals(numberAsString)) {
						 passengersDetails.Infant6(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
						
					} else if ("6".equals(numberAsString)) {
						 passengersDetails.Infant7(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
						
					} else if ("7".equals(numberAsString)) {
						 passengersDetails.Infant8(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
						
					} 
				     System.out.println("----");
				     if ("1".equals(numberAsString)) {
					   passengersDetails.Infant3(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
					} else if ("2".equals(numberAsString)) {
						 passengersDetails.Infant4(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
						
					} else if ("3".equals(numberAsString)) {
						 passengersDetails.Infant5(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
					} else if ("4".equals(numberAsString)) {
						 passengersDetails.Infant6(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
					
					} else if ("5".equals(numberAsString)) {
						 passengersDetails.Infant7(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
						
					} else if ("6".equals(numberAsString)) {
						 passengersDetails.Infant8(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
						
					} 
				     
				     
			}
			
			if ("4".equals(numofInfants)) {
				
				if ("1".equals(numberAsString)) {
					   passengersDetails.Infant1(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					} else if ("2".equals(numberAsString)) {
						 passengersDetails.Infant2(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					} else if ("3".equals(numberAsString)) {
						 passengersDetails.Infant3(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					} else if ("4".equals(numberAsString)) {
						 passengersDetails.Infant4(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
					
					} else if ("5".equals(numberAsString)) {
						 passengersDetails.Infant5(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					} else if ("6".equals(numberAsString)) {
						 passengersDetails.Infant6(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					} else if ("7".equals(numberAsString)) {
						 passengersDetails.Infant7(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					} else if ("8".equals(numberAsString)) {
						 passengersDetails.Infant8(infant_1_Title,infant_1_firstname,infant_1_lastname,infant1_dof_d,infant1_dof_m,infant1_dof_y,infant1_doc_Type,infant_1_IC,infant1_doc_Number,infant1_pass_d,infant1_pass_m,infant1_pass_y,infant_1_nation);
						
					}
				      System.out.println("----");
				     if ("1".equals(numberAsString)) {
					   passengersDetails.Infant2(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					} else if ("2".equals(numberAsString)) {
						 passengersDetails.Infant3(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
						
					} else if ("3".equals(numberAsString)) {
						 passengersDetails.Infant4(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					} else if ("4".equals(numberAsString)) {
						 passengersDetails.Infant5(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
					
					} else if ("5".equals(numberAsString)) {
						 passengersDetails.Infant6(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
						
					} else if ("6".equals(numberAsString)) {
						 passengersDetails.Infant7(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
						
					} else if ("7".equals(numberAsString)) {
						 passengersDetails.Infant8(infant_2_Title,infant_2_firstname,infant_2_lastname,infant2_dof_d,infant2_dof_m,infant2_dof_y,infant2_doc_Type,infant_2_IC,infant2_doc_Number,infant2_pass_d,infant2_pass_m,infant2_pass_y,infant_2_nation);
						
					} 
				     System.out.println("----");
				     if ("1".equals(numberAsString)) {
					   passengersDetails.Infant3(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
					} else if ("2".equals(numberAsString)) {
						 passengersDetails.Infant4(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
						
					} else if ("3".equals(numberAsString)) {
						 passengersDetails.Infant5(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
					} else if ("4".equals(numberAsString)) {
						 passengersDetails.Infant6(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
					
					} else if ("5".equals(numberAsString)) {
						 passengersDetails.Infant7(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
						
					} else if ("6".equals(numberAsString)) {
						 passengersDetails.Infant8(infant_3_Title,infant_3_firstname,infant_3_lastname,infant3_dof_d,infant3_dof_m,infant3_dof_y,infant3_doc_Type,infant_3_IC,infant3_doc_Number,infant3_pass_d,infant3_pass_m,infant3_pass_y,infant_3_nation);
						
					} 
				     
				     System.out.println("----");
				     if ("1".equals(numberAsString)) {
					   passengersDetails.Infant4(infant_4_Title,infant_4_firstname,infant_4_lastname,infant4_dof_d,infant4_dof_m,infant4_dof_y,infant4_doc_Type,infant_4_IC,infant4_doc_Number,infant4_pass_d,infant4_pass_m,infant4_pass_y,infant_4_nation);
					} else if ("2".equals(numberAsString)) {
						 passengersDetails.Infant5(infant_4_Title,infant_4_firstname,infant_4_lastname,infant4_dof_d,infant4_dof_m,infant4_dof_y,infant4_doc_Type,infant_4_IC,infant4_doc_Number,infant4_pass_d,infant4_pass_m,infant4_pass_y,infant_4_nation);
						
					} else if ("3".equals(numberAsString)) {
						 passengersDetails.Infant6(infant_4_Title,infant_4_firstname,infant_4_lastname,infant4_dof_d,infant4_dof_m,infant4_dof_y,infant4_doc_Type,infant_4_IC,infant4_doc_Number,infant4_pass_d,infant4_pass_m,infant4_pass_y,infant_4_nation);
					} else if ("4".equals(numberAsString)) {
						 passengersDetails.Infant7(infant_4_Title,infant_4_firstname,infant_4_lastname,infant4_dof_d,infant4_dof_m,infant4_dof_y,infant4_doc_Type,infant_4_IC,infant4_doc_Number,infant4_pass_d,infant4_pass_m,infant4_pass_y,infant_4_nation);
					
					} else if ("5".equals(numberAsString)) {
						 passengersDetails.Infant8(infant_4_Title,infant_4_firstname,infant_4_lastname,infant4_dof_d,infant4_dof_m,infant4_dof_y,infant4_doc_Type,infant_4_IC,infant4_doc_Number,infant4_pass_d,infant4_pass_m,infant4_pass_y,infant_4_nation);
						
					}
				     
			}
		
		}
		catch(Exception e)
		{
			PageUtils.getScreenShot(pnrDetails.PnrId,driver);
			passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Document Details Element Not Found");
			driver.quit();
		}
		
		
		
		Thread.sleep(2000);
	  
		System.out.println("Enter All Passenger Details Successfully");
		PageUtils.getScreenShot(pnrDetails.PnrId,driver);
		/*flynasPage.txt_Conf_Pwd().sendKeys("test");
		flynasPage.txt_Conf_Pwd().clear();*/
		
		PageUtils.isElementVisibil(driver, flynasPage.txt_mobilenumber());
		flynasPage.txt_mobilenumber().sendKeys(passengersDetails.phoneNumber);
		System.out.println("Enter Phone Number");
		Thread.sleep(2000);
		try {
			
			System.out.println("DOMAIN NAME:"+pnrDetails.Domain);
			Thread.sleep(2000);
			if(pnrDetails.Domain.equals("SA"))
			{
			    if (flynasPage.get_Country_Code_Text().getText().equals(CountryCode)) {
				System.out.println(flynasPage.get_Country_Code_Text().getText() + ":Both Are Matching:" + CountryCode);
			    } 
			    else {
				
				flynasPage.drp_county_code().click();
				Thread.sleep(2000);
				int i;
				String searchTerm = mobileCode;
				for(i = 0; i < searchTerm.length(); i++){
					System.out.println(searchTerm.charAt(i));
					char c = searchTerm.charAt(i);
			        String MobileCodeNumber = new StringBuilder().append(c).toString();
			        Thread.sleep(2000);
							
			        flynasPage.type_county_code().sendKeys(MobileCodeNumber);
				}
				Thread.sleep(2000);
				flynasPage.select_county_code(mobileCode).click();
				Thread.sleep(1000);
				System.out.println("SA:Select Country Code");
			}
			}
			else if(pnrDetails.Domain.equals("COM"))
			{
				PageUtils.isElementVisibil(driver, flynasPage.get_Country_Code_Text());
				System.out.println(flynasPage.get_Country_Code_Text().getText());
				if (flynasPage.get_Country_Code_Text().getText().equals(CountryCode)) {
					System.out.println(flynasPage.get_Country_Code_Text().getText() + ":Both Are Matching:" + CountryCode);
				    } 
				    else {
					
					flynasPage.drp_county_code().click();
					Thread.sleep(2000);
					int i;
					String searchTerm = mobileCode;
					for(i = 0; i < searchTerm.length(); i++){
						System.out.println(searchTerm.charAt(i));
						char c = searchTerm.charAt(i);
				        String MobileCodeNumber = new StringBuilder().append(c).toString();
				        Thread.sleep(1000);
								
				        flynasPage.type_county_code().sendKeys(MobileCodeNumber);
					}
					Thread.sleep(2000);
					flynasPage.select_county_code(mobileCode).click();
					Thread.sleep(1000);
					System.out.println("COM:Select Country Code");
				}
			}
			else if(pnrDetails.Domain.equals("EG"))
			{
				if (flynasPage.get_Country_Code_Text().getText().equals(CountryCode)) {
					System.out.println(flynasPage.get_Country_Code_Text().getText() + ":Both Are Matching:" + CountryCode);
				    } 
				    else {
					
					flynasPage.drp_county_code().click();
					Thread.sleep(2000);
					int i;
					String searchTerm = mobileCode;
					for(i = 0; i < searchTerm.length(); i++){
						System.out.println(searchTerm.charAt(i));
						char c = searchTerm.charAt(i);
				        String MobileCodeNumber = new StringBuilder().append(c).toString();
				        Thread.sleep(1000);
								
				        flynasPage.type_county_code().sendKeys(MobileCodeNumber);
					}
					Thread.sleep(2000);
					flynasPage.select_county_code(mobileCode).click();
					Thread.sleep(1000);
					System.out.println("EG:Select Country Code");
				}
			}
			else if(pnrDetails.Domain.equals("AE"))
			{
				if (flynasPage.get_Country_Code_Text().getText().equals(CountryCode)) {
					System.out.println(flynasPage.get_Country_Code_Text().getText() + ":Both Are Matching:" + CountryCode);
				    } 
				    else {
					
					flynasPage.drp_county_code().click();
					Thread.sleep(2000);
					int i;
					String searchTerm = mobileCode;
					for(i = 0; i < searchTerm.length(); i++){
						System.out.println(searchTerm.charAt(i));
						char c = searchTerm.charAt(i);
				        String MobileCodeNumber = new StringBuilder().append(c).toString();
				        Thread.sleep(1000);
								
				        flynasPage.type_county_code().sendKeys(MobileCodeNumber);
					}
					Thread.sleep(2000);
					flynasPage.select_county_code(mobileCode).click();
					Thread.sleep(1000);
					System.out.println("AE:Select Country Code");
				}
			}
			}
		catch (Exception ec) {
			PageUtils.getScreenShot(pnrDetails.PnrId, driver);
			passengersDetails.returnStatus_fail(pnrDetails.Domain, pnrDetails.PnrId, "CountryCode Loading Issue");
			driver.quit();
		}
		
		PageUtils.isElementVisibil(driver, flynasPage.txt_email());
		flynasPage.txt_email().sendKeys(passengersDetails.emailId);
		//Thread.sleep(1000);
		System.out.println("Enter Email Id");
		PageUtils.getScreenShot(pnrDetails.PnrId,driver);
		
		
		PageUtils.scrollDownExact(driver, flynasPage.btn_submitl());
		PageUtils.isElementVisibil(driver, flynasPage.btn_submitl());
		flynasPage.btn_submitl().click();
		PageUtils.getScreenShot(pnrDetails.PnrId,driver);
		System.out.println("PASSENGER DETAILS:Click On Continue Button");
		PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		
		
		try{
			String text=flynasPage.invalid_passport().getText();
			System.out.println(text);
			PageUtils.getScreenShot(pnrDetails.PnrId,driver);
			passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Travel document information is invalid(passport/Dob");
			driver.quit();
		}catch(Exception e)
		{
			System.out.println("Pass Port Alret Not Found");
			PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
			
		}
		
		//Thread.sleep(2000);
		PageUtils.isElementLocated(driver, By.name("extrasForm"));
		PageUtils.isElementLocated(driver, By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View in Cash'])[1]/following::button[1]"));
		PageUtils.waitForFixedTime(BrowserContants.WAIT_MEDIUM);
		PageUtils.isElementVisibil(driver, flynasPage.btn_submitl());
		flynasPage.btn_submitl().click();
		System.out.println("EXTRAS:Click On Continue Button");
		
		PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		
		
		//alert
		insurance_Alert();
		
		
		//Thread.sleep(5000);
		PageUtils.isElementLocated(driver, By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Back'])[1]/following::button[1]"));
		PageUtils.waitForFixedTime(BrowserContants.WAIT_MEDIUM);
		PageUtils.isElementVisibil(driver, flynasPage.btn_submitl());
		flynasPage.btn_submitl().click();
		System.out.println("SEAT(s) SELECTION:Click On Continue Button");
		PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		
		PageUtils.isElementVisibil(driver, flynasPage.btn_Ok());
		flynasPage.btn_Ok().click();
		System.out.println("SEAT(s) SELECTION:Click On Ok Button");
		Thread.sleep(3000);
		
		
	}


	
	
	/*public static void enterCardDetails(Database pnrDetails) throws Exception
	{
		flynasPage.select_Card_Type("");
		Thread.sleep(2000);
		flynasPage.txt_Card_Number().sendKeys("");
		Thread.sleep(1000);
		flynasPage.txt_Holder_Name().sendKeys("");
		Thread.sleep(1000);
		flynasPage.btn_card_month().click();
		Thread.sleep(1000);
		flynasPage.select_card_Month("").click();
		Thread.sleep(1000);
		flynasPage.btn_card_year().click();
		Thread.sleep(1000);
		flynasPage.select_card_year("").click();
		Thread.sleep(1000);
		flynasPage.txt_CVV_Number().sendKeys("");
		Thread.sleep(1000);
		flynasPage.btn_Payment_Continue().click();
		Thread.sleep(10000);
		
	}
	*/
	
	
	public static void alertBox(WebDriver driver) throws Exception
	{
		
		
		
		 Boolean iselementpresent = driver.findElements(By.id("confirmTrue")).size()!= 0;
		   if (iselementpresent == true)
		   {
		    System.out.println("ALERT");
		    PageUtils.clickElement(driver,  flynasPage.homePage_Agree());
		    System.out.println("Click On Agree Alert");
		    Thread.sleep(10000);
		    //flynasPage.homePage_Agree().click();
		   }
		   else
		   {
			   System.out.println("NO AGREE ALERT");
		   }
		
	
		
	}
	
	public static void insurance_Alert() throws Exception
	{
		
		
		
		try{
			PageUtils.isElementVisibil(driver, flynasPage.travel_insurance_Alert());
			flynasPage.travel_insurance_Alert().click();
			PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
			System.out.println("Click On Insurance Alert");
		}
		catch(Exception e)
		{
			System.out.println("Insurance Alert Not found");
		}
		
	}
	
	
	public static void selectFlightNumberReturn(String baggage,double currency,Database pnrDetails,WebDriver driver) throws Exception
	{
		
		 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		flynasPage.flight_Numbers(pnrDetails.DepartureFlightNumber,pnrDetails);
		 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		System.out.println("DepartureFlightNumber:" + flynasPage.flightNumber);
		if("OneWay".equals(pnrDetails.TripType)){

		if (flynasPage.flightNumber.equals(pnrDetails.DepartureFlightNumber)) {
			
			 if (flynasPage.baggage20_kg().getText().equals(baggage)) {
				System.out.println("Plus" + flynasPage.baggage20_kg().getText());
				System.out.println("API Baggage:" + pnrDetails.Baggage);
				flynasPage.Plus_currency_value().click();
				Thread.sleep(5000);
				String total = flynasPage.rightside_Total_Value().getText();
				String sp[] = total.split(" ");
				// System.out.println(sp[0]);
				System.out.println(sp[1]);
				// String Plus_Value=flynasPage.Plus_currency_value().getText();
				String Plus_Value = sp[1];
				String plu = Plus_Value.replaceAll(",", "");
				float Plus = Float.parseFloat(plu);

				if (currency >= Plus) {
					
					// flynasPage.baggage20_kg().click();
					flynasPage.Plus_currency_value().click();
					System.out.println("API Amount:" + pnrDetails.Amount);
					System.out.println("WebSite Amount:" + Plus);
				} else {
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Plus);
					driver.quit();
					
					
				}

			} else if (flynasPage.baggage30_kg().getText().equals(baggage)) {
				System.out.println("Premium:" + flynasPage.baggage30_kg().getText());
				System.out.println("API Baggage:" + pnrDetails.Baggage);

				flynasPage.Premium_currency_value().click();
				Thread.sleep(5000);
				String total = flynasPage.rightside_Total_Value().getText();

				String sp[] = total.split(" ");
				// System.out.println(sp[0]);
				System.out.println(sp[1]);
				// String
				// Premium_Value=flynasPage.Premium_currency_value().getText();
				String Premium_Value = sp[1];
				String Premi = Premium_Value.replaceAll(",", "");
				float Premium = Float.parseFloat(Premi);

				if (currency >= Premium) {
					
					flynasPage.Premium_currency_value().click();
					System.out.println("API Amount:" + pnrDetails.Amount);
					System.out.println("WebSite Amount:" + Premium);
				} else {
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Premium);
					driver.quit();
					
					
				}
			}

			else if ("0".equals(baggage)) {

				System.out.println("API Baggage:" + pnrDetails.Baggage);
				flynasPage.Light_currency_value().click();
				PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
				String Light_Value = flynasPage.rightside_Total_Value().getText();
				
				String sp[] = Light_Value.split(" ");
				// System.out.println(sp[0]);
				System.out.println(sp[1]);
				// String
				// Premium_Value=flynasPage.Premium_currency_value().getText();
				String light = sp[1];
				String Light_Amount = light.replaceAll(",", "");
				float Light = Float.parseFloat(Light_Amount);
				
				//String Lig = Light_Value.replaceAll(",", "");
				//float Light = Float.parseFloat(Lig);

				if (currency >= Light) {
				
					flynasPage.Light_currency_value().click();
					System.out.println("API Amount:" + pnrDetails.Amount);
					System.out.println("WebSite Amount:" + Light);
				} else {
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Light);
					driver.quit();
					
					
				}

			}
			

		
		
		
	
		}
        else {
			
			System.out.println("FLight Number Does Not Match");
			 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"FLight Number Does Not Match");
			driver.quit();
			
			
		}
		}
		
		else if("RoundTrip".equals(pnrDetails.TripType))
		{
			//System.out.println("R1_F");
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
				flynasPage.flight_Numbers(pnrDetails.DepartureFlightNumber,pnrDetails);
				 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
				System.out.println("DepartureFlightNumber:" + flynasPage.flightNumber);
				System.out.println("APIFlightNumber:" + pnrDetails.DepartureFlightNumber);
				
			if (flynasPage.flightNumber.equals(pnrDetails.DepartureFlightNumber)) {
			
				
				if (flynasPage.baggage20_kg().getText().equals(baggage)) {
					System.out.println("Plus" + flynasPage.baggage20_kg().getText());
					System.out.println("API Baggage:" + pnrDetails.Baggage);
					flynasPage.Plus_currency_value().click();
					Thread.sleep(5000);
					String total = flynasPage.rightside_Total_Value().getText();
					String sp[] = total.split(" ");
					// System.out.println(sp[0]);
					System.out.println(sp[1]);
					// String Plus_Value=flynasPage.Plus_currency_value().getText();
					String Plus_Value = sp[1];
					String plu = Plus_Value.replaceAll(",", "");
					float Plus = Float.parseFloat(plu);

					/*if (currency >= Plus) {
						
						// flynasPage.baggage20_kg().click();
						flynasPage.Plus_currency_value().click();
						System.out.println("API Amount:" + pnrDetails.Amount);
						System.out.println("WebSite Amount:" + Plus);
					} else {
						
						System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Plus);
						driver.quit();
						
						
					}*/

				} else if (flynasPage.baggage30_kg().getText().equals(baggage)) {
					System.out.println("Premium:" + flynasPage.baggage30_kg().getText());
					System.out.println("API Baggage:" + pnrDetails.Baggage);

					flynasPage.Premium_currency_value().click();
					Thread.sleep(5000);
					String total = flynasPage.rightside_Total_Value().getText();

					String sp[] = total.split(" ");
					// System.out.println(sp[0]);
					System.out.println(sp[1]);
					// String
					// Premium_Value=flynasPage.Premium_currency_value().getText();
					String Premium_Value = sp[1];
					String Premi = Premium_Value.replaceAll(",", "");
					float Premium = Float.parseFloat(Premi);

					/*if (currency >= Premium) {
						
						flynasPage.Premium_currency_value().click();
						System.out.println("API Amount:" + pnrDetails.Amount);
						System.out.println("WebSite Amount:" + Premium);
					} else {
						
						System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Premium);
						driver.quit();
						
						
					}*/
				}

				else if ("0".equals(baggage)) {

					System.out.println("API Baggage:" + pnrDetails.Baggage);
					String Light_Value = flynasPage.Light_currency_value().getText();
					flynasPage.Light_currency_value().click();
					String Lig = Light_Value.replaceAll(",", "");
					float Light = Float.parseFloat(Lig);

					/*if (currency >= Light) {
					
						flynasPage.Light_currency_value().click();
						System.out.println("API Amount:" + pnrDetails.Amount);
						System.out.println("WebSite Amount:" + Light);
					} else {
						
						System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Light);
						driver.quit();
						
						
					}*/

				}
				
				
				
				}	

			
					
			/*else {
				
				System.out.println("FLight Number Does Not Match");
				driver.quit();
				
				
			}*/
			
			//Round Trip
			PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
			flynasPage.return_flight_Numbers(pnrDetails.ReturnFlightNumber,pnrDetails);
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		    System.out.println("ReturnFlightNumber:" + flynasPage.return_flight_Numbers );
			
			if (flynasPage.return_flight_Numbers.equals(pnrDetails.ReturnFlightNumber)) {
				//System.out.println("R1_F2");
				if (flynasPage.Return_baggage20_kg().getText().equals(baggage)) {
					System.out.println("Plus" + flynasPage.Return_baggage20_kg().getText());
					System.out.println("API Baggage:" + pnrDetails.Baggage);
					flynasPage.Return_Plus_currency_value().click();
					PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
					String total = flynasPage.rightside_Total_Value().getText();
					String sp[] = total.split(" ");
					// System.out.println(sp[0]);
					System.out.println(sp[1]);
					// String Plus_Value=flynasPage.Plus_currency_value().getText();
					String Plus_Value = sp[1];
					String plu = Plus_Value.replaceAll(",", "");
					float Plus = Float.parseFloat(plu);

					if (currency >= Plus) {
						
						// flynasPage.baggage20_kg().click();
						flynasPage.Return_Plus_currency_value().click();
						System.out.println("API Amount:" + pnrDetails.Amount);
						System.out.println("WebSite Amount:" + Plus);
					} else {
						 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
						System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Plus);
						driver.quit();
						
						
					}

				} else if (flynasPage.Return_baggage30_kg().getText().equals(baggage)) {
					System.out.println("Premium:" + flynasPage.Return_baggage30_kg().getText());
					System.out.println("API Baggage:" + pnrDetails.Baggage);

					flynasPage.Return_Premium_currency_value().click();
					PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
					String total = flynasPage.rightside_Total_Value().getText();

					String sp[] = total.split(" ");
					// System.out.println(sp[0]);
					System.out.println(sp[1]);
					// String
					// Premium_Value=flynasPage.Premium_currency_value().getText();
					String Premium_Value = sp[1];
					String Premi = Premium_Value.replaceAll(",", "");
					float Premium = Float.parseFloat(Premi);

					if (currency >= Premium) {
						
						flynasPage.Return_Premium_currency_value().click();
						PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
						System.out.println("API Amount:" + pnrDetails.Amount);
						System.out.println("WebSite Amount:" + Premium);
					} else {
						passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
						System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Premium);
						driver.quit();
						
						
					}
				}

				else if ("0".equals(baggage)) {

					System.out.println("API Baggage:" + pnrDetails.Baggage);
					//String Light_Value = flynasPage.Return_Light_currency_value().getText();
					flynasPage.Return_Light_currency_value().click();
					PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
					String total = flynasPage.rightside_Total_Value().getText();

					String sp[] = total.split(" ");
					// System.out.println(sp[0]);
					System.out.println(sp[1]);
					// String
					// Premium_Value=flynasPage.Premium_currency_value().getText();
					String Light_Value = sp[1];
					String Lig = Light_Value.replaceAll(",", "");
					float Light = Float.parseFloat(Lig);

					if (currency >= Light) {
					
						flynasPage.Return_Light_currency_value().click();
						System.out.println("API Amount:" + pnrDetails.Amount);
						System.out.println("WebSite Amount:" + Light);
					} else {
						passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Api amount is greater than website amount");
						System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Light);
						driver.quit();
						
						
					}

				}
				
				

			}
					
			else {
				
				System.out.println("Return FLight Number Does Not Match");
				passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Return FLight Number Does Not Match");
				driver.quit();
				
				
			}
		}
	
		flynasPage.btn_Continue().click();
		Thread.sleep(5000);

		
		
		if (flynasPage.btn_PopUp().getText().equals("continue with the current choice")) {

			flynasPage.btn_PopUp().click();
			Thread.sleep(15000);

		}

		Thread.sleep(1000);
		
}


}
