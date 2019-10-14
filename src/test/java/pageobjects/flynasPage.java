package pageobjects;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import modules.passengersDetails;

public class flynasPage extends BaseClass {

	private static WebElement element;
	public static String flightNumber="0";
	public static String return_flight_Numbers="0";
	
	public flynasPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement roundTrip_f() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//label[@btn-radio=\"'round'\"]"));
			} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	public static WebElement oneyWay_f() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//label[@btn-radio=\"'oneway'\"]"));
		
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement multyCity_f() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='From'])[1]/preceding::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement clk_From() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='From'])[1]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_From() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[@name='origin']//input[@placeholder='Origin']"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_CityName_Enter(String CityName) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//span[contains(text(),'"+CityName+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_To() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[@name='destination']//input[@placeholder='Destination']"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement current_Date() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//td[@class='available'][contains(text(),'28')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement return_start_date(String date) throws Exception {
		element = null;
		
		try {
			element = driver.findElement(By.xpath("//td[@class='available'][contains(text(),'"+date+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement return_end_date() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//td[@class='active end-date in-range available']"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement drp_date_clk() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//input[@id='daterange1']"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_passenger() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText("Passengers1 Adult"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement adult_increase() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Adult'])[1]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement child_increase() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Child'])[1]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement infant_increase() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Under 2 years'])[1]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement btn_Search() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_homePage() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Terms & Conditions'])[3]/following::h2[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement homePage_Agree() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("confirmTrue"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement bookingPage_Text() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='VAT No.'])[1]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Modify() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[@id='divModifyheader']/h2"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement btn_depe() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::div[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement border_MandY_D() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sun'])[1]/preceding::strong[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement border_Year_D() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='January'])[1]/preceding::button[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement select_Year_D(String year) throws Exception {
		element = null;
		try {
			if(year.equals("2019"))
			{
				
				element = driver.findElement(By.xpath("//span[@class='text-info']"));
				System.out.println("Oneway:Select Year:"+year);
			}
			else{
			element = driver.findElement(By.xpath("//span[contains(text(),'"+year+"')]"));
			System.out.println("Oneway:Select Year:"+year);
			}
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static List<WebElement> select_Month_D(String M) throws Exception {
		List<WebElement> element = null;
		
		String[] monthName = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December"};

		
		
		try{
		 element = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td/button/span[not(contains(@class,'btn btn-default'))]"));
		 for (WebElement e1 : element) {
				String ele = e1.getText();
				

				if (ele.equals(M)) {
					System.out.println("OneWay:Select Month:"+e1.getText());
					e1.click();	
					break;
				}
				// Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			
		}
		 
        /*Calendar cal = Calendar.getInstance();
        String month = monthName[cal.get(Calendar.MONTH)];

        System.out.println("Month name: " + month);
		try {
			//current month
			if(month.equalsIgnoreCase(M)){
				
			element = driver.findElement(By.xpath("//span[@class='text-info']"));
			
			}else{
				System.out.println("else");
			element = driver.findElement(By.xpath("//button[@class='btn btn-default']//span[contains(text(),'"+M+"')]"));
			}
		} catch (Exception e) {
			
			throw (e);
		}
		return element;*/
		
		return element;
	}
	public static WebElement select_Date_D(String D) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//span[contains(text(),'"+D+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static List<WebElement> SelectDate(String D) throws Exception
	{
	
		List<WebElement> element = null;
		
		
		try {
			// element = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td"));
			element = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td/button/span[not(contains(@class,'text-muted'))]"));
			
			
			for (WebElement e1 : element) {
				String ele = e1.getText();
				

				if (ele.equals(D)) {
					
					e1.click();	
					System.out.println("O&R:Select Date:"+D);
					break;
				}
				// Thread.sleep(1000);
			}
			
		}
		 catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement get_date_value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Origin'])[3]/preceding::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement getReturn_date_value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='+ Add More'])[1]/preceding::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Return() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[2]/following::div[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement border_MandY_R() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sun'])[1]/preceding::strong[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement border_Year_R() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='January'])[1]/preceding::button[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static List<WebElement> select_Year_R(String year) throws Exception {
		List<WebElement> element = null;
		try {
			if(year.equals("2019"))
			{
				//element = driver.findElement(By.xpath("//span[@class='text-info']"));
				
                  element = driver.findElements(By.xpath("//span[@class='text-info']"));
				
				for (WebElement e1 : element) {
					String ele = e1.getText();

					if (ele.equals(year)) {
						//System.out.println("Return :Select Year:"+e1.getText());
						e1.click();
						// Thread.sleep(1000);
						break;
					}
					// Thread.sleep(1000);
				}
				System.out.println("RoundTrip:Current:Select Year:"+year);
			}
			else{
			//element = driver.findElement(By.xpath("//span[contains(text(),'"+year+"')]"));
				element = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td/button/span[not(contains(@class,'text-info'))]"));
				
				for (WebElement e1 : element) {
					String ele = e1.getText();

					if (ele.equals(year)) {
						//System.out.println("Return :Select Year:"+e1.getText());
						e1.click();
						// Thread.sleep(1000);
						break;
					}
					// Thread.sleep(1000);
				}
				
			System.out.println("RoundTrip:Select Year:"+year);
			}
			
		} catch (Exception e) {
			
			throw (e);
		}
		return  element;
	}
	public static WebElement select_Month_R(String M) throws Exception {
		
     element = null;
		
		
		try {
			
				System.out.println("else");
				element = driver.findElement(By.xpath("//button[@class='btn btn-default btn-info active']//span[contains(text(),'"+M+"')]"));
			//element = driver.findElement(By.xpath("//button[@class='btn btn-default']//span[contains(text(),'"+M+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
		
		
		
		
	}
	
	public static List<WebElement> select_Month_new_R(String M) throws Exception {
		
		List<WebElement> element = null;
		try {
			 element = driver.findElements(By.xpath("//table[@role='grid']/tbody/tr/td/button/span[not(contains(@class,'btn btn-default'))]"));
			
			for (WebElement e1 : element) {
				String ele = e1.getText();

				if (ele.equals(M)) {
					System.out.println("Return :Select Month:"+e1.getText());
					e1.click();
					// Thread.sleep(1000);
					break;
				}
				// Thread.sleep(1000);
			}
		}
		
		 catch (Exception e) {
			
			throw (e);
		}
		return element;
			
			
			
		}
	
	
	public static WebElement select_Date_R(String D) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//span[contains(text(),'"+D+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_ModifySearch() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//button[@type='submit']"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement no_Flights_Found1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='No flights available. Please choose a different date and search again'])[2]/preceding::div[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement flight_Numbers(String FlightNUM,Database pnrDetails) throws Exception {
		element = null;
		try {
			List<WebElement> element = driver.findElements(By.xpath("//div[@id='collapseOne0']//tbody//tr[1]//td[4]//div[1]//div[1]//span[1]"));
			List<WebElement> element1 = driver.findElements(By.xpath("//div[@id='collapseOne0']//tbody//tr[1]//td[5]//button[1]"));
			
			//System.out.println("element.size:"+element.size());
			
			for(int i=1;i<=element.size();i++)
			{
				//System.out.println(11);
				        if (driver.findElement(By.xpath("//div[@id='collapseOne0']//tbody["+i+"]//tr[1]//td[4]//div[1]//div[1]//span[1]")).getText().equals(FlightNUM))
						{
				        	
				        
				        	 flightNumber=driver.findElement(By.xpath("//div[@id='collapseOne0']//tbody["+i+"]//tr[1]//td[4]//div[1]//div[1]//span[1]")).getText();
				        	String e=driver.findElement(By.xpath("//div[@id='collapseOne0']//tbody["+i+"]//tr[1]//td[4]//div[1]//div[1]//span[1]")).getText();
						    //System.out.println(e);
						  //Sold Out
						   try{
							   PageUtils.scrollDownExact(driver, driver.findElement(By.xpath("//div[@id='collapseOne0']//tbody["+i+"]//tr[1]//td[5]//button[1]")));
						        driver.findElement(By.xpath("//div[@id='collapseOne0']//tbody["+i+"]//tr[1]//td[5]//button[1]")).click();
						   }
						   catch(Exception e2)
						   {
							   System.out.println("SoldOut");
							   PageUtils.getScreenShot(pnrDetails.PnrId,driver);
							   passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"SoldOut");
							   driver.quit();
								
						   }
						    break;
						}
				        

				       
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("FLIGHT NUMBER DOES NOT FOUND");
			throw (e);
			
		}
		return element;
	}
	
	public static WebElement return_flight_Numbers(String FlightNUM,Database pnrDetails) throws Exception {
		element = null;
		try {
			List<WebElement> element = driver.findElements(By.xpath("//div[@id='collapseOne1']//tbody//tr[1]//td[4]//div[1]//div[1]//span[1]"));
			List<WebElement> element1 = driver.findElements(By.xpath("//div[@id='collapseOne1']//tbody//tr[1]//td[5]//button[1]"));
			
			
			
			for(int i=1;i<=element.size();i++)
			{
				//System.out.println(11);
				        if (driver.findElement(By.xpath("//div[@id='collapseOne1']//tbody["+i+"]//tr[1]//td[4]//div[1]//div[1]//span[1]")).getText().equals(FlightNUM))
						{
				        	//System.out.println("naga");
				        
				        	return_flight_Numbers=driver.findElement(By.xpath("//div[@id='collapseOne1']//tbody["+i+"]//tr[1]//td[4]//div[1]//div[1]//span[1]")).getText();
				        	String e=driver.findElement(By.xpath("//div[@id='collapseOne1']//tbody["+i+"]//tr[1]//td[4]//div[1]//div[1]//span[1]")).getText();
						    //System.out.println(e);
				        	try{
						    PageUtils.scrollDownExact(driver, driver.findElement(By.xpath("//div[@id='collapseOne1']//tbody["+i+"]//tr[1]//td[5]//button[1]")));
						    driver.findElement(By.xpath("//div[@id='collapseOne1']//tbody["+i+"]//tr[1]//td[5]//button[1]")).click();
				        	}
				        	catch(Exception e3)
				        	{
				        		 System.out.println("SoldOut");
				        		 PageUtils.getScreenShot(pnrDetails.PnrId,driver);
				        		 passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"SoldOut");
								   driver.quit();
				        	}
							
						    break;
						}

				       
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("RETURN FLIGHT NUMBER DOES NOT FOUND");
			throw (e);
			
		}
		return element;
	}
	public static WebElement currency() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[@id='collapseOne0']//tbody//tr[1]//td[5]//button[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement rightside_Total_Value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Total'])[1]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement Plus_currency_value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Plus'])[1]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement Return_Plus_currency_value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Plus'])[3]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement Light_currency_value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Light'])[1]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement Return_Light_currency_value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Light'])[3]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement Premium_currency_value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Premium'])[1]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement Return_Premium_currency_value() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Premium'])[3]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement free_baggage() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='For a fee'])[2]/preceding::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement baggage20_kg() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Standard'])[1]/preceding::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement Return_baggage20_kg() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Standard'])[3]/preceding::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement baggage30_kg() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='All available'])[1]/preceding::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement Return_baggage30_kg() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='All available'])[3]/preceding::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_PopUp() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText("continue with the current choice"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Continue() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Back'])[1]/following::button[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_title_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[1]/following::span[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_Title(String Title) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+Title+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement firstname_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[1]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement lastname_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[1]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement drp_date_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[1]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement select_date(String date) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+date+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_month_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[1]/following::span[5]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement select_month(String Mon) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+Mon+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement drp_year_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[2]/preceding::i[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_year(String Y) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+Y+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Nationality_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[2]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement select_Nationality(String nation) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+nation+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement drp_DocumentType_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[2]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement select_DocumentType(String docType) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+docType+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement drp_IssueingCountry_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[2]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
			
	public static WebElement type_IssueingCountry() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Afghanistan'])[1]/preceding::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement select_IssueingCountry(String issuCountry) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+issuCountry+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement txtNumber_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[1]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_doc_ex_date_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[1]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement select_doc_ex_date(String expDate) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+expDate+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement drp_doc_ex_month_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[1]/following::span[5]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_doc_ex_month(String expMon) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+expMon+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_doc_ex_year_1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[2]/following::span[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_doc_ex_year(String expY) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+expY+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	//-------------------------------------TWO---------------------------------------------------
	
	public static WebElement drp_title_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[3]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement firstname_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[2]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement lastname_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[2]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement drp_date_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[2]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_month_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[2]/following::span[5]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_year_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[4]/preceding::i[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement btn_Nationality_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[4]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_DocumentType_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[4]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_IssueingCountry_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[4]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement txtNumber_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[2]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_doc_ex_date_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[2]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_doc_ex_month_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[2]/following::span[5]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement drp_doc_ex_year_2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[4]/following::span[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
//-------------------------------------------------Three----------------------------------------------
	public static WebElement drp_title_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[5]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement firstname_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[3]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement lastname_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[3]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement drp_date_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[3]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_month_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[3]/following::span[5]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_year_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[6]/preceding::i[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Nationality_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[6]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_DocumentType_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[6]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_IssueingCountry_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[6]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement txtNumber_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[3]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_doc_ex_date_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[3]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_doc_ex_month_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[3]/following::span[5]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement drp_doc_ex_year_3() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[6]/following::span[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
//--------------------------FOUR--------------------------------------------------------
	public static WebElement drp_title_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[7]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement firstname_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[4]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement lastname_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[4]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement drp_date_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[4]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_month_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[4]/following::span[5]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_year_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[8]/preceding::i[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement btn_Nationality_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[8]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_DocumentType_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[8]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_IssueingCountry_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[8]/following::span[2]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement txtNumber_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[4]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement drp_doc_ex_date_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[4]/following::i[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement drp_doc_ex_month_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[4]/following::span[5]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement drp_doc_ex_year_4() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[8]/following::span[3]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}

	
	//--------------------------FIVE--------------------------------------------------------
		public static WebElement drp_title_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[9]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement firstname_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[5]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement lastname_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[5]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement drp_date_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[5]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_month_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[5]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_year_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[10]/preceding::i[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement btn_Nationality_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[10]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_DocumentType_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[10]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_IssueingCountry_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[10]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement txtNumber_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[5]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_doc_ex_date_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[5]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_doc_ex_month_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[5]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement drp_doc_ex_year_5() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[10]/following::span[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
	
	
	//-------------------------------SIX-----------------------------------------
		public static WebElement drp_title_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[11]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement firstname_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[6]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement lastname_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[6]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement drp_date_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[6]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_month_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[6]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_year_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[12]/preceding::i[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement btn_Nationality_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[12]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_DocumentType_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[12]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_IssueingCountry_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[12]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement txtNumber_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[6]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_doc_ex_date_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[6]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_doc_ex_month_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[6]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement drp_doc_ex_year_6() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[12]/following::span[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
	
	//------------------------SEVEN-------------------------------------------------
		
		public static WebElement drp_title_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[13]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement firstname_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[7]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement lastname_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[7]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement drp_date_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[7]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_month_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[7]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_year_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[14]/preceding::i[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement btn_Nationality_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[14]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_DocumentType_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[14]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_IssueingCountry_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[14]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement txtNumber_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[7]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_doc_ex_date_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[7]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_doc_ex_month_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[7]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement drp_doc_ex_year_7() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[14]/following::span[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
//----------------------------------EIGHT---------------------------------------------------
		
		public static WebElement drp_title_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[15]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement firstname_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[8]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement lastname_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[8]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement drp_date_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[8]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_month_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[8]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_year_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[16]/preceding::i[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement btn_Nationality_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[16]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}	
		
		public static WebElement drp_DocumentType_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[16]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_IssueingCountry_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[16]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement txtNumber_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[8]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_doc_ex_date_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[8]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_doc_ex_month_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[8]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement drp_doc_ex_year_8() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[16]/following::span[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
	
//---------------------NINE---------------------------------------------------------
		
		public static WebElement drp_title_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[17]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement firstname_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name*'])[9]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement lastname_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name*'])[9]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement drp_date_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[9]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_month_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date of birth*'])[9]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_year_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[18]/preceding::i[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement btn_Nationality_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Nationality*'])[18]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement drp_DocumentType_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document type*'])[18]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_IssueingCountry_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Issuing country*'])[18]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement txtNumber_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Number*'])[9]/following::input[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		public static WebElement drp_doc_ex_date_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[9]/following::i[1]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement drp_doc_ex_month_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Document expiry date*'])[9]/following::span[5]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		
		
		public static WebElement drp_doc_ex_year_9() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MONTH'])[18]/following::span[3]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement get_Country_Code_Text() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Country code*'])[2]/following::span[2]"));
				
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
	public static WebElement drp_county_code() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[@placeholder='Country code*']//i[@class='caret pull-right']"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement type_county_code() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Country code*'])[2]/following::input[1]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_county_code(String CountryCode) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+CountryCode+"')]"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_mobilenumber() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.name("mobilenum"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_email() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.name("emailaddress"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Conf_Pwd() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.name("regconpassword"));
			
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_submitl() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Back'])[1]/following::button[1]"));
			                                       
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	public static WebElement travel_insurance_Alert() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add'])[1]/following::button[1]"));
			                                       
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement btn_Ok() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			                                       
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
	
	
	////Credit/Debit Card
	
		public static WebElement select_Card_Type(String cardType) throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[contains(text(),'"+cardType+"')]"));
			                                       
		} catch (Exception e) {
			
			throw (e);
		}
		return element;
	}
		public static WebElement select_Card_Type_New(String cardType) throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("//span[contains(text(),'"+cardType+"')]"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement txt_Card_Number() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.name("cardNumber"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement txt_Holder_Name() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.name("cardName"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement btn_card_month_CD() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit/Debit Card'])[2]/following::span[2]"));
				//element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Expiry date'])[1]/preceding::span[4]"));
				                                      
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement btn_card_month_C() throws Exception {
			element = null;
			try {
				//element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit/Debit Card'])[2]/following::span[2]"));
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Credit Card'])[2]/following::span[1]"));
				                                      
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement select_card_Month(String Month) throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("//div[contains(text(),'"+Month+"')]"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
	
		public static WebElement btn_card_year() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Expiry date'])[1]/following::span[1]"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		public static WebElement select_card_year(String year) throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("//div[contains(text(),'"+year+"')]"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement txt_CVV_Number() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.name("cvnum"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
		
		public static WebElement btn_Payment_Continue() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.id("divSubmitPayment"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}
						
		public static WebElement PNR_get() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Share on'])[1]/following::b[1]"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}		
		
		public static WebElement show_values() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.cssSelector("div.bundle-container"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}	
		
		public static WebElement get_left_value() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Checked baggage'])[1]/preceding::div[1]"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}		
		
		
		public static WebElement invalid_passport() throws Exception {
			element = null;
			try {
				element = driver.findElement(By.xpath("//b[contains(text(),'Travel document information is invalid.')]"));
				                                       
			} catch (Exception e) {
				
				throw (e);
			}
			return element;
		}		
						
								
}
