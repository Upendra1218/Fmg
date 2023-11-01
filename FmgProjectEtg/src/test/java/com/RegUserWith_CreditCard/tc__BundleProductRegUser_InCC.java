package com.RegUserWith_CreditCard;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.providio.Scenarios.BundleProduct;
import com.providio.commonfunctionality.findAStore;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.testcases.baseClass;


public class tc__BundleProductRegUser_InCC extends baseClass{
	SoftAssert softAssert = new SoftAssert();
	  
    //@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
    @Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void bundleProduct() throws InterruptedException {
		
	if(isLoggedIn) {
		
		   
	  // to pick the store
	     findAStore  store = new findAStore();
	     store.findStore();
	     
		 //searching the bundle product from excel sheet
	     BundleProduct bp = new BundleProduct();
	     bp.bundleproduct();
	 
	     
	 	 //common checkout process
         MinicartViewCartProcess cp = new MinicartViewCartProcess();        
         cp.checkoutprocess();
         
         //payment process             
	     CreditCardPaymentProcess cc = new CreditCardPaymentProcess();		     
	     cc.paymentByCreditCard();

	 } else {
	        Assert.fail("User not logged in");
	    }
	 }
}

