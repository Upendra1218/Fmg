package com.RegUserWith_GiftCard;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.Scenarios.Bundle_GcAndAllPromotions;
import com.providio.commonfunctionality.Gc__CC_Paypal;
import com.providio.commonfunctionality.addtoCartValidation;
import com.providio.commonfunctionality.findAStore;
import com.providio.commonfunctionality.validatingInstock;
import com.providio.pageObjects.BundleProductFromEXcel;
import com.providio.pageObjects.GiftCertificate;
import com.providio.pageObjects.SimpleProductFromExcel;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.testcases.baseClass;

public class tc__Bundle_GcAndAllPromotions_Reg_InGc extends baseClass{
	 
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void bundle_GcAndAllPromotions() throws InterruptedException {
		
		if(isLoggedIn) {   

 			
		// to pick the store
		     findAStore  store = new findAStore();
		     store.findStore();	
		
		//promotions
		Bundle_GcAndAllPromotions bgs = new Bundle_GcAndAllPromotions();
		bgs.bundleGcandallpromotions();
		 
		 //checkoutProcess				        
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
