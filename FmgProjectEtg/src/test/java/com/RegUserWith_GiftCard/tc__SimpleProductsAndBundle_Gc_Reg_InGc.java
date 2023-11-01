package com.RegUserWith_GiftCard;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.providio.Scenarios.SimpleProductsAndBundle_Gc;
import com.providio.commonfunctionality.Gc__CC_Paypal;
import com.providio.commonfunctionality.findAStore;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.testcases.baseClass;

public class tc__SimpleProductsAndBundle_Gc_Reg_InGc extends baseClass {
	 
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
			     
			 //gc payment 
			     Gc__CC_Paypal gc = new Gc__CC_Paypal ();
			     gc.paymentByGiftCard();
		 
		 }else {
		   	 Assert.fail("User not logged in");
		   }
  }
}
