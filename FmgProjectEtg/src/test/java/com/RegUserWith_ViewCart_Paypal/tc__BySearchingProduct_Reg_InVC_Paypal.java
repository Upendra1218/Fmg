

package com.RegUserWith_ViewCart_Paypal;

import com.providio.Scenarios.SearchingProduct;
import com.providio.commonfunctionality.findAStore;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.testcases.baseClass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tc__BySearchingProduct_Reg_InVC_Paypal extends baseClass {
	 
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
			
	    	//paypal checkout form view cart page
	          CheckOutProcessByPayPal paypal= new CheckOutProcessByPayPal();	         
	          paypal.checkoutprocessFromViewCart(); 
	          
	}  else {
        Assert.fail("User not logged in");
    }
 }
}