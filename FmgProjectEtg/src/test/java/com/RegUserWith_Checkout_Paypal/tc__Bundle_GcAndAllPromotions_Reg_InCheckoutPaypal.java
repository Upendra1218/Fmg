package com.RegUserWith_Checkout_Paypal;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.Scenarios.Bundle_GcAndAllPromotions;
import com.providio.commonfunctionality.addtoCartValidation;
import com.providio.commonfunctionality.allAttributesinOneFile;
import com.providio.commonfunctionality.findAStore;
import com.providio.commonfunctionality.validatingInstock;
import com.providio.pageObjects.BundleProductFromEXcel;
import com.providio.pageObjects.GiftCertificate;
import com.providio.pageObjects.SimpleProductFromExcel;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.testcases.baseClass;

public class tc__Bundle_GcAndAllPromotions_Reg_InCheckoutPaypal extends baseClass{
	 
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void bundle_GcAndAllPromotions() throws InterruptedException {
		
		if(isLoggedIn) {   
		 			
		// to pick the store
		     findAStore  store = new findAStore();
		     store.findStore();	
		     
		//pramotions
			Bundle_GcAndAllPromotions bgs = new Bundle_GcAndAllPromotions();
			bgs.bundleGcandallpromotions();
		 
		 //checkoutProcess				        
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
