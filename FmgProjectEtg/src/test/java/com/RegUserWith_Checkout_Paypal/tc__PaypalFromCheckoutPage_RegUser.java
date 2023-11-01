package com.RegUserWith_Checkout_Paypal;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.commonfunctionality.findAStore;
import com.providio.commonfunctionality.navigationProccess;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.testcases.baseClass;

public class tc__PaypalFromCheckoutPage_RegUser extends baseClass {
	int  minicartCountValue=0;
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void paypalFromCheckoutPage() throws InterruptedException {
	
		if(isLoggedIn) {      

 			
		 // to pick the store
		     findAStore  store = new findAStore();
		     store.findStore();
		
		  //selects a random catgory and product add to cart
	          navigationProccess navProccess = new navigationProccess();
	          navProccess.commonNavigationProccess();
	          
	        
		  //common checkoutProcess	         
			 MinicartViewCartProcess cp = new MinicartViewCartProcess();         
			 cp.checkoutprocess();
	         
		 //paypal process from checkout page
			 CheckOutProcessByPayPal cpp = new CheckOutProcessByPayPal();
			 cpp.checkoutprocessFromCheckout();
     
	    }else {
	   	 Assert.fail("User not logged in");
	   }
	}
}
