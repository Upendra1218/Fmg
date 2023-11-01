

package com.GuestUserWith_CreditCard;

import com.providio.Scenarios.SearchingProduct;
import com.providio.Scenarios.SimpleProduct;
import com.providio.commonfunctionality.addtoCartValidation;
import com.providio.commonfunctionality.findAStore;
import com.providio.launchingbrowser.launchBrowsering;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.paymentProccess.MiniCartCheckoutButton;
import com.providio.testcases.baseClass;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tc__BySearchingProduct_GuestUser_InCC extends baseClass {
	 
	SoftAssert softAssert = new SoftAssert();

	@Test//(dependsOnMethods = {"com.providio.testcases.tc__LoginSc.verifySuccessfulLogin"}, alwaysRun = true)
    public void bySearchingProduct() throws InterruptedException {
		
		//launching the browser and passing the url into it
		launchBrowsering lb = new launchBrowsering();
		lb.chromeBrowser();
			
		// to pick the store
	     findAStore  store = new findAStore();
	     store.findStore();
		
        //searching a product 		
		SearchingProduct sp1 = new SearchingProduct();
		sp1.searchingProduct();

		//simple product
	    SimpleProduct sp = new SimpleProduct();
	    sp.simpleProdcut();  
		
		
	   //validating the product is add to the cart
       //addtoCartValidation.validatingProductisAddtoCart(driver);
	        
       //checkoutProcess	        
		MiniCartCheckoutButton cp = new MiniCartCheckoutButton();            
        cp.checkoutprocess();
        
        //payment by credit card
	     CreditCardPaymentProcess cc = new CreditCardPaymentProcess();	     
	     cc.paymentByCreditCard();
    }
}