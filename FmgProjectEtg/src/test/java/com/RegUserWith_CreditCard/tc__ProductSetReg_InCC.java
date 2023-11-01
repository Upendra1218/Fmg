package com.RegUserWith_CreditCard;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.providio.Scenarios.ProductSet;
import com.providio.commonfunctionality.addtoCartValidation;
import com.providio.commonfunctionality.validatingInstock;
import com.providio.pageObjects.ProductSetFromExcel;
  
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.testcases.baseClass;


public class tc__ProductSetReg_InCC extends baseClass{
	SoftAssert softAssert = new SoftAssert();
	 

	 @Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void productSet() throws InterruptedException {
		 
		 if(isLoggedIn) {
			 
			//product set		
				ProductSet  set = new ProductSet ();
				set.productSet();
				
			  //checkoutProcess		        
		        MinicartViewCartProcess cp = new MinicartViewCartProcess();	         
		        cp.checkoutprocess();
		        
		       //payment process             
			     CreditCardPaymentProcess cc = new CreditCardPaymentProcess();		     
			     cc.paymentByCreditCard();
		        

	    
		 }else {
		        Assert.fail("User not logged in");
		    }
		}
}

