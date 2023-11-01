package com.RegUserWith_Checkout_Paypal;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.providio.Scenarios.BundleProduct;
import com.providio.commonfunctionality.addtoCartValidation;
import com.providio.commonfunctionality.validatingInstock;
import com.providio.pageObjects.BundleProductFromEXcel;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.testcases.baseClass;

public class tc__BundleProductForRegUser_InCheckoutPaypal  extends baseClass{
	 
	SoftAssert softAssert = new SoftAssert();

	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
		public void bundleProduct() throws InterruptedException {
		if(isLoggedIn) {      

			 //searching the bundle product from excel sheet
			    BundleProduct bp = new BundleProduct();
			    bp.bundleproduct();
	      
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
