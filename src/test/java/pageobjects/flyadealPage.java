package pageobjects;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class flyadealPage extends BaseClass {

	private static WebElement element;
	
	
	public flyadealPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement oneyWay_flydeal() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Travel Dates'])[1]/preceding::i[1]"));
			} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	public static WebElement roundTrip_flydeal() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add Promo Code'])[1]/preceding::i[2]"));
			} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	public static WebElement From_flydeal() throws Exception {
		element = null;
		try {
			element = driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='From'])[1]/following::div[3]"));
			} catch (Exception e) {
			throw (e);
		}
		return element;
	}
	
	
}
