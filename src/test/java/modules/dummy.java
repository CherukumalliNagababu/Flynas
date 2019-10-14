package modules;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.Database;
import pageobjects.PageUtils;
import pageobjects.flynasPage;




public class dummy extends passengersDetails {
	  private static WebDriver driver;
	
	
	
	
	public static void tripType(String tripType,WebDriver driver) throws Exception {
		Thread.sleep(5000);

		if ("OneWay".equals(tripType)) {
			
			PageUtils.clickElement(driver,flynasPage.oneyWay_f());
			//flynasPage.oneyWay_f().click();
			//Thread.sleep(2000);
		} else if ("RoundTrip".equals(tripType))
			//flynasPage.roundTrip_f().click();
		    Thread.sleep(2000);

	}
	
	public static void enterFromTocitys(Database pnrDetails,WebDriver driver ) throws Exception
	{
		PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
		PageUtils.clickElement(driver,flynasPage.clk_From());
		PageUtils.sendKeysAfterClearingElement(driver, flynasPage.txt_From(), pnrDetails.From);
		flynasPage.txt_From().sendKeys(Keys.ENTER);
		PageUtils.sendKeysAfterClearingElement(driver, flynasPage.txt_To(), pnrDetails.To);
		flynasPage.txt_To().sendKeys(Keys.ENTER);
		
		//flynasPage.clk_From().click();
		//flynasPage.txt_From().sendKeys(pnrDetails.From);
		//Thread.sleep(2000);
		//flynasPage.txt_From().sendKeys(Keys.ENTER);

		//no flynasPage.txt_To().click();
		//flynasPage.txt_To().sendKeys(pnrDetails.To);
		//Thread.sleep(2000);
		//flynasPage.txt_To().sendKeys(Keys.ENTER);

		if(pnrDetails.TripType.equals("OneWay"))
		{
			System.out.println("OneWay");
			PageUtils.clickElement(driver,flynasPage.current_Date());
			//flynasPage.current_Date().click();
		}
		else if(pnrDetails.TripType.equals("RoundTrip"))
		{
			
			flynasPage.return_start_date("17").click();
			flynasPage.return_start_date("24").click();
		}
		
		
		

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
		//Thread.sleep(1000);
         PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL_ENGINE);
         PageUtils.clickElement(driver, flynasPage.btn_Search());
		 //flynasPage.btn_Search().click();
		
		//Terms and Conditions of Travel to Saudi Arabia to Perform Hajj and Umrah
         alertBox(driver);
		
	}
	
	public static void modifySearch(Database pnrDetails,String d,String m,String y,String r_d,String r_m,String r_y,WebDriver driver) throws Exception
	{
		
		
		if("OneWay".equals(pnrDetails.TripType))
		{
			PageUtils.isElementDisplayed(driver, flynasPage.btn_Modify());
			PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL_ENGINE);
			 PageUtils.clickElement(driver, flynasPage.btn_Modify());
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.clickElement(driver, flynasPage.btn_depe());
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.clickElement(driver, flynasPage.border_MandY_D());
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.clickElement(driver, flynasPage.border_Year_D());
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 PageUtils.clickElement(driver, flynasPage.select_Year_D(y));
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 //D
			 //PageUtils.clickElement(driver, flynasPage.select_Month_D(m));
			 flynasPage.select_Month_D(m);
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
			 flynasPage.SelectDate(d);
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL_ENGINE);
			 
			//Thread.sleep(20000);
			//flynasPage.btn_Modify().click();
			//Thread.sleep(1000);
			//flynasPage.btn_depe().click();
			//Thread.sleep(1000);
			//flynasPage.border_MandY_D().click();
			//Thread.sleep(1000);
			//flynasPage.border_Year_D().click();
			//Thread.sleep(1000);
			//flynasPage.select_Year_D(y).click();
			//Thread.sleep(1000);
			//flynasPage.select_Month_D(m).click();
			//Thread.sleep(1000);
			//flynasPage.SelectDate(d);
			//Thread.sleep(2000);
		}
		else if("RoundTrip".equals(pnrDetails.TripType))
		{
		
			Thread.sleep(20000);
			flynasPage.btn_Modify().click();
			Thread.sleep(1000);
			flynasPage.btn_depe().click();
			Thread.sleep(1000);
			flynasPage.border_MandY_D().click();
			Thread.sleep(1000);
			flynasPage.border_Year_D().click();
			Thread.sleep(1000);
			flynasPage.select_Year_D(y).click();
			Thread.sleep(1000);
			//D
			//flynasPage.select_Month_D(m).click();
			flynasPage.select_Month_D(m);
			Thread.sleep(1000);
			flynasPage.SelectDate(d);
			Thread.sleep(2000);

			//flynasPage.btn_Return().click();
			Thread.sleep(1000);
			flynasPage.border_MandY_R().click();
			Thread.sleep(1000);
			flynasPage.border_Year_R().click();
			Thread.sleep(1000);
			flynasPage.select_Year_R(r_y);
			Thread.sleep(1000);
			flynasPage.select_Month_new_R(r_m);
			Thread.sleep(1000);
			flynasPage.SelectDate(r_d);
			Thread.sleep(1000);
		
		
		
		
		}
		 PageUtils.clickElement(driver, flynasPage.btn_ModifySearch());
		//flynasPage.btn_ModifySearch().click();
		Thread.sleep(5000);
		
	}
	
	
	public static void selectFlightNumberAndCurrency(String baggage,double currency,Database pnrDetails,WebDriver driver) throws Exception
	{
		
		 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		flynasPage.flight_Numbers(pnrDetails.DepartureFlightNumber,pnrDetails);
		 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		System.out.println("flynasPage.flightNumber:" + flynasPage.flightNumber);

		if (flynasPage.flightNumber.equals(pnrDetails.DepartureFlightNumber)) {
			
			if (baggage.equals(flynasPage.baggage20_kg().getText())) {
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
					
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Plus);
					driver.quit();
					
					
				}

			} else if (baggage.equals(flynasPage.baggage30_kg().getText())) {
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
					
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Premium);
					driver.quit();
					
					
				}
			}

			else if (baggage.equals("0")) {

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
					
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Light);
					driver.quit();
					
					
				}
				

			}
			

		
		
		
		}
		else {
			
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

	
	public static void enterDetails(Database pnrDetails) throws Exception
	{
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
		
		
		
		
		
		
	   /* flynasPage.drp_title().click();
	    Thread.sleep(1000);
	    flynasPage.select_Title("Mr.").click();
		Thread.sleep(2000);
		flynasPage.firstname().sendKeys(adult_1_firstname);
		flynasPage.lastname().sendKeys(adult_1_lastname);
		Thread.sleep(2000);
		
		flynasPage.drp_date().click();
		Thread.sleep(1000);
		flynasPage.select_date("04").click();
		Thread.sleep(1000);
		flynasPage.drp_month().click();
		Thread.sleep(1000);
		flynasPage.select_month("July").click();
		Thread.sleep(1000);
		flynasPage.drp_year().click();
		Thread.sleep(1000);
		flynasPage.select_year("2001").click();
		Thread.sleep(1000);
		flynasPage.drp_DocumentType().click();
		Thread.sleep(1000);
		flynasPage.select_DocumentType("Passport").click();
		Thread.sleep(1000);
		flynasPage.drp_IssueingCountry().click();
		Thread.sleep(1000);
		flynasPage.select_IssueingCountry("Samoa").click();
		Thread.sleep(1000);
		

		
		flynasPage.txtNumber().sendKeys("2345");
		
		
          Thread.sleep(2000);
		
		flynasPage.drp_doc_ex_date().click();
		Thread.sleep(1000);
		flynasPage.select_doc_ex_date("09").click();
		Thread.sleep(1000);
		flynasPage.drp_doc_ex_month().click();
		Thread.sleep(1000);
		flynasPage.select_doc_ex_month("June").click();
		Thread.sleep(1000);
		flynasPage.drp_doc_ex_year().click();
		Thread.sleep(1000);
		flynasPage.select_doc_ex_year("2025").click();
		Thread.sleep(1000);*/
		
		flynasPage.drp_county_code().click();
		Thread.sleep(2000);
		flynasPage.type_county_code().sendKeys(CountryCode);
		Thread.sleep(2000);
		flynasPage.select_county_code(CountryCode).click();
		Thread.sleep(1000);
		flynasPage.txt_mobilenumber().sendKeys(passengersDetails.phoneNumber);
		Thread.sleep(1000);
		flynasPage.txt_email().sendKeys(passengersDetails.emailId);
		Thread.sleep(1000);
		
		
		
		flynasPage.btn_submitl().click();
		Thread.sleep(15000);
		
		
		
		flynasPage.btn_submitl().click();
		
		Thread.sleep(15000);
		
		 
		flynasPage.btn_submitl().click();
		Thread.sleep(5000);
		flynasPage.btn_Ok().click();
		
		
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
		
	
		
	try {
		
		
		flynasPage.homePage_Agree().click();
		try{
			
		}
		catch(Exception e1)
		{
			
		}
		
		}
	 catch(Exception e){
		  System.out.println("No Alert"); 
		          
		      }
			
		
	}
	
	public static void selectFlightNumberReturn(String baggage,double currency,Database pnrDetails,WebDriver driver) throws Exception
	{
		
		 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		flynasPage.flight_Numbers(pnrDetails.DepartureFlightNumber,pnrDetails);
		 PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
		System.out.println("DepartureFlightNumber:" + flynasPage.flightNumber);
		if("OneWay".equals(pnrDetails.TripType)){

		if (flynasPage.flightNumber.equals(pnrDetails.DepartureFlightNumber)) {
			try{
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
					PageUtils.getScreenShot(pnrDetails.PnrId,driver);
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," "+Plus+" Website amount is greater than "+ pnrDetails.Amount +" API amount");
					System.out.println("API Amount:" + pnrDetails.Amount + " WebSite Amount:" + Plus);
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
					PageUtils.getScreenShot(pnrDetails.PnrId,driver);
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," "+Premium+" Website amount is greater than "+ pnrDetails.Amount +" API amount");
					System.out.println("API Amount:" + pnrDetails.Amount + " WebSite Amount:" + Premium);
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
					PageUtils.getScreenShot(pnrDetails.PnrId,driver);
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," "+Light+" Website amount is greater than "+ pnrDetails.Amount +" API amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Light);
					driver.quit();
					
					
				}

			}
			}
			catch(Exception e)
			{
            System.out.println("OneWay: Choose your fare Details Are Not Showing ");
				
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
				
					//flynasPage.Return_Light_currency_value().click();
					System.out.println("API Amount:" + pnrDetails.Amount);
					System.out.println("WebSite Amount:" + Light);
				} else {
					PageUtils.getScreenShot(pnrDetails.PnrId,driver);
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," "+Light+" Website amount is greater than "+ pnrDetails.Amount +" API amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Light);
					driver.quit();
					
					
				}
			}

		
		
		
	
		}
        else {
			
			System.out.println("Flight Not Found");
			PageUtils.getScreenShot(pnrDetails.PnrId,driver);
			 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," Flight Not Found");
			driver.quit();
			
			
		}
		}
		
		else if("RoundTrip".equals(pnrDetails.TripType))
		{
			System.out.println("R1_F");
			      PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
				flynasPage.flight_Numbers(pnrDetails.DepartureFlightNumber,pnrDetails);
				 PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
				System.out.println("DepartureFlightNumber:" + flynasPage.flightNumber);
				System.out.println("APIFlightNumber:" + pnrDetails.DepartureFlightNumber);
				
			if (flynasPage.flightNumber.equals(pnrDetails.DepartureFlightNumber)) {
			
			try{
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
				
			
			catch(Exception e)
			{
				System.out.println("OneWay-Round Trip: Choose your fare Details Are Not Showing ");
			}
			}
			
					
			/*else {
				passengersDetails.returnStatus_fail(pnrDetails.Domain,"100","FLight Number Does Not Match");
				System.out.println("FLight Number Does Not Match");
				driver.quit();
				
				
			}*/
			
			//Round Trip
			PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
			flynasPage.return_flight_Numbers(pnrDetails.ReturnFlightNumber,pnrDetails);
			 PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
		    System.out.println("ReturnFlightNumber:" + flynasPage.return_flight_Numbers );
			
			if (flynasPage.return_flight_Numbers.equals(pnrDetails.ReturnFlightNumber)) {
				System.out.println("R1_F2");
				try{
				if (flynasPage.Return_baggage20_kg().getText().equals(baggage)) {
					System.out.println("Plus" + flynasPage.Return_baggage20_kg().getText());
					System.out.println("API Baggage:" + pnrDetails.Baggage);
					flynasPage.Return_Plus_currency_value().click();
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
						flynasPage.Return_Plus_currency_value().click();
						System.out.println("API Amount:" + pnrDetails.Amount);
						System.out.println("WebSite Amount:" + Plus);
					} else {
						PageUtils.getScreenShot(pnrDetails.PnrId,driver);
						 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," "+Plus+" Website amount is greater than "+ pnrDetails.Amount +" API amount");
						System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Plus);
						driver.quit();
						
						
					}

				} else if (flynasPage.Return_baggage30_kg().getText().equals(baggage)) {
					System.out.println("Premium:" + flynasPage.Return_baggage30_kg().getText());
					System.out.println("API Baggage:" + pnrDetails.Baggage);

					flynasPage.Return_Premium_currency_value().click();
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
						
						flynasPage.Return_Premium_currency_value().click();
						System.out.println("API Amount:" + pnrDetails.Amount);
						System.out.println("WebSite Amount:" + Premium);
					} else {
						PageUtils.getScreenShot(pnrDetails.PnrId,driver);
						 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," "+Premium+" Website amount is greater than "+ pnrDetails.Amount +" API amount");
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
						PageUtils.getScreenShot(pnrDetails.PnrId,driver);
						 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," "+Light+" Website amount is greater than "+ pnrDetails.Amount +" API amount");
						System.out.println("API Amount:" + pnrDetails.Amount + " WebSite Amount:" + Light);
						driver.quit();
						
						
					}

				}
				
				

			
			}
			catch(Exception e)
			{
				System.out.println("Round Trip: Choose your fare Details Are Not Showing ");
				
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
				
					//flynasPage.Return_Light_currency_value().click();
					System.out.println("API Amount:" + pnrDetails.Amount);
					System.out.println("WebSite Amount:" + Light);
				} else {
					PageUtils.getScreenShot(pnrDetails.PnrId,driver);
					 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId," "+Light+" Website amount is greater than "+ pnrDetails.Amount +" API amount");
					System.out.println("API Amount:" + pnrDetails.Amount + "WebSite Amount:" + Light);
					driver.quit();
					
					
				}

				
			}
			}		
			else {
				PageUtils.getScreenShot(pnrDetails.PnrId,driver);
				 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Flight Not Found");
				System.out.println("Return FLight Number Does Not Match");
				driver.quit();
				
				
			}
		}
	
		PageUtils.getScreenShot(pnrDetails.PnrId,driver);
		PageUtils.scrollDownExact(driver, flynasPage.btn_Continue());
		flynasPage.btn_Continue().click();
		System.out.println("SRP:Click On Continue Button");
		Thread.sleep(10000);

		
		try{
		if (flynasPage.btn_PopUp().getText().equals("continue with the current choice")) {

			flynasPage.btn_PopUp().click();
			PageUtils.getScreenShot(pnrDetails.PnrId,driver);
			System.out.println("SRP ALERT:Click On Continue With The Current Choice");
			Thread.sleep(15000);

		}
		}
		catch(Exception e)
		{
			System.out.println("SRP ALERT:Not Found");
		}

		Thread.sleep(10000);
		
}

	


}
