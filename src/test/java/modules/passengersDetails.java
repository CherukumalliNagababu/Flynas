package modules;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.hamcrest.core.Is;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.google.gson.Gson;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pageobjects.CardDetails;
import pageobjects.Database;
import pageobjects.PageUtils;
import pageobjects.Pax;
import pageobjects.flynasPage;



public class passengersDetails {
	
	//DOB
	static String adult1_dof_d;
	static String adult1_dof_m;
	static String adult1_dof_y;
	static String adult1_doc_Number;
	static String adult1_doc_Type;
	
	static String adult2_dof_d;
	static String adult2_dof_m;
	static String adult2_dof_y;
	static String adult2_doc_Number;
	static String adult2_doc_Type;
	
	static String adult3_dof_d;
	static String adult3_dof_m;
	static String adult3_dof_y;
	static String adult3_doc_Number;
	static String adult3_doc_Type;
	
	static String adult4_dof_d;
	static String adult4_dof_m;
	static String adult4_dof_y;
	static String adult4_doc_Number;
	static String adult4_doc_Type;
	
	static String adult5_dof_d;
	static String adult5_dof_m;
	static String adult5_dof_y;
	static String adult5_doc_Number;
	static String adult5_doc_Type;
	
	static String adult6_dof_d;
	static String adult6_dof_m;
	static String adult6_dof_y;
	static String adult6_doc_Number;
	static String adult6_doc_Type;
	
	static String adult7_dof_d;
	static String adult7_dof_m;
	static String adult7_dof_y;
	static String adult7_doc_Number;
	static String adult7_doc_Type;
	
	static String adult8_dof_d;
	static String adult8_dof_m;
	static String adult8_dof_y;
	static String adult8_doc_Number;
	static String adult8_doc_Type;
	
	static String adult9_dof_d;
	static String adult9_dof_m;
	static String adult9_dof_y;
	static String adult9_doc_Number;
	static String adult9_doc_Type;
	
	
	 
	static String child1_dof_d;
	static String child1_dof_m;
	static String child1_dof_y;
	static String child1_doc_Number;
	static String child1_doc_Type;
	
	static String child2_dof_d;
	static String child2_dof_m;
	static String child2_dof_y;
	static String child2_doc_Number;
	static String child2_doc_Type;
	
	static String child3_dof_d;
	static String child3_dof_m;
	static String child3_dof_y;
	static String child3_doc_Number;
	static String child3_doc_Type;
	
	static String child4_dof_d;
	static String child4_dof_m;
	static String child4_dof_y;
	static String child4_doc_Number;
	static String child4_doc_Type;
	
	static String child5_dof_d;
	static String child5_dof_m;
	static String child5_dof_y;
	static String child5_doc_Number;
	static String child5_doc_Type;
	
	static String child6_dof_d;
	static String child6_dof_m;
	static String child6_dof_y;
	static String child6_doc_Number;
	static String child6_doc_Type;
	
	static String child7_dof_d;
	static String child7_dof_m;
	static String child7_dof_y;
	static String child7_doc_Number;
	static String child7_doc_Type;
	
	static String child8_dof_d;
	static String child8_dof_m;
	static String child8_dof_y;
	static String child8_doc_Number;
	static String child8_doc_Type;
	 
	static String infant1_dof_d;
	static String infant1_dof_m;
	static String infant1_dof_y;
	static String infant1_doc_Number;
	static String infant1_doc_Type;
	
	static String infant2_dof_d;
	static String infant2_dof_m;
	static String infant2_dof_y;
	static String infant2_doc_Number;
	static String infant2_doc_Type;
	
	static String infant3_dof_d;
	static String infant3_dof_m;
	static String infant3_dof_y;
	static String infant3_doc_Number;
	static String infant3_doc_Type;
	
	static String infant4_dof_d;
	static String infant4_dof_m;
	static String infant4_dof_y;
	static String infant4_doc_Number;
	static String infant4_doc_Type;
	
		 
	
	 
	 //PSAA
	static String adult1_pass_d;
	static String adult1_pass_m;
	static String adult1_pass_y;
	
	static String adult2_pass_d;
	static String adult2_pass_m;
	static String adult2_pass_y;
	
	static String adult3_pass_d;
	static String adult3_pass_m;
	static String adult3_pass_y;
	
	
	static String adult4_pass_d;
	static String adult4_pass_m;
	static String adult4_pass_y;
	
	static String adult5_pass_d;
	static String adult5_pass_m;
	static String adult5_pass_y;
	
	static String adult6_pass_d;
	static String adult6_pass_m;
	static String adult6_pass_y;
	
	static String adult7_pass_d;
	static String adult7_pass_m;
	static String adult7_pass_y;
	
	static String adult8_pass_d;
	static String adult8_pass_m;
	static String adult8_pass_y;
	
	static String adult9_pass_d;
	static String adult9_pass_m;
	static String adult9_pass_y;
	 
	static String child1_pass_d;
	static String child1_pass_m;
	static String child1_pass_y;
	
	static String child2_pass_d;
	static String child2_pass_m;
	static String child2_pass_y;
	
	static String child3_pass_d;
	static String child3_pass_m;
	static String child3_pass_y;
	
	static String child4_pass_d;
	static String child4_pass_m;
	static String child4_pass_y;
	
	static String child5_pass_d;
	static String child5_pass_m;
	static String child5_pass_y;
	
	static String child6_pass_d;
	static String child6_pass_m;
	static String child6_pass_y;
	
	static String child7_pass_d;
	static String child7_pass_m;
	static String child7_pass_y;
	
	static String child8_pass_d;
	static String child8_pass_m;
	static String child8_pass_y;
	 
	static String infant1_pass_d;
	static String infant1_pass_m;
	static  String infant1_pass_y;
	
	static String infant2_pass_d;
	static String infant2_pass_m;
	static  String infant2_pass_y;
	
	static String infant3_pass_d;
	static String infant3_pass_m;
	static  String infant3_pass_y;
	
	
	static String infant4_pass_d;
	static String infant4_pass_m;
	static  String infant4_pass_y;
	
	static String infant5_pass_d;
	static String infant5_pass_m;
	static  String infant5_pass_y;
	
	static String infant6_pass_d;
	static String infant6_pass_m;
	static  String infant6_pass_y;
	
	static String infant7_pass_d;
	static String infant7_pass_m;
	static  String infant7_pass_y;
	
	static String infant8_pass_d;
	static String infant8_pass_m;
	static  String infant8_pass_y;
	
	
	
	static String adult_1_Title;
	static String adult_1_firstname;
	static String adult_1_lastname;
	static String adult_1_nation;
	static String adult_1_IC;
	
	static String adult_2_Title;
	static String adult_2_firstname;
	static String adult_2_lastname;
	static String adult_2_nation;
	static String adult_2_IC;
	
	static String adult_3_Title;
	static String adult_3_lastname;
	static String adult_3_firstname;
	static String adult_3_nation;
	static String adult_3_IC;
	
	static String adult_4_Title;
	static String adult_4_lastname;
	static String adult_4_firstname;
	static String adult_4_nation;
	static String adult_4_IC;
	
	static String adult_5_Title;
	static String adult_5_lastname;
	static String adult_5_firstname;
	static String adult_5_nation;
	static String adult_5_IC;
	
	static String adult_6_Title;
	static String adult_6_lastname;
	static String adult_6_firstname;
	static String adult_6_nation;
	static String adult_6_IC;
	
	static String adult_7_Title;
	static String adult_7_lastname;
	static String adult_7_firstname;
	static String adult_7_nation;
	static String adult_7_IC;
	
	static String adult_8_Title;
	static String adult_8_lastname;
	static String adult_8_firstname;
	static String adult_8_nation;
	static String adult_8_IC;
	
	static String adult_9_Title;
	static String adult_9_lastname;
	static String adult_9_firstname;
	static String adult_9_nation;
	static String adult_9_IC;
	
	
	
	
	static String child_1_Title;
	static String child_1_firstname;
	static String child_1_lastname;
	static String child_1_nation;
	static String child_1_IC;
	
	static String child_2_Title;
	static String child_2_firstname;
	static String child_2_lastname;
	static String child_2_nation;
	static String child_2_IC;
	
	static String child_3_Title;
	static String child_3_firstname;
	static String child_3_lastname;
	static String child_3_nation;
	static String child_3_IC;
	
	static String child_4_Title;
	static String child_4_firstname;
	static String child_4_lastname;
	static String child_4_nation;
	static String child_4_IC;
	
	static String child_5_Title;
	static String child_5_firstname;
	static String child_5_lastname;
	static String child_5_nation;
	static String child_5_IC;
	
	static String child_6_Title;
	static String child_6_firstname;
	static String child_6_lastname;
	static String child_6_nation;
	static String child_6_IC;
	
	static String child_7_Title;
	static String child_7_firstname;
	static String child_7_lastname;
	static String child_7_nation;
	static String child_7_IC;
	
	static String child_8_Title;
	static String child_8_firstname;
	static String child_8_lastname;
	static String child_8_nation;
	static String child_8_IC;
	
	static String infant_1_Title;
	static String infant_1_firstname;
	static String infant_1_lastname;
	static String infant_1_nation;
	static String infant_1_IC;
	
	static String infant_2_Title;
	static String infant_2_firstname;
	static String infant_2_lastname;
	static String infant_2_nation;
	static String infant_2_IC;
	
	static String infant_3_Title;
	static String infant_3_firstname;
	static String infant_3_lastname;
	static String infant_3_nation;
	static String infant_3_IC;
	
	static String infant_4_Title;
	static String infant_4_firstname;
	static String infant_4_lastname;
	static String infant_4_nation;
	static String infant_4_IC;
	
	
	
	static String phoneNumber;
	static String emailId;
	static String CountryCode;
	static String mobileCode;
	static String ProcessIdValue="2";
	static String StatusId="1";
	static WebDriver driver;
public static void adult1() throws Exception {
		PageUtils.isElementLocated(driver,	By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title*'])[1]/following::span[1]"));

		PageUtils.waitForFixedTime(BrowserContants.WAIT_LONG);

		PageUtils.isElementVisibil(driver, flynasPage.drp_title_1());
		flynasPage.drp_title_1().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_1_Title));
		flynasPage.select_Title(adult_1_Title).click();

		PageUtils.isElementVisibil(driver, flynasPage.firstname_1());
		flynasPage.firstname_1().sendKeys(adult_1_firstname);
		PageUtils.isElementVisibil(driver, flynasPage.lastname_1());
		flynasPage.lastname_1().sendKeys(adult_1_lastname);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_month_1());
		flynasPage.drp_month_1().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_month(adult1_dof_m));
		flynasPage.select_month(adult1_dof_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_date_1());
		flynasPage.drp_date_1().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_date(adult1_dof_d));
		flynasPage.select_date(adult1_dof_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_year_1());
		flynasPage.drp_year_1().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_year(adult1_dof_y));
		flynasPage.select_year(adult1_dof_y).click();

		PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_1());
		flynasPage.btn_Nationality_1().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_1_nation);
		PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_1_nation));
		flynasPage.select_Nationality(adult_1_nation).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_1());
		flynasPage.drp_DocumentType_1().click();
		
		if(adult1_doc_Type.equals("Passport"))
		{
			PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult1_doc_Type));
			flynasPage.select_DocumentType(adult1_doc_Type).click();
			PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_1());
			flynasPage.drp_IssueingCountry_1().click();
			PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
			flynasPage.type_IssueingCountry().sendKeys(adult_1_IC);
			PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_1_IC));
			flynasPage.select_IssueingCountry(adult_1_IC).click();

			PageUtils.isElementVisibil(driver, flynasPage.txtNumber_1());
			flynasPage.txtNumber_1().sendKeys(adult1_doc_Number);
			
			PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_1());
			flynasPage.drp_doc_ex_month_1().click();

			PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult1_pass_m));
			flynasPage.select_doc_ex_month(adult1_pass_m).click();

			PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_1());
			flynasPage.drp_doc_ex_date_1().click();

			PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult1_pass_d));
			flynasPage.select_doc_ex_date(adult1_pass_d).click();

			

			PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_1());
			flynasPage.drp_doc_ex_year_1().click();

			PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult1_pass_y));
			flynasPage.select_doc_ex_year(adult1_pass_y).click();
				
			
		}
		else if(adult1_doc_Type.equals("National ID"))
		{
			PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult1_doc_Type));
			flynasPage.select_DocumentType(adult1_doc_Type).click();
			PageUtils.isElementVisibil(driver, flynasPage.txtNumber_1());
			flynasPage.txtNumber_1().sendKeys(adult1_doc_Number);
     		
     		 
		}
		
		
		
		else if(adult1_doc_Type.equals("Saudi Iqama"))
		{
			PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult1_doc_Type));
			flynasPage.select_DocumentType(adult1_doc_Type).click();
			PageUtils.isElementVisibil(driver, flynasPage.txtNumber_1());
			flynasPage.txtNumber_1().sendKeys(adult1_doc_Number);
	 		
	 		  
		}
		
		
		
		
        
}
public static void adult2() throws Exception {
    
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_2());
	flynasPage.drp_title_2().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_2_Title));
	flynasPage.select_Title(adult_2_Title).click();

	PageUtils.isElementVisibil(driver, flynasPage.firstname_2());
	flynasPage.firstname_2().sendKeys(adult_2_firstname);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_2());
	flynasPage.lastname_2().sendKeys(adult_2_lastname);
	
	PageUtils.isElementVisibil(driver, flynasPage.drp_month_2());
	flynasPage.drp_month_2().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_month(adult2_dof_m));
	flynasPage.select_month(adult2_dof_m).click();

	PageUtils.isElementVisibil(driver, flynasPage.drp_date_2());
	flynasPage.drp_date_2().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_date(adult2_dof_d));
	flynasPage.select_date(adult2_dof_d).click();

	

	PageUtils.isElementVisibil(driver, flynasPage.drp_year_2());
	flynasPage.drp_year_2().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_year(adult2_dof_y));
	flynasPage.select_year(adult2_dof_y).click();

	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_2());
	flynasPage.btn_Nationality_2().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(adult_2_nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_2_nation));
	flynasPage.select_Nationality(adult_2_nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_2());
	flynasPage.drp_DocumentType_2().click();
	
	if(adult2_doc_Type.equals("Passport"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult2_doc_Type));
		flynasPage.select_DocumentType(adult2_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_2());
		flynasPage.drp_IssueingCountry_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_2_IC);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_2_IC));
		flynasPage.select_IssueingCountry(adult_2_IC).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
		flynasPage.txtNumber_2().sendKeys(adult2_doc_Number);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_2());
		flynasPage.drp_doc_ex_month_2().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult2_pass_m));
		flynasPage.select_doc_ex_month(adult2_pass_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_2());
		flynasPage.drp_doc_ex_date_2().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult2_pass_d));
		flynasPage.select_doc_ex_date(adult2_pass_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_2());
		flynasPage.drp_doc_ex_year_2().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult2_pass_y));
		flynasPage.select_doc_ex_year(adult2_pass_y).click();
			
		
	}
	else if(adult2_doc_Type.equals("National ID"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult2_doc_Type));
		flynasPage.select_DocumentType(adult2_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
		flynasPage.txtNumber_2().sendKeys(adult2_doc_Number);
 		
 		 
	}
	
	
	
	else if(adult2_doc_Type.equals("Saudi Iqama"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult2_doc_Type));
		flynasPage.select_DocumentType(adult2_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
		flynasPage.txtNumber_2().sendKeys(adult2_doc_Number);
 		
 		  
	}
	
   
}

public static void adult3() throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_3());
	flynasPage.drp_title_3().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_3_Title));
	flynasPage.select_Title(adult_3_Title).click();

	PageUtils.isElementVisibil(driver, flynasPage.firstname_3());
	flynasPage.firstname_3().sendKeys(adult_3_firstname);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_3());
	flynasPage.lastname_3().sendKeys(adult_3_lastname);
	
	PageUtils.isElementVisibil(driver, flynasPage.drp_month_3());
	flynasPage.drp_month_3().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_month(adult3_dof_m));
	flynasPage.select_month(adult3_dof_m).click();

	PageUtils.isElementVisibil(driver, flynasPage.drp_date_3());
	flynasPage.drp_date_3().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_date(adult3_dof_d));
	flynasPage.select_date(adult3_dof_d).click();

	

	PageUtils.isElementVisibil(driver, flynasPage.drp_year_3());
	flynasPage.drp_year_3().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_year(adult3_dof_y));
	flynasPage.select_year(adult3_dof_y).click();

	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_3());
	flynasPage.btn_Nationality_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(adult_3_nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_3_nation));
	flynasPage.select_Nationality(adult_3_nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_3());
	flynasPage.drp_DocumentType_3().click();
	
	if(adult3_doc_Type.equals("Passport"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult3_doc_Type));
		flynasPage.select_DocumentType(adult3_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_3());
		flynasPage.drp_IssueingCountry_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_3_IC);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_3_IC));
		flynasPage.select_IssueingCountry(adult_3_IC).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(adult3_doc_Number);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_3());
		flynasPage.drp_doc_ex_month_3().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult3_pass_m));
		flynasPage.select_doc_ex_month(adult3_pass_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_3());
		flynasPage.drp_doc_ex_date_3().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult3_pass_d));
		flynasPage.select_doc_ex_date(adult3_pass_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_3());
		flynasPage.drp_doc_ex_year_3().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult3_pass_y));
		flynasPage.select_doc_ex_year(adult3_pass_y).click();
			
		
	}
	else if(adult3_doc_Type.equals("National ID"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult3_doc_Type));
		flynasPage.select_DocumentType(adult3_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(adult3_doc_Number);
 		
 		 
	}
	
	
	
	else if(adult3_doc_Type.equals("Saudi Iqama"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult3_doc_Type));
		flynasPage.select_DocumentType(adult3_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(adult3_doc_Number);
 		
 		  
	}
	
   
}
public static void adult4() throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_4());
	flynasPage.drp_title_4().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_4_Title));
	flynasPage.select_Title(adult_4_Title).click();

	PageUtils.isElementVisibil(driver, flynasPage.firstname_4());
	flynasPage.firstname_4().sendKeys(adult_4_firstname);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_4());
	flynasPage.lastname_4().sendKeys(adult_4_lastname);
	
	PageUtils.isElementVisibil(driver, flynasPage.drp_month_4());
	flynasPage.drp_month_4().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_month(adult4_dof_m));
	flynasPage.select_month(adult4_dof_m).click();

	PageUtils.isElementVisibil(driver, flynasPage.drp_date_4());
	flynasPage.drp_date_4().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_date(adult4_dof_d));
	flynasPage.select_date(adult4_dof_d).click();

	

	PageUtils.isElementVisibil(driver, flynasPage.drp_year_4());
	flynasPage.drp_year_4().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_year(adult4_dof_y));
	flynasPage.select_year(adult4_dof_y).click();

	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_4());
	flynasPage.btn_Nationality_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(adult_4_nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_4_nation));
	flynasPage.select_Nationality(adult_4_nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_4());
	flynasPage.drp_DocumentType_4().click();
	
	if(adult4_doc_Type.equals("Passport"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult4_doc_Type));
		flynasPage.select_DocumentType(adult4_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_4());
		flynasPage.drp_IssueingCountry_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_4_IC);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_4_IC));
		flynasPage.select_IssueingCountry(adult_4_IC).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(adult4_doc_Number);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_4());
		flynasPage.drp_doc_ex_month_4().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult4_pass_m));
		flynasPage.select_doc_ex_month(adult4_pass_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_4());
		flynasPage.drp_doc_ex_date_4().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult4_pass_d));
		flynasPage.select_doc_ex_date(adult4_pass_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_4());
		flynasPage.drp_doc_ex_year_4().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult4_pass_y));
		flynasPage.select_doc_ex_year(adult4_pass_y).click();
			
		
	}
	else if(adult4_doc_Type.equals("National ID"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult4_doc_Type));
		flynasPage.select_DocumentType(adult4_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(adult4_doc_Number);
 		
 		 
	}
	
	
	
	else if(adult4_doc_Type.equals("Saudi Iqama"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult4_doc_Type));
		flynasPage.select_DocumentType(adult4_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(adult4_doc_Number);
 		
 		  
	}
	
    
}

public static void adult5() throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_5());
	flynasPage.drp_title_5().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_5_Title));
	flynasPage.select_Title(adult_5_Title).click();

	PageUtils.isElementVisibil(driver, flynasPage.firstname_5());
	flynasPage.firstname_5().sendKeys(adult_5_firstname);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_5());
	flynasPage.lastname_5().sendKeys(adult_5_lastname);
	
	PageUtils.isElementVisibil(driver, flynasPage.drp_month_5());
	flynasPage.drp_month_5().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_month(adult5_dof_m));
	flynasPage.select_month(adult5_dof_m).click();

	PageUtils.isElementVisibil(driver, flynasPage.drp_date_5());
	flynasPage.drp_date_5().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_date(adult5_dof_d));
	flynasPage.select_date(adult5_dof_d).click();

	

	PageUtils.isElementVisibil(driver, flynasPage.drp_year_5());
	flynasPage.drp_year_5().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_year(adult5_dof_y));
	flynasPage.select_year(adult5_dof_y).click();

	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_5());
	flynasPage.btn_Nationality_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(adult_5_nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_5_nation));
	flynasPage.select_Nationality(adult_5_nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_5());
	flynasPage.drp_DocumentType_5().click();
	
	if(adult5_doc_Type.equals("Passport"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult5_doc_Type));
		flynasPage.select_DocumentType(adult5_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_5());
		flynasPage.drp_IssueingCountry_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_5_IC);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_5_IC));
		flynasPage.select_IssueingCountry(adult_5_IC).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(adult5_doc_Number);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_5());
		flynasPage.drp_doc_ex_month_5().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult5_pass_m));
		flynasPage.select_doc_ex_month(adult5_pass_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_5());
		flynasPage.drp_doc_ex_date_5().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult5_pass_d));
		flynasPage.select_doc_ex_date(adult5_pass_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_5());
		flynasPage.drp_doc_ex_year_5().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult5_pass_y));
		flynasPage.select_doc_ex_year(adult5_pass_y).click();
			
		
	}
	else if(adult5_doc_Type.equals("National ID"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult5_doc_Type));
		flynasPage.select_DocumentType(adult5_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(adult5_doc_Number);
 		
 		 
	}
	
	
	
	else if(adult5_doc_Type.equals("Saudi Iqama"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult5_doc_Type));
		flynasPage.select_DocumentType(adult5_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(adult5_doc_Number);
 		
 		  
	}
	
	
   
}

public static void adult6() throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_6());
	flynasPage.drp_title_6().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_6_Title));
	flynasPage.select_Title(adult_6_Title).click();

	PageUtils.isElementVisibil(driver, flynasPage.firstname_6());
	flynasPage.firstname_6().sendKeys(adult_6_firstname);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_6());
	flynasPage.lastname_6().sendKeys(adult_6_lastname);
	
	PageUtils.isElementVisibil(driver, flynasPage.drp_month_6());
	flynasPage.drp_month_6().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_month(adult6_dof_m));
	flynasPage.select_month(adult6_dof_m).click();

	PageUtils.isElementVisibil(driver, flynasPage.drp_date_6());
	flynasPage.drp_date_6().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_date(adult6_dof_d));
	flynasPage.select_date(adult6_dof_d).click();

	

	PageUtils.isElementVisibil(driver, flynasPage.drp_year_6());
	flynasPage.drp_year_6().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_year(adult6_dof_y));
	flynasPage.select_year(adult6_dof_y).click();

	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_6());
	flynasPage.btn_Nationality_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(adult_6_nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_6_nation));
	flynasPage.select_Nationality(adult_6_nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_6());
	flynasPage.drp_DocumentType_6().click();
	
	if(adult6_doc_Type.equals("Passport"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult6_doc_Type));
		flynasPage.select_DocumentType(adult6_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_6());
		flynasPage.drp_IssueingCountry_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_6_IC);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_6_IC));
		flynasPage.select_IssueingCountry(adult_6_IC).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(adult6_doc_Number);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_6());
		flynasPage.drp_doc_ex_month_6().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult6_pass_m));
		flynasPage.select_doc_ex_month(adult6_pass_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_6());
		flynasPage.drp_doc_ex_date_6().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult6_pass_d));
		flynasPage.select_doc_ex_date(adult6_pass_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_6());
		flynasPage.drp_doc_ex_year_6().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult6_pass_y));
		flynasPage.select_doc_ex_year(adult6_pass_y).click();
			
		
	}
	else if(adult6_doc_Type.equals("National ID"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult6_doc_Type));
		flynasPage.select_DocumentType(adult6_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(adult6_doc_Number);
 		
 		 
	}
	
	
	
	else if(adult6_doc_Type.equals("Saudi Iqama"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult6_doc_Type));
		flynasPage.select_DocumentType(adult6_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(adult6_doc_Number);
 		
 		  
	}
	
	
   
}
public static void adult7() throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_7());
	flynasPage.drp_title_7().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_7_Title));
	flynasPage.select_Title(adult_7_Title).click();

	PageUtils.isElementVisibil(driver, flynasPage.firstname_7());
	flynasPage.firstname_7().sendKeys(adult_7_firstname);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_7());
	flynasPage.lastname_7().sendKeys(adult_7_lastname);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_7());
	flynasPage.drp_month_7().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_month(adult7_dof_m));
	flynasPage.select_month(adult7_dof_m).click();
	
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_7());
	flynasPage.drp_date_7().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_date(adult7_dof_d));
	flynasPage.select_date(adult7_dof_d).click();

	

	PageUtils.isElementVisibil(driver, flynasPage.drp_year_7());
	flynasPage.drp_year_7().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_year(adult7_dof_y));
	flynasPage.select_year(adult7_dof_y).click();

	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_7());
	flynasPage.btn_Nationality_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(adult_7_nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_7_nation));
	flynasPage.select_Nationality(adult_7_nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_7());
	flynasPage.drp_DocumentType_7().click();
	
	if(adult7_doc_Type.equals("Passport"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult7_doc_Type));
		flynasPage.select_DocumentType(adult7_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_7());
		flynasPage.drp_IssueingCountry_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_7_IC);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_7_IC));
		flynasPage.select_IssueingCountry(adult_7_IC).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(adult7_doc_Number);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_7());
		flynasPage.drp_doc_ex_month_7().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult7_pass_m));
		flynasPage.select_doc_ex_month(adult7_pass_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_7());
		flynasPage.drp_doc_ex_date_7().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult7_pass_d));
		flynasPage.select_doc_ex_date(adult7_pass_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_7());
		flynasPage.drp_doc_ex_year_7().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult7_pass_y));
		flynasPage.select_doc_ex_year(adult7_pass_y).click();
			
		
	}
	else if(adult7_doc_Type.equals("National ID"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult7_doc_Type));
		flynasPage.select_DocumentType(adult7_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(adult7_doc_Number);
 		
 		 
	}
	
	
	
	else if(adult7_doc_Type.equals("Saudi Iqama"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult7_doc_Type));
		flynasPage.select_DocumentType(adult7_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(adult7_doc_Number);
 		
 		  
	}
	
	
   
}
public static void adult8() throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_8());
	flynasPage.drp_title_8().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_8_Title));
	flynasPage.select_Title(adult_8_Title).click();

	PageUtils.isElementVisibil(driver, flynasPage.firstname_8());
	flynasPage.firstname_8().sendKeys(adult_8_firstname);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_8());
	flynasPage.lastname_8().sendKeys(adult_8_lastname);
	
	PageUtils.isElementVisibil(driver, flynasPage.drp_month_8());
	flynasPage.drp_month_8().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_month(adult8_dof_m));
	flynasPage.select_month(adult8_dof_m).click();


	PageUtils.isElementVisibil(driver, flynasPage.drp_date_8());
	flynasPage.drp_date_8().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_date(adult8_dof_d));
	flynasPage.select_date(adult8_dof_d).click();

	
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_8());
	flynasPage.drp_year_8().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_year(adult8_dof_y));
	flynasPage.select_year(adult8_dof_y).click();

	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_8());
	flynasPage.btn_Nationality_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(adult_8_nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_8_nation));
	flynasPage.select_Nationality(adult_8_nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_8());
	flynasPage.drp_DocumentType_8().click();
	
	if(adult8_doc_Type.equals("Passport"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult8_doc_Type));
		flynasPage.select_DocumentType(adult8_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_8());
		flynasPage.drp_IssueingCountry_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_8_IC);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_8_IC));
		flynasPage.select_IssueingCountry(adult_8_IC).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(adult8_doc_Number);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_8());
		flynasPage.drp_doc_ex_month_8().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult8_pass_m));
		flynasPage.select_doc_ex_month(adult8_pass_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_8());
		flynasPage.drp_doc_ex_date_8().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult8_pass_d));
		flynasPage.select_doc_ex_date(adult8_pass_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_8());
		flynasPage.drp_doc_ex_year_8().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult8_pass_y));
		flynasPage.select_doc_ex_year(adult8_pass_y).click();
			
		
	}
	else if(adult8_doc_Type.equals("National ID"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult8_doc_Type));
		flynasPage.select_DocumentType(adult8_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(adult8_doc_Number);
 		
 		 
	}
	
	
	
	else if(adult8_doc_Type.equals("Saudi Iqama"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult8_doc_Type));
		flynasPage.select_DocumentType(adult8_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(adult8_doc_Number);
 		
 		  
	}
	
}

public static void adult9() throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_9());
	flynasPage.drp_title_9().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_Title(adult_9_Title));
	flynasPage.select_Title(adult_9_Title).click();

	PageUtils.isElementVisibil(driver, flynasPage.firstname_9());
	flynasPage.firstname_9().sendKeys(adult_9_firstname);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_9());
	flynasPage.lastname_9().sendKeys(adult_9_lastname);
	
	PageUtils.isElementVisibil(driver, flynasPage.drp_month_9());
	flynasPage.drp_month_9().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_month(adult9_dof_m));
	flynasPage.select_month(adult9_dof_m).click();

	PageUtils.isElementVisibil(driver, flynasPage.drp_date_9());
	flynasPage.drp_date_9().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_date(adult9_dof_d));
	flynasPage.select_date(adult9_dof_d).click();

	

	PageUtils.isElementVisibil(driver, flynasPage.drp_year_9());
	flynasPage.drp_year_9().click();

	PageUtils.isElementVisibil(driver, flynasPage.select_year(adult9_dof_y));
	flynasPage.select_year(adult9_dof_y).click();

	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_9());
	flynasPage.btn_Nationality_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(adult_9_nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(adult_9_nation));
	flynasPage.select_Nationality(adult_9_nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_9());
	flynasPage.drp_DocumentType_9().click();
	
	if(adult9_doc_Type.equals("Passport"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult9_doc_Type));
		flynasPage.select_DocumentType(adult9_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_9());
		flynasPage.drp_IssueingCountry_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(adult_9_IC);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(adult_9_IC));
		flynasPage.select_IssueingCountry(adult_9_IC).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(adult9_doc_Number);
		
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_9());
		flynasPage.drp_doc_ex_month_9().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(adult9_pass_m));
		flynasPage.select_doc_ex_month(adult9_pass_m).click();

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_9());
		flynasPage.drp_doc_ex_date_9().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(adult9_pass_d));
		flynasPage.select_doc_ex_date(adult9_pass_d).click();

		

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_9());
		flynasPage.drp_doc_ex_year_9().click();

		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(adult9_pass_y));
		flynasPage.select_doc_ex_year(adult9_pass_y).click();
			
		
	}
	else if(adult9_doc_Type.equals("National ID"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult9_doc_Type));
		flynasPage.select_DocumentType(adult9_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(adult9_doc_Number);
 		
 		 
	}
	
	
	
	else if(adult9_doc_Type.equals("Saudi Iqama"))
	{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(adult9_doc_Type));
		flynasPage.select_DocumentType(adult9_doc_Type).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(adult9_doc_Number);
 		
 		  
	}
	
}

public static void child1(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
		PageUtils.isElementVisibil(driver, flynasPage.drp_title_2());
		flynasPage.drp_title_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
		flynasPage.select_Title(Title).click();
		PageUtils.isElementVisibil(driver, flynasPage.firstname_2());
		flynasPage.firstname_2().sendKeys(FN);
		PageUtils.isElementVisibil(driver, flynasPage.lastname_2());
		flynasPage.lastname_2().sendKeys(LN);

		PageUtils.isElementVisibil(driver, flynasPage.drp_month_2());
		flynasPage.drp_month_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
		flynasPage.select_month(m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_date_2());
		flynasPage.drp_date_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
		flynasPage.select_date(d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_year_2());
		flynasPage.drp_year_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
		flynasPage.select_year(y).click();
		PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_2());
		flynasPage.btn_Nationality_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(nation);
		PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
		flynasPage.select_Nationality(nation).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_2());
		flynasPage.drp_DocumentType_2().click();
	
	if(docType.equals("Passport"))
	{
			PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
			flynasPage.select_DocumentType(docType).click();
			PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_2());
			flynasPage.drp_IssueingCountry_2().click();
			PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
			flynasPage.type_IssueingCountry().sendKeys(IsCou);
			PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
			flynasPage.select_IssueingCountry(IsCou).click();

			PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
			flynasPage.txtNumber_2().sendKeys(number);

			PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_2());
			flynasPage.drp_doc_ex_month_2().click();
			PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
			flynasPage.select_doc_ex_month(P_m).click();
			PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_2());
			flynasPage.drp_doc_ex_date_2().click();
			PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
			flynasPage.select_doc_ex_date(P_d).click();
			PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_2());
			flynasPage.drp_doc_ex_year_2().click();
			PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
			flynasPage.select_doc_ex_year(P_y).click();
			
	}
	else if(docType.equals("National ID"))
	{
			PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
			flynasPage.select_DocumentType(docType).click();
			PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
			flynasPage.txtNumber_2().sendKeys(number);

	}
	
	else if(docType.equals("Saudi Iqama"))
	{
			PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
			flynasPage.select_DocumentType(docType).click();
			PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
			flynasPage.txtNumber_2().sendKeys(number);
	}
	
	
   
}
public static void child2(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_3());
	flynasPage.drp_title_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_3());
	flynasPage.firstname_3().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_3());
	flynasPage.lastname_3().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_3());
	flynasPage.drp_month_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_3());
	flynasPage.drp_date_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_3());
	flynasPage.drp_year_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_3());
	flynasPage.btn_Nationality_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_3());
	flynasPage.drp_DocumentType_3().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_3());
		flynasPage.drp_IssueingCountry_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_3());
		flynasPage.drp_doc_ex_month_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_3());
		flynasPage.drp_doc_ex_date_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_3());
		flynasPage.drp_doc_ex_year_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(number);
}

	
   
}
public static void child3(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_4());
	flynasPage.drp_title_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_4());
	flynasPage.firstname_4().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_4());
	flynasPage.lastname_4().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_4());
	flynasPage.drp_month_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_4());
	flynasPage.drp_date_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_4());
	flynasPage.drp_year_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_4());
	flynasPage.btn_Nationality_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_4());
	flynasPage.drp_DocumentType_4().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_4());
		flynasPage.drp_IssueingCountry_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_4());
		flynasPage.drp_doc_ex_month_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_4());
		flynasPage.drp_doc_ex_date_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_4());
		flynasPage.drp_doc_ex_year_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(number);
}

   
}
public static void child4(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_5());
	flynasPage.drp_title_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_5());
	flynasPage.firstname_5().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_5());
	flynasPage.lastname_5().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_5());
	flynasPage.drp_month_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_5());
	flynasPage.drp_date_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_5());
	flynasPage.drp_year_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_5());
	flynasPage.btn_Nationality_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_5());
	flynasPage.drp_DocumentType_5().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_5());
		flynasPage.drp_IssueingCountry_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_5());
		flynasPage.drp_doc_ex_month_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_5());
		flynasPage.drp_doc_ex_date_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_5());
		flynasPage.drp_doc_ex_year_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(number);
}

	
   
}
public static void child5(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_6());
	flynasPage.drp_title_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_6());
	flynasPage.firstname_6().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_6());
	flynasPage.lastname_6().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_6());
	flynasPage.drp_month_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_6());
	flynasPage.drp_date_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_6());
	flynasPage.drp_year_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_6());
	flynasPage.btn_Nationality_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_6());
	flynasPage.drp_DocumentType_6().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_6());
		flynasPage.drp_IssueingCountry_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_6());
		flynasPage.drp_doc_ex_month_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_6());
		flynasPage.drp_doc_ex_date_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_6());
		flynasPage.drp_doc_ex_year_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(number);
}

   
}
public static void child6(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_7());
	flynasPage.drp_title_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_7());
	flynasPage.firstname_7().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_7());
	flynasPage.lastname_7().sendKeys(LN);

	
	PageUtils.isElementVisibil(driver, flynasPage.drp_month_7());
	flynasPage.drp_month_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_7());
	flynasPage.drp_date_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_7());
	flynasPage.drp_year_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_7());
	flynasPage.btn_Nationality_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_7());
	flynasPage.drp_DocumentType_7().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_7());
		flynasPage.drp_IssueingCountry_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_7());
		flynasPage.drp_doc_ex_month_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_7());
		flynasPage.drp_doc_ex_date_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_7());
		flynasPage.drp_doc_ex_year_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(number);
}

    
}
public static void child7(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_8());
	flynasPage.drp_title_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_8());
	flynasPage.firstname_8().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_8());
	flynasPage.lastname_8().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_8());
	flynasPage.drp_month_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_8());
	flynasPage.drp_date_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_8());
	flynasPage.drp_year_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_8());
	flynasPage.btn_Nationality_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_8());
	flynasPage.drp_DocumentType_8().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_8());
		flynasPage.drp_IssueingCountry_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_8());
		flynasPage.drp_doc_ex_month_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_8());
		flynasPage.drp_doc_ex_date_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_8());
		flynasPage.drp_doc_ex_year_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(number);
}

    
}
public static void child8(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_9());
	flynasPage.drp_title_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_9());
	flynasPage.firstname_9().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_9());
	flynasPage.lastname_9().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_9());
	flynasPage.drp_month_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_9());
	flynasPage.drp_date_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_9());
	flynasPage.drp_year_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_9());
	flynasPage.btn_Nationality_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_9());
	flynasPage.drp_DocumentType_9().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_9());
		flynasPage.drp_IssueingCountry_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_9());
		flynasPage.drp_doc_ex_month_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_9());
		flynasPage.drp_doc_ex_date_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_9());
		flynasPage.drp_doc_ex_year_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(number);
}

   
}
public static void Infant1(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_2());
	flynasPage.drp_title_2().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_2());
	flynasPage.firstname_2().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_2());
	flynasPage.lastname_2().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_2());
	flynasPage.drp_month_2().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_2());
	flynasPage.drp_date_2().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_2());
	flynasPage.drp_year_2().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_2());
	flynasPage.btn_Nationality_2().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_2());
	flynasPage.drp_DocumentType_2().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_2());
		flynasPage.drp_IssueingCountry_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
		flynasPage.txtNumber_2().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_2());
		flynasPage.drp_doc_ex_month_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_2());
		flynasPage.drp_doc_ex_date_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_2());
		flynasPage.drp_doc_ex_year_2().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
		flynasPage.txtNumber_2().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_2());
		flynasPage.txtNumber_2().sendKeys(number);
}
	
	
	
	
    
}
public static void Infant2(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_3());
	flynasPage.drp_title_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_3());
	flynasPage.firstname_3().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_3());
	flynasPage.lastname_3().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_3());
	flynasPage.drp_month_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_3());
	flynasPage.drp_date_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_3());
	flynasPage.drp_year_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_3());
	flynasPage.btn_Nationality_3().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_3());
	flynasPage.drp_DocumentType_3().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_3());
		flynasPage.drp_IssueingCountry_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_3());
		flynasPage.drp_doc_ex_month_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_3());
		flynasPage.drp_doc_ex_date_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_3());
		flynasPage.drp_doc_ex_year_3().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_3());
		flynasPage.txtNumber_3().sendKeys(number);
}

	
	
   
}
public static void Infant3(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_4());
	flynasPage.drp_title_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_4());
	flynasPage.firstname_4().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_4());
	flynasPage.lastname_4().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_4());
	flynasPage.drp_month_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_4());
	flynasPage.drp_date_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_4());
	flynasPage.drp_year_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_4());
	flynasPage.btn_Nationality_4().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_4());
	flynasPage.drp_DocumentType_4().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_4());
		flynasPage.drp_IssueingCountry_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_4());
		flynasPage.drp_doc_ex_month_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_4());
		flynasPage.drp_doc_ex_date_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_4());
		flynasPage.drp_doc_ex_year_4().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_4());
		flynasPage.txtNumber_4().sendKeys(number);
}

	
   
}
public static void Infant4(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_5());
	flynasPage.drp_title_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_5());
	flynasPage.firstname_5().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_5());
	flynasPage.lastname_5().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_5());
	flynasPage.drp_month_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_5());
	flynasPage.drp_date_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_5());
	flynasPage.drp_year_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_5());
	flynasPage.btn_Nationality_5().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_5());
	flynasPage.drp_DocumentType_5().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_5());
		flynasPage.drp_IssueingCountry_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_5());
		flynasPage.drp_doc_ex_month_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_5());
		flynasPage.drp_doc_ex_date_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_5());
		flynasPage.drp_doc_ex_year_5().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_5());
		flynasPage.txtNumber_5().sendKeys(number);
}

	
    
}
public static void Infant5(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_6());
	flynasPage.drp_title_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_6());
	flynasPage.firstname_6().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_6());
	flynasPage.lastname_6().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_6());
	flynasPage.drp_month_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_6());
	flynasPage.drp_date_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_6());
	flynasPage.drp_year_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_6());
	flynasPage.btn_Nationality_6().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_6());
	flynasPage.drp_DocumentType_6().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_6());
		flynasPage.drp_IssueingCountry_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_6());
		flynasPage.drp_doc_ex_month_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_6());
		flynasPage.drp_doc_ex_date_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_6());
		flynasPage.drp_doc_ex_year_6().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_6());
		flynasPage.txtNumber_6().sendKeys(number);
}
   
}
public static void Infant6(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_7());
	flynasPage.drp_title_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_7());
	flynasPage.firstname_7().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_7());
	flynasPage.lastname_7().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_7());
	flynasPage.drp_month_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_7());
	flynasPage.drp_date_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_7());
	flynasPage.drp_year_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_7());
	flynasPage.btn_Nationality_7().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_7());
	flynasPage.drp_DocumentType_7().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_7());
		flynasPage.drp_IssueingCountry_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_7());
		flynasPage.drp_doc_ex_month_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_7());
		flynasPage.drp_doc_ex_date_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_7());
		flynasPage.drp_doc_ex_year_7().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_7());
		flynasPage.txtNumber_7().sendKeys(number);
}
   
}
public static void Infant7(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_8());
	flynasPage.drp_title_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_8());
	flynasPage.firstname_8().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_8());
	flynasPage.lastname_8().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_8());
	flynasPage.drp_month_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_8());
	flynasPage.drp_date_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_8());
	flynasPage.drp_year_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_8());
	flynasPage.btn_Nationality_8().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_8());
	flynasPage.drp_DocumentType_8().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_8());
		flynasPage.drp_IssueingCountry_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_8());
		flynasPage.drp_doc_ex_month_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_8());
		flynasPage.drp_doc_ex_date_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_8());
		flynasPage.drp_doc_ex_year_8().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_8());
		flynasPage.txtNumber_8().sendKeys(number);
}
    
}
public static void Infant8(String Title,String FN,String LN,String d,String m,String y,String docType,String IsCou,String number,String P_d,String P_m,String P_y,String nation) throws Exception {
	PageUtils.isElementVisibil(driver, flynasPage.drp_title_9());
	flynasPage.drp_title_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_Title(Title));
	flynasPage.select_Title(Title).click();
	PageUtils.isElementVisibil(driver, flynasPage.firstname_9());
	flynasPage.firstname_9().sendKeys(FN);
	PageUtils.isElementVisibil(driver, flynasPage.lastname_9());
	flynasPage.lastname_9().sendKeys(LN);

	PageUtils.isElementVisibil(driver, flynasPage.drp_month_9());
	flynasPage.drp_month_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_month(m));
	flynasPage.select_month(m).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_date_9());
	flynasPage.drp_date_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_date(d));
	flynasPage.select_date(d).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_year_9());
	flynasPage.drp_year_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_year(y));
	flynasPage.select_year(y).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_Nationality_9());
	flynasPage.btn_Nationality_9().click();
	PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
	flynasPage.type_IssueingCountry().sendKeys(nation);
	PageUtils.isElementVisibil(driver, flynasPage.select_Nationality(nation));
	flynasPage.select_Nationality(nation).click();
	PageUtils.isElementVisibil(driver, flynasPage.drp_DocumentType_9());
	flynasPage.drp_DocumentType_9().click();

if(docType.equals("Passport"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_IssueingCountry_9());
		flynasPage.drp_IssueingCountry_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.type_IssueingCountry());
		flynasPage.type_IssueingCountry().sendKeys(IsCou);
		PageUtils.isElementVisibil(driver, flynasPage.select_IssueingCountry(IsCou));
		flynasPage.select_IssueingCountry(IsCou).click();

		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(number);

		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_month_9());
		flynasPage.drp_doc_ex_month_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_month(P_m));
		flynasPage.select_doc_ex_month(P_m).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_date_9());
		flynasPage.drp_doc_ex_date_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_date(P_d));
		flynasPage.select_doc_ex_date(P_d).click();
		PageUtils.isElementVisibil(driver, flynasPage.drp_doc_ex_year_9());
		flynasPage.drp_doc_ex_year_9().click();
		PageUtils.isElementVisibil(driver, flynasPage.select_doc_ex_year(P_y));
		flynasPage.select_doc_ex_year(P_y).click();
		
}
else if(docType.equals("National ID"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(number);

}

else if(docType.equals("Saudi Iqama"))
{
		PageUtils.isElementVisibil(driver, flynasPage.select_DocumentType(docType));
		flynasPage.select_DocumentType(docType).click();
		PageUtils.isElementVisibil(driver, flynasPage.txtNumber_9());
		flynasPage.txtNumber_9().sendKeys(number);
}

   
}



public static void paxAPI(Database pnrDetails) throws InterruptedException, IOException
{		
	
	//randomMails();
	if(BrowserContants.ENV.equals("PRD"))
	{
		RestAssured.baseURI =BrowserContants.PRD_API_URL;
	}
	else if(BrowserContants.ENV.equals("STG"))
	{
		RestAssured.baseURI =BrowserContants.STG_API_URL;
	}
	//RestAssured.baseURI ="http://stageapi.rehlat.com/v1/Rehlat/flights";
	
	RequestSpecification request = RestAssured.given();
	//request.accept("text/xml");
	JSONObject requestParams = new JSONObject();
	request.header("Content-Type", "text/json");
	requestParams.put("Domain", pnrDetails.Domain);
	requestParams.put("PnrId", pnrDetails.PnrId);
	requestParams.put("ProcessId",  ProcessIdValue);
	//request.header("Accept", "text/xml");
   // request.contentType("text/json");
	//JSONObject requestParams = new JSONObject();
	//requestParams.put("id","142531");
	//requestParams.put("undefined", "\"142531\"");
	// Cast
	//requestParams.put("Language", "en");
	/*requestParams.put("To", "JED");
	requestParams.put("DepartureDate", "20190225");	
	requestParams.put("ReturnDate",  "20190228");
	requestParams.put("Currency", "USD");	 
	requestParams.put("Adults",  "1");
	requestParams.put("Children",  "0");
	requestParams.put("Infant",  "0");
	requestParams.put("CLASS",  "Economy");
	requestParams.put("UserName",  "rehlat");
	requestParams.put("Password",  "123456");*/
 
	//request.body(pnrDetails.PnrId);
	request.body(requestParams.toJSONString());
	Response response = request.post("/GetPaxDetailsForScraping");
	System.out.println("Response body: " + response.body().asString());
	String s=response.body().asString();
	//System.out.println(s);
	int statusCode = response.getStatusCode();
	System.out.println("The status code recieved: " + statusCode);
	
	Gson g = new Gson();
	Pax[] mcArray = g.fromJson(s, Pax[].class);
	List<Pax> p = Arrays.asList(mcArray);
	/*Gson g = new Gson();
	List<Pax> p =  g.fromJson(s, List<Pax.class>);
	*/
	//System.out.println("Pnr: " + p.pnr);
	int adultPaxCount = 1;
	int childPaxCount = 1;
	int infantPaxCount = 1;
	
	
	
	
	
	

	 for(Pax pax:p){
		 if(pax.PaxType.equals("ADULT")){
			 
			
			 if(adultPaxCount==1)
			 {
				 adult_1_firstname=pax.FirstName;
				 adult_1_lastname=pax.LastName;
				 adult_1_Title=pax.Title;
				 adult_1_nation= pax.Nationality;
				 adult_1_IC= pax.IssuingCountryName;
				 System.out.println("Adult First Name_"+adultPaxCount +": "+ pax.FirstName +"\n" +", Pax Type: " + pax.PaxType);
				 System.out.println("Adult Last Name_"+adultPaxCount +": "+ pax.LastName +"\n" +", Pax Type: " + pax.PaxType); 
				  phoneNumber=pax.PhoneNumber;
				  //emailId="travelme686@gmail.com";
				  randomMails();
				  CountryCode=pax.MobileCountry;
				   mobileCode=pax.MobileCode;
				 System.out.println("Adult First Name_"+adultPaxCount +": "+ pax.DocumentNumber );
				 System.out.println("Adult First Name_"+adultPaxCount +": "+ pax.DocumentType );
				 System.out.println("Adult First Name_"+adultPaxCount +": "+ pax.DobStr );
				  adult1_doc_Number=pax.DocumentNumber;
				 adult1_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult1_dof_d=S[0];
				  adult1_dof_m=S[1];
				  adult1_dof_y=S[2];
				 System.out.println("Adult First Name_"+adultPaxCount +": "+ pax.PassportExpiryDateStr );
				 String[] P=pax.PassportExpiryDateStr.split("-");
				  adult1_pass_d=P[0];
				  adult1_pass_m=P[1];
				  adult1_pass_y=P[2];
			 
			 }
			 if(adultPaxCount==2)
			 {
				 adult_2_firstname=pax.FirstName;
				 adult_2_lastname=pax.LastName;
				 adult_2_Title=pax.Title;
				 adult_2_nation= pax.Nationality;
				 adult_2_IC= pax.IssuingCountryName;
				 System.out.println("Adult First Name_"+adultPaxCount +": "+ pax.FirstName +"\n" +", Pax Type: " + pax.PaxType);
				 System.out.println("Adult Last Name_"+adultPaxCount +": "+ pax.LastName +"\n" +", Pax Type: " + pax.PaxType); 
				
				 System.out.println("Adult2 First Name_"+adultPaxCount +": "+ pax.DocumentNumber );
				 System.out.println("Adult2 First Name_"+adultPaxCount +": "+ pax.DocumentType );
				 System.out.println("Adult2 First Name_"+adultPaxCount +": "+ pax.DobStr );
				  adult2_doc_Number=pax.DocumentNumber;
				  adult2_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult2_dof_d=S[0];
				  adult2_dof_m=S[1];
				  adult2_dof_y=S[2];
				 System.out.println("Adult First Name_"+adultPaxCount +": "+ pax.PassportExpiryDateStr );
				 String[] P=pax.PassportExpiryDateStr.split("-");
				  adult2_pass_d=P[0];
				  adult2_pass_m=P[1];
				  adult2_pass_y=P[2];
			 
			 }
			 
			 if(adultPaxCount==3)
			 {
				 adult_3_firstname=pax.FirstName;
				 adult_3_lastname=pax.LastName;
				 adult_3_Title=pax.Title;
				 adult_3_nation= pax.Nationality;
				 adult_3_IC= pax.IssuingCountryName;
				 adult3_doc_Number=pax.DocumentNumber;
				 adult3_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult3_dof_d=S[0];
				  adult3_dof_m=S[1];
				  adult3_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  adult3_pass_d=P[0];
				  adult3_pass_m=P[1];
				  adult3_pass_y=P[2];
				 
				 
			 }
			 
			 if(adultPaxCount==4)
			 {
				 adult_4_firstname=pax.FirstName;
				 adult_4_lastname=pax.LastName;
				 adult_4_Title=pax.Title;
				 adult_4_nation= pax.Nationality;
				 adult_4_IC= pax.IssuingCountryName;
				 adult4_doc_Number=pax.DocumentNumber;
				 adult4_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult4_dof_d=S[0];
				  adult4_dof_m=S[1];
				  adult4_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  adult4_pass_d=P[0];
				  adult4_pass_m=P[1];
				  adult4_pass_y=P[2];
				 
				 
			 }
			 if(adultPaxCount==5)
			 {
				 adult_5_firstname=pax.FirstName;
				 adult_5_lastname=pax.LastName;
				 adult_5_Title=pax.Title;
				 adult_5_nation= pax.Nationality;
				 adult_5_IC= pax.IssuingCountryName;
				 adult5_doc_Number=pax.DocumentNumber;
				 adult5_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult5_dof_d=S[0];
				  adult5_dof_m=S[1];
				  adult5_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  adult5_pass_d=P[0];
				  adult5_pass_m=P[1];
				  adult5_pass_y=P[2];
				 
				 
			 }
			 if(adultPaxCount==6)
			 {
				 adult_6_firstname=pax.FirstName;
				 adult_6_lastname=pax.LastName;
				 adult_6_Title=pax.Title;
				 adult_6_nation= pax.Nationality;
				 adult_6_IC= pax.IssuingCountryName;
				 adult6_doc_Number=pax.DocumentNumber;
				 adult6_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult6_dof_d=S[0];
				  adult6_dof_m=S[1];
				  adult6_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  adult6_pass_d=P[0];
				  adult6_pass_m=P[1];
				  adult6_pass_y=P[2];
				 
				 
			 }
			 if(adultPaxCount==7)
			 {
				 adult_7_firstname=pax.FirstName;
				 adult_7_lastname=pax.LastName;
				 adult_7_Title=pax.Title;
				 adult_7_nation= pax.Nationality;
				 adult_7_IC= pax.IssuingCountryName;
				 adult7_doc_Number=pax.DocumentNumber;
				 adult7_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult7_dof_d=S[0];
				  adult7_dof_m=S[1];
				  adult7_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  adult7_pass_d=P[0];
				  adult7_pass_m=P[1];
				  adult7_pass_y=P[2];
				 
				 
			 }
			 if(adultPaxCount==8)
			 {
				 adult_8_firstname=pax.FirstName;
				 adult_8_lastname=pax.LastName;
				 adult_8_Title=pax.Title;
				 adult_8_nation= pax.Nationality;
				 adult_8_IC= pax.IssuingCountryName;
				 adult8_doc_Number=pax.DocumentNumber;
				 adult8_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult8_dof_d=S[0];
				  adult8_dof_m=S[1];
				  adult8_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  adult8_pass_d=P[0];
				  adult8_pass_m=P[1];
				  adult8_pass_y=P[2];
				 
				 
			 }
			 if(adultPaxCount==9)
			 {
				 adult_9_firstname=pax.FirstName;
				 adult_9_lastname=pax.LastName;
				 adult_9_Title=pax.Title;
				 adult_9_nation= pax.Nationality;
				 adult_9_IC= pax.IssuingCountryName;
				 adult9_doc_Number=pax.DocumentNumber;
				 adult9_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  adult9_dof_d=S[0];
				  adult9_dof_m=S[1];
				  adult9_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  adult9_pass_d=P[0];
				  adult9_pass_m=P[1];
				  adult9_pass_y=P[2];
				 
				 
			 }
			 
			 adultPaxCount +=1;
		 }
		 else if(pax.PaxType.equals("CHILD")){
			 
			 if(childPaxCount==1)
			 {
				 child_1_firstname=pax.FirstName;
				 child_1_lastname=pax.LastName;
				 child_1_Title=pax.Title;
				 child_1_nation= pax.Nationality;
				 child_1_IC= pax.IssuingCountryName;
				 child1_doc_Number=pax.DocumentNumber;
				 child1_doc_Type=pax.DocumentType;
				 System.out.println("CHILD First Name_"+childPaxCount +": "+ pax.FirstName +"\n" +", Pax Type: " + pax.PaxType);
				 System.out.println("CHILD last Name_"+childPaxCount +": "+ pax.LastName +"\n" +", Pax Type: " + pax.PaxType);
				
				 System.out.println("CHILD First Name_"+adultPaxCount +": "+ pax.DocumentNumber );
				 System.out.println("CHILD First Name_"+adultPaxCount +": "+ pax.DocumentType );
				 System.out.println("CHILD First Name_"+adultPaxCount +": "+ pax.DobStr );
				 String[] S=pax.DobStr.split("-");
				  child1_dof_d=S[0];
				  child1_dof_m=S[1];
				  child1_dof_y=S[2];
				 System.out.println("Adult First Name_"+adultPaxCount +": "+ pax.PassportExpiryDateStr );
				 String[] P=pax.PassportExpiryDateStr.split("-");
				  child1_pass_d=P[0];
				  child1_pass_m=P[1];
				  child1_pass_y=P[2];
				 
				 
				 
			 }
			 if(childPaxCount==2)
			 {
				 child_2_firstname=pax.FirstName;
				 child_2_lastname=pax.LastName;
				 child_2_Title=pax.Title;
				 child_2_nation= pax.Nationality;
				 child_2_IC= pax.IssuingCountryName;
				 child2_doc_Number=pax.DocumentNumber;
				 child2_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  child2_dof_d=S[0];
				  child2_dof_m=S[1];
				  child2_dof_y=S[2];
				  
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  child2_pass_d=P[0];
				  child2_pass_m=P[1];
				  child2_pass_y=P[2];
			 }
			 
			 if(childPaxCount==3)
			 {
				 child_3_firstname=pax.FirstName;
				 child_3_lastname=pax.LastName;
				 child_3_Title=pax.Title;
				 child_3_nation= pax.Nationality;
				 child_3_IC= pax.IssuingCountryName;
				 child3_doc_Number=pax.DocumentNumber;
				 child3_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  child3_dof_d=S[0];
				  child3_dof_m=S[1];
				  child3_dof_y=S[2];
				  
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  child3_pass_d=P[0];
				  child3_pass_m=P[1];
				  child3_pass_y=P[2];
			 }
			 
			 if(childPaxCount==4)
			 {
				 child_4_firstname=pax.FirstName;
				 child_4_lastname=pax.LastName;
				 child_4_Title=pax.Title;
				 child_4_nation= pax.Nationality;
				 child_4_IC= pax.IssuingCountryName;
				 child4_doc_Number=pax.DocumentNumber;
				 child4_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  child4_dof_d=S[0];
				  child4_dof_m=S[1];
				  child4_dof_y=S[2];
				  
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  child4_pass_d=P[0];
				  child4_pass_m=P[1];
				  child4_pass_y=P[2];
			 }
			 
			 if(childPaxCount==5)
			 {
				 child_5_firstname=pax.FirstName;
				 child_5_lastname=pax.LastName;
				 child_5_Title=pax.Title;
				 child_5_nation= pax.Nationality;
				 child_5_IC= pax.IssuingCountryName;
				 child5_doc_Number=pax.DocumentNumber;
				 child5_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  child5_dof_d=S[0];
				  child5_dof_m=S[1];
				  child5_dof_y=S[2];
				  
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  child5_pass_d=P[0];
				  child5_pass_m=P[1];
				  child5_pass_y=P[2];
			 }
			 
			 if(childPaxCount==6)
			 {
				 child_6_firstname=pax.FirstName;
				 child_6_lastname=pax.LastName;
				 child_6_Title=pax.Title;
				 child_6_nation= pax.Nationality;
				 child_6_IC= pax.IssuingCountryName;
				 child6_doc_Number=pax.DocumentNumber;
				 child6_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  child6_dof_d=S[0];
				  child6_dof_m=S[1];
				  child6_dof_y=S[2];
				  
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  child6_pass_d=P[0];
				  child6_pass_m=P[1];
				  child6_pass_y=P[2];
			 }
			 
			 if(childPaxCount==7)
			 {
				 child_7_firstname=pax.FirstName;
				 child_7_lastname=pax.LastName;
				 child_7_Title=pax.Title;
				 child_7_nation= pax.Nationality;
				 child_7_IC= pax.IssuingCountryName;
				 child7_doc_Number=pax.DocumentNumber;
				 child7_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  child7_dof_d=S[0];
				  child7_dof_m=S[1];
				  child7_dof_y=S[2];
				  
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  child7_pass_d=P[0];
				  child7_pass_m=P[1];
				  child7_pass_y=P[2];
			 }
			 
			 if(childPaxCount==8)
			 {
				 child_8_firstname=pax.FirstName;
				 child_8_lastname=pax.LastName;
				 child_8_Title=pax.Title;
				 child_8_nation= pax.Nationality;
				 child_8_IC= pax.IssuingCountryName;
				 child8_doc_Number=pax.DocumentNumber;
				 child8_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  child8_dof_d=S[0];
				  child8_dof_m=S[1];
				  child8_dof_y=S[2];
				  
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  child8_pass_d=P[0];
				  child8_pass_m=P[1];
				  child8_pass_y=P[2];
			 }
			childPaxCount +=1;
		 }
		 else if(pax.PaxType.equals("INFANT")){
			 
			 if(infantPaxCount==1)
			 {
			 infant_1_firstname=pax.FirstName;
			 infant_1_lastname=pax.LastName;
			 infant_1_Title=pax.Title;
			 infant_1_nation= pax.Nationality;
			 infant_1_IC= pax.IssuingCountryName;
			 infant1_doc_Number=pax.DocumentNumber;
			 infant1_doc_Type=pax.DocumentType;
			 System.out.println("INFANT First Name_"+infantPaxCount +": "+ pax.FirstName +"\n" +", Pax Type: " + pax.PaxType);
			  System.out.println("INFANT last Name_"+infantPaxCount +": "+ pax.LastName +"\n" +", Pax Type: " + pax.PaxType);
			
			 System.out.println("INFANT First Name_"+infantPaxCount +": "+ pax.DocumentNumber );
			 System.out.println("INFANT First Name_"+infantPaxCount +": "+ pax.DocumentType );
			 System.out.println("INFANT First Name_"+infantPaxCount +": "+ pax.DobStr );
			 String[] S=pax.DobStr.split("-");
			  infant1_dof_d=S[0];
			  infant1_dof_m=S[1];
			  infant1_dof_y=S[2];
			 System.out.println("INFANT First Name_"+infantPaxCount +": "+ pax.PassportExpiryDateStr );
			 String[] P=pax.PassportExpiryDateStr.split("-");
			  infant1_pass_d=P[0];
			  infant1_pass_m=P[1];
			  infant1_pass_y=P[2];
			 System.out.println("INFANT First Name_"+infantPaxCount +": "+ pax.FirstName +"\n" +", Pax Type: " + pax.PaxType);
			 }
			 
			 if(infantPaxCount==2)
			 {
				 infant_2_firstname=pax.FirstName;
				 infant_2_lastname=pax.LastName;
				 infant_2_Title=pax.Title;
				 infant_2_nation= pax.Nationality;
				 infant_2_IC= pax.IssuingCountryName;
				 infant2_doc_Number=pax.DocumentNumber;
				 infant2_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  infant2_dof_d=S[0];
				  infant2_dof_m=S[1];
				  infant2_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  infant2_pass_d=P[0];
				  infant2_pass_m=P[1];
				  infant2_pass_y=P[2];
			 }
			 
			 if(infantPaxCount==3)
			 {
				 infant_3_firstname=pax.FirstName;
				 infant_3_lastname=pax.LastName;
				 infant_3_Title=pax.Title;
				 infant_3_nation= pax.Nationality;
				 infant_3_IC= pax.IssuingCountryName;
				 infant3_doc_Number=pax.DocumentNumber;
				 infant3_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  infant3_dof_d=S[0];
				  infant3_dof_m=S[1];
				  infant3_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  infant3_pass_d=P[0];
				  infant3_pass_m=P[1];
				  infant3_pass_y=P[2];
			 }
			 
			 if(infantPaxCount==4)
			 {
				 infant_4_firstname=pax.FirstName;
				 infant_4_lastname=pax.LastName;
				 infant_4_Title=pax.Title;
				 infant_4_nation= pax.Nationality;
				 infant_4_IC= pax.IssuingCountryName;
				 infant4_doc_Number=pax.DocumentNumber;
				 infant4_doc_Type=pax.DocumentType;
				 String[] S=pax.DobStr.split("-");
				  infant4_dof_d=S[0];
				  infant4_dof_m=S[1];
				  infant4_dof_y=S[2];
				  String[] P=pax.PassportExpiryDateStr.split("-");
				  infant4_pass_d=P[0];
				  infant4_pass_m=P[1];
				  infant4_pass_y=P[2];
			 }
			 infantPaxCount +=1;
		 }
		 
		 
		
		   
		    } 
	 
	 
	 System.out.println("------------------------------------------------------------------------------------");
	 
	 /*System.out.println(adult_1_firstname);
	 System.out.println(adult_1_lastname);
	 System.out.println(adult_2_firstname);
	 System.out.println(adult_2_lastname);
	 System.out.println(adult_3_firstname);
	 System.out.println(adult_3_lastname);
	 System.out.println(child_1_firstname);
	 System.out.println(child_1_lastname);*/
}

public static void enetCardApi(Database pnrDetails) throws InterruptedException, IOException
{		
	
	if(BrowserContants.ENV.equals("PRD"))
	{
		RestAssured.baseURI =BrowserContants.PRD_API_URL;
	}
	else if(BrowserContants.ENV.equals("STG"))
	{
		RestAssured.baseURI =BrowserContants.STG_API_URL;
	}
	//RestAssured.baseURI ="http://commonrehlat.azurewebsites.net/v1/scraping";
	RequestSpecification request = RestAssured.given();
	request.header("Content-Type", "text/json");
	JSONObject requestParams = new JSONObject();
	requestParams.put("Domain",  pnrDetails.Domain);
	requestParams.put("PnrId",  pnrDetails.PnrId);
	requestParams.put("ProcessId",  ProcessIdValue);
	requestParams.put("Amount",  pnrDetails.Amount);
	request.body(requestParams.toJSONString());
	Response response = request.post("/GetEnettCard");
	System.out.println("Response body: " + response.body().asString());
	String s=response.body().asString();
	//System.out.println(s);
	int statusCode = response.getStatusCode();
	System.out.println("The status code recieved: " + statusCode);
	
	Gson g = new Gson();
	
	CardDetails card = g.fromJson(s, CardDetails.class);
	
			System.out.println(card.VirtualAccountNumber); 
			
	 cardNumber=card.VirtualAccountNumber;
	 expiryMonth=card.ExpiryMonthName;
	 expiryYear=card.ExpiryYear;
	 CVV=card.CardSecurityCode;
	 transactionID=card.VNettTransactionID;
	
	
	
	

	
}

static String cardNumber;
static String CVV;
static String expiryMonth;
static String expiryYear;
static String transactionID;
public static void enterCardDetails(Database pnrDetails,WebDriver driver) throws Exception
{
	PageUtils.isElementLocated(driver, By.id("divSubmitPayment"));
	try{
	enetCardApi(pnrDetails);
	PageUtils.waitForFixedTime(BrowserContants.WAIT_SMALL);
			
			// if ("Credit/Debit
			// Card".equals(flynasPage.select_Card_Type("Credit/Debit
			// Card").getText())) {
			try {

				PageUtils.isElementDisplayed(driver, flynasPage.select_Card_Type("Credit/Debit Card"));
				flynasPage.select_Card_Type("Credit/Debit Card").click();
				PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
				System.out.println("Select Credit/Debit Card");
				PageUtils.isElementVisibil(driver, flynasPage.txt_Card_Number());
				flynasPage.txt_Card_Number().sendKeys(cardNumber);
				System.out.println("Enter Card Number:" + cardNumber);
				PageUtils.isElementVisibil(driver, flynasPage.txt_Holder_Name());
				flynasPage.txt_Holder_Name().sendKeys(adult_1_firstname);
				PageUtils.isElementVisibil(driver, flynasPage.btn_card_month_CD());
				flynasPage.btn_card_month_CD().click();
			} catch (Exception e) {

			}
			try {
				// else if ("Credit
				// Card".equals(flynasPage.select_Card_Type("Credit
				// Card").getText())) {

				PageUtils.isElementDisplayed(driver, flynasPage.select_Card_Type("Credit Card"));
				flynasPage.select_Card_Type("Credit Card").click();
				PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
				System.out.println("Select Credit Card");
				PageUtils.isElementVisibil(driver, flynasPage.txt_Card_Number());
				flynasPage.txt_Card_Number().sendKeys(cardNumber);
				System.out.println("Enter Card Number:" + cardNumber);
				PageUtils.isElementVisibil(driver, flynasPage.txt_Holder_Name());
				flynasPage.txt_Holder_Name().sendKeys(adult_1_firstname);
				PageUtils.isElementVisibil(driver, flynasPage.btn_card_month_C());
				flynasPage.btn_card_month_C().click();
			} catch (Exception e) {

			}
			try {
				// else if ("Credit
				// Card".equals(flynasPage.select_Card_Type_New("Credit
				// Card").getText())) {

				PageUtils.isElementDisplayed(driver, flynasPage.select_Card_Type_New("Credit Card"));
				flynasPage.select_Card_Type_New("Credit Card").click();
				PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
				System.out.println("Select New Credit Card");

				PageUtils.isElementVisibil(driver, flynasPage.txt_Card_Number());
				flynasPage.txt_Card_Number().sendKeys(cardNumber);
				System.out.println("Enter Card Number:" + cardNumber);
				PageUtils.isElementVisibil(driver, flynasPage.txt_Holder_Name());
				flynasPage.txt_Holder_Name().sendKeys(adult_1_firstname);
				PageUtils.isElementVisibil(driver, flynasPage.btn_card_month_C());
				flynasPage.btn_card_month_C().click();
			} catch (Exception e) {

			}

	PageUtils.isElementVisibil(driver, flynasPage.select_card_Month(expiryMonth));
	flynasPage.select_card_Month(expiryMonth).click();
	PageUtils.isElementVisibil(driver, flynasPage.btn_card_year());
	flynasPage.btn_card_year().click();
	PageUtils.isElementVisibil(driver, flynasPage.select_card_year(expiryYear));
	flynasPage.select_card_year(expiryYear).click();
	PageUtils.isElementVisibil(driver,flynasPage.txt_CVV_Number());
	flynasPage.txt_CVV_Number().sendKeys(CVV);
	System.out.println("Enter CVV Number:"+CVV);
	PageUtils.isElementVisibil(driver,flynasPage.btn_Payment_Continue());
	flynasPage.btn_Payment_Continue().click();
	//Thread.sleep(15000);
	PageUtils.getScreenShot(pnrDetails.PnrId,driver);
	
	}
	catch(Exception e)
	{
		PageUtils.getScreenShot(pnrDetails.PnrId,driver);
		passengersDetails.returnStatus_fail(pnrDetails.Domain,pnrDetails.PnrId,"Payment Gateway Error");
		driver.quit();
	}
	GetPnr(driver,pnrDetails);
}
static String PnrId;
public static void GetPnr(WebDriver driver,Database pnrDetails) throws Exception
{
	PageUtils.waitForFixedTime(BrowserContants.WAIT_LONG);
	PageUtils.isElementLocated(driver, By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Share on'])[1]/following::b[1]"));
	PageUtils.isElementVisibil(driver, driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Share on'])[1]/following::b[1]")));
	PageUtils.waitForFixedTime(BrowserContants.WAIT_MEDIUM);
	 PnrId=flynasPage.PNR_get().getText();
	System.out.println("PNR ID:"+PnrId);
	PageUtils.getScreenShot(pnrDetails.PnrId,driver);
	PageUtils.waitForFixedTime(BrowserContants.WAIT_VERY_SMALL);
	
	if(PnrId.isEmpty())
	{
		PnrId=flynasPage.confirmation_text().getText();
		StatusId="-1";
	}
	returnStatus(pnrDetails);
	generateMail(pnrDetails);
}

public static void randomMails() {
	emailId = PageUtils.getMail();
	System.out.println("Get Mail Id:"+emailId);
	
}

public static void returnStatus(Database pnrDetails) throws InterruptedException, IOException
{		
	
	if(BrowserContants.ENV.equals("PRD"))
	{
		RestAssured.baseURI =BrowserContants.PRD_API_URL;
	}
	else if(BrowserContants.ENV.equals("STG"))
	{
		RestAssured.baseURI =BrowserContants.STG_API_URL;
	}
	//RestAssured.baseURI ="http://commonrehlat.azurewebsites.net/v1/scraping";
	RequestSpecification request = RestAssured.given();
	request.header("Content-Type", "text/json");
	JSONObject requestParams = new JSONObject();
	requestParams.put("Domain",  pnrDetails.Domain);
	System.out.println("-------------------------------------------");
	System.out.println("Domain:"+pnrDetails.Domain);
	requestParams.put("PnrId",  pnrDetails.PnrId);
	System.out.println("Booking Id:"+pnrDetails.PnrId);
	requestParams.put("ProcessId",  ProcessIdValue);
	requestParams.put("Status",  StatusId);
	requestParams.put("Remarks",  PnrId);
	System.out.println("Remarks:"+PnrId);
	System.out.println("-------------------------------------------");
	request.body(requestParams.toJSONString());
	Response response = request.post("/UpdatePnrStatus");
	System.out.println("Response body: " + response.body().asString());
	String s=response.body().asString();
	System.out.println(s);
	int statusCode = response.getStatusCode();
	System.out.println("The status code recieved: " + statusCode);
	
}

public static void returnStatus_fail(String domain,String pnrId,String remarks) throws InterruptedException, IOException
{		
	
	if(BrowserContants.ENV.equals("PRD"))
	{
		RestAssured.baseURI =BrowserContants.PRD_API_URL;
	}
	else if(BrowserContants.ENV.equals("STG"))
	{
		RestAssured.baseURI =BrowserContants.STG_API_URL;
	}
	//RestAssured.baseURI ="http://commonrehlat.azurewebsites.net/v1/scraping";
	RequestSpecification request = RestAssured.given();
	request.header("Content-Type", "text/json");
	JSONObject requestParams = new JSONObject();
	requestParams.put("Domain", domain);
	requestParams.put("PnrId",  pnrId);
	requestParams.put("ProcessId",  ProcessIdValue);
	requestParams.put("Status",  "0");
	requestParams.put("Remarks",  remarks);
	request.body(requestParams.toJSONString());
	Response response = request.post("/UpdatePnrStatus");
	System.out.println("Response body: " + response.body().asString());
	String s=response.body().asString();
	System.out.println(s);
	int statusCode = response.getStatusCode();
	System.out.println("The status code recieved: " + statusCode);
	
}

public static void readPnrId(Database pnrDetails) throws InterruptedException, IOException
{		
	
	if(BrowserContants.ENV.equals("PRD"))
	{
		RestAssured.baseURI =BrowserContants.PRD_API_URL;
	}
	else if(BrowserContants.ENV.equals("STG"))
	{
		RestAssured.baseURI =BrowserContants.STG_API_URL;
	}
	//RestAssured.baseURI ="http://commonrehlat.azurewebsites.net/v1/scraping";
	RequestSpecification request = RestAssured.given();
	request.header("Content-Type", "text/json");
	JSONObject requestParams = new JSONObject();
	requestParams.put("Domain",  pnrDetails.Domain);
	requestParams.put("PnrId",  pnrDetails.PnrId);
	requestParams.put("ProcessId",  ProcessIdValue);
	request.body(requestParams.toJSONString());
	Response response = request.post("/SetPnrReadStatus");
	System.out.println("Response body: " + response.body().asString());
	String s=response.body().asString();
	System.out.println(s);
	int statusCode = response.getStatusCode();
	System.out.println("The status code recieved: " + statusCode);
	
	
}

public static void generateMail(Database pnrDetails) throws EmailException
{
	StringBuilder htmlStringBuilder=new StringBuilder();
	
	//Mail sent

	System.out.println("Started");
	 //StringBuilder htmlStringBuilder=new StringBuilder();
	 HtmlEmail email = new HtmlEmail();
	//Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");
	email.setSmtpPort(465);
	System.out.println("1");
	email.setAuthenticator(new DefaultAuthenticator("nagababu.cherukumalli@rehlat.com", "naga@qtselenium"));
	email.setSSLOnConnect(true);
	email.setFrom("naga123.ch@gmail.com");
	
	 Date mDate = new Date();
	 DateFormat date = new SimpleDateFormat("dd-MMMM-yyyy");
	 String Date=date.format(mDate);
	 System.out.println(Date);
		if (Date.equals(pnrDetails.DepartureDate)) {
			email.setSubject(
					"[HIGH PRIORITY] Flynas Booking Using ENETT  " + pnrDetails.Domain + "_" + pnrDetails.PnrId);
		} else {
			email.setSubject("Flynas Booking Using ENETT  " + pnrDetails.Domain + "_" + pnrDetails.PnrId);
		}
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr>Dear Team,</tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr>Flynas transaction completed successful for BookingId <b> "+pnrDetails.PnrId+"</b>  with PNR <b> "+PnrId+"</b>  in <b> "+pnrDetails.Domain+"</b>  domain using enett card with transactionId <b>"+transactionID+"</b> </tr>"));
	email.setHtmlMsg(""+htmlStringBuilder.append("<tr></tr>"));
	
	
	 email.addTo("qateam@rehlat.com");
	 email.addCc("rajendra.purohit@rehlat.com");
	 email.addCc("rajashekar.uppu@rehlat.com");
	 
	 
	 //email.addTo("naga.ch199@gmail.com");
	
	
	System.out.println("2");
	email.send();
	System.out.println("END");
}


}
