package com.RegUserWith_ViewCart_Paypal;

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

public class tc__OnlyGiftCards_Reg_InVC_Paypal extends baseClass{
	int minicartCountValue ;
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void OnlyGiftCards() throws InterruptedException {
		if(isLoggedIn) {     
		 
			//adding GC into cart
			     giftCard gc = new giftCard();
			     gc.giftCards();
				 
	    	 //paypal checkout form view cart page
		          CheckOutProcessByPayPal paypal= new CheckOutProcessByPayPal();	         
		          paypal.checkoutprocessFromViewCart();
	          
		}else {
		   	 Assert.fail("User not logged in");
		   }
	}
}
