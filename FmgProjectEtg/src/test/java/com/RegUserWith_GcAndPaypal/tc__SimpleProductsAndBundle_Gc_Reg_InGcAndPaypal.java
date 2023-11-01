package com.RegUserWith_GcAndPaypal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.Scenarios.SimpleProductsAndBundle_Gc;
import com.providio.commonfunctionality.Gc__CC_Paypal;
import com.providio.commonfunctionality.addtoCartValidation;
import com.providio.commonfunctionality.findAStore;
import com.providio.commonfunctionality.validatingInstock;
import com.providio.pageObjects.BundleProductFromEXcel;
import com.providio.pageObjects.GiftCertificate;
import com.providio.pageObjects.SimpleProductFromExcel;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.testcases.baseClass;

public class tc__SimpleProductsAndBundle_Gc_Reg_InGcAndPaypal extends baseClass {
	 
	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
	public void simpleProducts_Bundle_Gc() throws InterruptedException {
		

		if(isLoggedIn) {      
			
		// to pick the store
		     findAStore  store = new findAStore();
		     store.findStore();
			
		//adding simple product into cart
	          SimpleProductsAndBundle_Gc spb = new SimpleProductsAndBundle_Gc();
	          spb.simpleProductsAndBundle_Gc();
	          
	      //checkoutProcess				        
		     MinicartViewCartProcess cp = new MinicartViewCartProcess();				     
		     cp.checkoutprocess();
		     
		  //gc and paypal
			  Gc__CC_Paypal gcAndPaypal = new Gc__CC_Paypal();
			  gcAndPaypal.paymentProccessByGCandPaypal();
		 
		 }else {
		   	 Assert.fail("User not logged in");
		   }
  }
}
