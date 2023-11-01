package com.RegUserWith_GiftCard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.Scenarios.giftCard;
import com.providio.commonfunctionality.Gc__CC_Paypal;
import com.providio.pageObjects.GiftCertificate;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.testcases.baseClass;

public class tc__OnlyGiftCards_Reg_InGc extends baseClass{
	int minicartCountValue ;
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void OnlyGiftCards() throws InterruptedException {
		if(isLoggedIn) {     
		 
			 //adding GC into cart
			     giftCard gcs = new giftCard();
			     gcs.giftCards();
					 
				 MinicartViewCartProcess cp = new MinicartViewCartProcess();				     
			     cp.checkoutprocess();
			     
			   //gc payment 
			     Gc__CC_Paypal gc = new Gc__CC_Paypal ();
			     gc.paymentByGiftCard();
		}else {
		   	 Assert.fail("User not logged in");
		   }
	}
}
