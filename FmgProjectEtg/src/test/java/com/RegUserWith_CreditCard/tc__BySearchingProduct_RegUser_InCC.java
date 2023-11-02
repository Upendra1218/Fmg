

package com.RegUserWith_CreditCard;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.PaymentProccess.CreditCardPaymentProcess;
import com.PaymentProccess.MinicartViewCartProcess;
import com.Scenarios.SearchingProduct;

import com.providio.testcases.baseClass;

public class tc__BySearchingProduct_RegUser_InCC extends baseClass {
	 
	SoftAssert softAssert = new SoftAssert();

	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
    public void bySearchingProduct() throws InterruptedException {
		if(isLoggedIn) {
			
		
		     
		     
			
		//searching a product 
			SearchingProduct sp = new SearchingProduct();
			sp.searchingProduct();
		        
	      //checkoutProcess	        
            MinicartViewCartProcess cp = new MinicartViewCartProcess();            
            cp.checkoutprocess();
            
           //payment by credit card
		     CreditCardPaymentProcess cc = new CreditCardPaymentProcess();	     
		     cc.paymentByCreditCard();
		} else {
	        Assert.fail("User not logged in");
	    }
	 
    }
}