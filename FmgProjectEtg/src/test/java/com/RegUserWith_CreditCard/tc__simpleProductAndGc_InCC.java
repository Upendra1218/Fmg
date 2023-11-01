package com.RegUserWith_CreditCard;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.Scenarios.SimpleProductAndGc;
import com.providio.commonfunctionality.findAStore;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.testcases.baseClass;

public class tc__simpleProductAndGc_InCC extends baseClass {
	
	  
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void simpleProduct_Gc() throws InterruptedException {
		
		if(isLoggedIn) {			
		
			// to pick the store
		     findAStore  store = new findAStore();
		     store.findStore();
		     
			//simple proudct
			SimpleProductAndGc spGc = new SimpleProductAndGc();
			spGc.simpleProductAndGc();
			 
			 //checkoutProcess				        
		     MinicartViewCartProcess cp = new MinicartViewCartProcess();				     
		     cp.checkoutprocess();
		     
		     //credit card
		     CreditCardPaymentProcess cc = new CreditCardPaymentProcess();			     
		     cc.paymentByCreditCard();
	 } else {
        Assert.fail("User not logged in");
    }
 }
	
}
