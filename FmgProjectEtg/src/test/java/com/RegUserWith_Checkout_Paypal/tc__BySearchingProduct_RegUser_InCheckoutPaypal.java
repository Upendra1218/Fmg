

package com.RegUserWith_Checkout_Paypal;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.providio.Scenarios.SearchingProduct;
import com.providio.commonfunctionality.findAStore;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.testcases.baseClass;

public class tc__BySearchingProduct_RegUser_InCheckoutPaypal extends baseClass {
	 
	SoftAssert softAssert = new SoftAssert();

	@Test(dependsOnMethods = {"com.providio.login.tc__Login.loginTest"}, alwaysRun = true)
    public void bySearchingProduct() throws InterruptedException {

		if(isLoggedIn) {      

			// to pick the store
			     findAStore  store = new findAStore();
			     store.findStore();
			     
		      //searching a product 
				SearchingProduct sp = new SearchingProduct();
				sp.searchingProduct();
				
				    
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