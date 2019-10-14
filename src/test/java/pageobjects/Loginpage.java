package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Loginpage extends BaseClass {

	private static WebElement element;
	
	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement Email() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("Email"));
			//Log.info("Email text box  is found on the  Login home Page");
		} catch (Exception e) {
			//Log.error("Email text box  is not found on the  Login home Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Password() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("Password"));
			//Log.info("Password text box  is found on the  Login home Page");
		} catch (Exception e) {
			//Log.error("Password text box  is not found on the  Login home Page");
			throw (e);
		}
		return element;
	}

	
	public static WebElement Login_button() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//input[@value='Log in']"));
			//Log.info("Log in button is found on the  Login home Page");
		} catch (Exception e) {
			//Logerror("Log in button is not found on the  Login home Page");
			throw (e);
		}
		return element;
	}
	
	//After Login
	
	
	
	public static WebElement Flight_tab() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText("Flight"));
			//Loginfo("Flight tab is found on the Form   Page");
		} catch (Exception e) {
			//Logerror("Flight tab is not found on the Form  Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Hotel_tab() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText("Hotel"));
			//Loginfo("Hotel tab is found on the Form   Page");
		} catch (Exception e) {
			//Logerror("Hotel tab is not found on the Form  Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Hotel_E_Wallethistory_tab() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText("Hotel E - Wallet history"));
			//Loginfo("Hotel E - Wallet history tab is found on the Form   Page");
		} catch (Exception e) {
			//Logerror("Hotel E - Wallet history tab is not found on the Form  Page");
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement Month_back() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//th/img"));
			//Loginfo("Cleander back button is found on the Form   Page");
		} catch (Exception e) {
			//Logerror("Cleander back button is not found on the Form  Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Month_forward() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//th[3]/img"));
			//Loginfo("Cleander back button is found on the TO   Page");
		} catch (Exception e) {
			//Logerror("Cleander back button is not found on the TO  Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement FromDate() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("fltFromdatepicker"));
			//Loginfo("FromDate select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("FromDate select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Hotel_FromDate() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("fromHotelDate"));
			//Loginfo("Hotel_FromDate select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("Hotel_FromDate select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Cab_FromDate() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("txtFromDatepicker"));
			//Loginfo("FromDate select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("FromDate select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Select_dateFrom(String ie) throws Exception {
		element = null;
		try {
			List<WebElement> we2 = driver
					.findElements(By.xpath("//table[@class=' table-condensed']//tbody/tr/td[@class='day']"));
			//Loginfo("Displaying Datefrom Calendar and store the list");
			// Thread.sleep(1000);
			// System.out.println(we2.size());

			for (WebElement e12 : we2) {
				//System.out.println(e12.getText());
				// Thread.sleep(1000);

				String ele = e12.getText();
				

				if (ele.equalsIgnoreCase(ie)) {
					e12.click();
					// Thread.sleep(1000);
					break;
				}
				// Thread.sleep(1000);
			}

		} catch (Exception e) {
			//Logerror("Calender is not displaying");
			throw (e);
		}
		return element;
	}
	
	public static WebElement ToDate() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("fltTodatepicker"));
			//Loginfo("ToDate select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("ToDate select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Hotel_ToDate() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("toHotelDate"));
			//Loginfo("Hotel_ToDate select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("Hotel_ToDate select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Cab_ToDate() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("txtToDatepicker"));
			//Loginfo("ToDate select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("ToDate select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	//table[@class=' table-condensed']//tbody/tr/td[@class='active day']
	public static WebElement Select_dateTo(String ie) throws Exception {
		element = null;
		try {
			List<WebElement> we2 = driver
					.findElements(By.xpath("//table[@class=' table-condensed']//tbody/tr/td[@class='day']"));
			//Loginfo("Displaying DateTo Calendar and store the list");
			// Thread.sleep(4000);
			// System.out.println(we2.size());

			for (WebElement e12 : we2) {
				//System.out.println(e12.getText());
				// Thread.sleep(1000);

				String ele = e12.getText();
				if (ele.equalsIgnoreCase(ie)) {
					e12.click();
					// Thread.sleep(4000);
					break;
				}
				// Thread.sleep(4000);
			}

		} catch (Exception e) {
			//Logerror("Calender is not displaying");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Select_activateDate(String ie) throws Exception {
		element = null;
		try {
			List<WebElement> we2 = driver
					.findElements(By.xpath("//table[@class=' table-condensed']//tbody/tr/td[@class='active day']"));
			//Loginfo("Displaying DateTo Calendar and store the list");
			// Thread.sleep(4000);
			// System.out.println(we2.size());

			for (WebElement e12 : we2) {
				System.out.println(e12.getText());
				// Thread.sleep(1000);

				String ele = e12.getText();
				if (ele.equalsIgnoreCase(ie)) {
					Thread.sleep(2000);
					e12.click();
				 //Thread.sleep(2000);
					break;
				}
				// Thread.sleep(4000);
			}

		} catch (Exception e) {
			//Logerror("Calender is not displaying");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Select_dateTo_ActiveDate(String ie) throws Exception {
		element = null;
		try {
			List<WebElement> we2 = driver
					.findElements(By.xpath("//table[@class=' table-condensed']//tbody/tr/td[@class='active day']"));
			//Loginfo("Displaying DateTo Calendar and store the list");
			// Thread.sleep(4000);
			// System.out.println(we2.size());

			for (WebElement e12 : we2) {
				System.out.println(e12.getText());
				// Thread.sleep(1000);

				String ele = e12.getText();
				if (ele.equalsIgnoreCase(ie)) {
					e12.click();
					// Thread.sleep(4000);
					break;
				}
				// Thread.sleep(4000);
			}

		} catch (Exception e) {
			//Logerror("Calender is not displaying");
			throw (e);
		}
		return element;
	}
	public static WebElement Supplier() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("supplier"));
			//Loginfo("Supplier select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("Supplier select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement BookingSatus() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("status"));
			//Loginfo("BookingSatus select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("BookingSatus select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Client() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("ClientId"));
			//Loginfo("BookingSatus select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("BookingSatus select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Hotel_BookingSatus() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("htlBookingStatus"));
			//Loginfo("Hotel_BookingSatus select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("Hotel_BookingSatus select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Cabs_BookingSatus() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("ddlBookingStatus"));
			//Loginfo("BookingSatus select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("BookingSatus select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement PaymentStatus() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("PaymentStatus"));
			//Loginfo("PaymentStatus select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("PaymentStatus select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement PNR_textbox() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("pnr"));
			//Loginfo("PNR_textbox   is found on the Form Page");
		} catch (Exception e) {
			//Logerror("PNR_textbox  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement BookingId_textbox() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("bookingId"));
			//Loginfo("BookingId_textbox   is found on the Form Page");
		} catch (Exception e) {
			//Logerror("BookingId_textbox  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement TicketNo_textbox() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("ticketNo"));
			//Loginfo("ticketNo_textbox   is found on the Form Page");
		} catch (Exception e) {
			//Logerror("ticketNo_textbox  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement PaxEmail_textbox() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("paxEmail"));
			//Loginfo("paxEmail_textbox   is found on the Form Page");
		} catch (Exception e) {
			//Logerror("paxEmail_textbox  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement paxPhNo_textbox() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("paxPhNo"));
			//Loginfo("paxPhNo_textbox   is found on the Form Page");
		} catch (Exception e) {
			//Logerror("paxPhNo_textbox  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement paxName_textbox() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("paxName"));
			//Loginfo("paxName_textbox   is found on the Form Page");
		} catch (Exception e) {
			//Logerror("paxName_textbox  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement airlinepnr_textbox() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("airlinepnr"));
			//Loginfo("airlinepnr_textbox   is found on the Form Page");
		} catch (Exception e) {
			//Logerror("airlinepnr_textbox  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement TripType() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("TripType"));
			//Loginfo("TripType select box  is found on the Form Page");
		} catch (Exception e) {
			//Logerror("TripType select box  is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement ENettDetails_checkbox() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.id("ENettDetails"));
			//Loginfo("ENettDetails check box is found on the Form Page");
		} catch (Exception e) {
			//Logerror("ENettDetails check box is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement Search_button() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//input[@value='Search']"));
			//Loginfo("Search_button button is found on the Form Page");
		} catch (Exception e) {
			//Logerror("Search_button button is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Hotel_Search_button() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(//input[@value='Search'])[2]"));
			//Loginfo("Hotel_Search_button button is found on the Form Page");
		} catch (Exception e) {
			//Logerror("Hotel_Search_button button is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Clear_button() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//input[@value='Clear']"));
			//Loginfo("Clear_button button is found on the Form Page");
		} catch (Exception e) {
			//Logerror("Clear_button button is not found on the Form Page");
			throw (e);
		}
		return element;
	}
	
	//Flight results Count
	
	public static WebElement FlightResults_text() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[@id='searchresults']/div/div/div[2]"));
			                                      //div[@id='careemCab1']/div/div/div/div/div[2]
			//Loginfo("FlightResults_text  is found on the After Search the Flights ");
		} catch (Exception e) {
			//Logerror("FlightResults_text  is not found on the After Search the Flights ");
			throw (e);
		}
		return element;
	}
	
	public static WebElement CabResults_text() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//div[@id='careemCab1']/div/div/div/div/div[2]"));
			                                      
			//Loginfo("FlightResults_text  is found on the After Search the Flights ");
		} catch (Exception e) {
			//Logerror("FlightResults_text  is not found on the After Search the Flights ");
			throw (e);
		}
		return element;
	}
	
	
	//logOut
	
	public static WebElement ClickOnUsername() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//li[@id='myDisplay']/a"));
			//Loginfo("UserName is found on the Top of the Right corner ");
		} catch (Exception e) {
			//Logerror("UserName is not found on the Top of the Right corner");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Log_Out() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText("Log Out"));
			//Loginfo("log out button is found on the Top of the Right corner ");
		} catch (Exception e) {
			//Logerror("log out button is not found on the Top of the Right corner");
			throw (e);
		}
		return element;
	}
	
	//Log information
	
	
	public static WebElement LogInformation_text1() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//tr[1][@class='tabRow BS_userRow BS_userRow-Hotel']/td[4][@class='extrbr flight_BookLogDetails']"));
			//Loginfo("LogInformation_text1  is found on the Booking details page ");
		} catch (Exception e) {
			//Logerror("LogInformation_text1  is not found on the Booking details page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement LogInformation_text2() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("//tr[2][@class='tabRow BS_userRow BS_userRow-Hotel']/td[4][@class='extrbr flight_BookLogDetails']"));
			//Loginfo("LogInformation_text2  is found on the Booking details page ");
		} catch (Exception e) {
			//Logerror("LogInformation_text2  is not found on the Booking details page");
			throw (e);
		}
		return element;
	}
	
	
	
	//Hotel link
	
	public static WebElement Hotel_link() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText("Hotel"));
			//Loginfo("Hotel_Tab is found on the Search page ");
		} catch (Exception e) {
			//Logerror("Hotel_Tab is not found on the Search page");
			throw (e);
		}
		return element;
	}
	
	//AE link
	
	public static WebElement COM_link() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText(".COM Callcenter"));
			//Loginfo("COM_link is found on the Home page ");
		} catch (Exception e) {
			//Logerror("COM_link is not found on the Home page");
			throw (e);
		}
		return element;
	}
	
	
	
	public static WebElement AE_link() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText(".AE Callcenter"));
			//Loginfo("AE_link is found on the Home page ");
		} catch (Exception e) {
			//Logerror("AE_link is not found on the Home page");
			throw (e);
		}
		return element;
	}
	//SA link
	public static WebElement SA_link() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText(".SA Callcenter"));
			//Loginfo("SA_link is found on the Home page ");
		} catch (Exception e) {
			//Logerror("SA_link is not found on the Home page");
			throw (e);
		}
		return element;
	}
	
	//EG link
	
	
	public static WebElement EG_link() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.linkText(".EG Callcenter"));
			//Loginfo("EG_link is found on the Home page ");
		} catch (Exception e) {
			//Logerror("EG_link is not found on the Home page");
			throw (e);
		}
		return element;
	}
	
}
