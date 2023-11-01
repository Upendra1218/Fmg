package com.RegUserWith_GcAndCC;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.commonfunctionality.Gc__CC_Paypal;
import com.providio.commonfunctionality.findAStore;
import com.providio.commonfunctionality.navigationProccess;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.testcases.baseClass;

public class tc__OrderByGCandCC_RegUser extends baseClass {
	 
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void paypalFromCheckoutPage() throws InterruptedException {	

			// enters into url
		  if(isLoggedIn) {      
	    	 	
			// to pick the store
			     findAStore  store = new findAStore();
			     store.findStore();
			     
			// selects a random catgory and product add to cart
				navigationProccess navProccess = new navigationProccess();
				navProccess.commonNavigationProccess();
        
		    //common checkoutProcess	         
				MinicartViewCartProcess cp = new MinicartViewCartProcess();         
				cp.checkoutprocess();
				
			//semi gc and cc 
				Gc__CC_Paypal gCandCC = new Gc__CC_Paypal();
				gCandCC.paymentProccessByGCandCC(driver);
			     
		    }else {
		    	 Assert.fail("User not logged in");
		    }
	}
}
