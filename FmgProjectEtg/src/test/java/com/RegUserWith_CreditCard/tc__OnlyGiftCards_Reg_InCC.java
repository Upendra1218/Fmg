package com.RegUserWith_CreditCard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.Scenarios.giftCard;
import com.providio.pageObjects.GiftCertificate;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.testcases.baseClass;

public class tc__OnlyGiftCards_Reg_InCC extends baseClass{
	int minicartCountValue ;
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void OnlyGiftCards() throws InterruptedException {
		if(isLoggedIn) {     
		 
			//adding GC into cart
		    giftCard gc = new giftCard();
		    gc.giftCards();
			 
			
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
