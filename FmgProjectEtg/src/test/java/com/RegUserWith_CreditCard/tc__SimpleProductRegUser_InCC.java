package com.RegUserWith_CreditCard;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.providio.Scenarios.SimpleProduct;
import com.providio.commonfunctionality.findAStore;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.paymentProccess.MiniCartCheckoutButton;
import com.providio.testcases.baseClass;


public class tc__SimpleProductRegUser_InCC extends baseClass{
	SoftAssert softAssert = new SoftAssert();

	 @Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void simpleProduct() throws InterruptedException {
		 
		 
	if(isLoggedIn) {
		
			// to pick the store
		     findAStore  store = new findAStore();
		     store.findStore();
		     
			//simple product
		    SimpleProduct sp = new SimpleProduct();
		    sp.simpleProdcut();
	        
	        //checkoutProcess
			MiniCartCheckoutButton cp = new MiniCartCheckoutButton();        
	        cp.checkoutprocess();
	
	        //payment process
		     CreditCardPaymentProcess cc = new CreditCardPaymentProcess();	     
		     cc.paymentByCreditCard();
		     
	        }else {
	        Assert.fail("User not logged in");
	    }
	 }
}

