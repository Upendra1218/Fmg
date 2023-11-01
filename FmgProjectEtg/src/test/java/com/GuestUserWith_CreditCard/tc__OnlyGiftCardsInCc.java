package com.GuestUserWith_CreditCard;

import org.testng.annotations.Test;

import com.providio.Scenarios.giftCard;
import com.providio.launchingbrowser.launchBrowsering;
import com.providio.pageObjects.GiftCertificate;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.paymentProccess.CheckOutProcessByPayPal;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.testcases.baseClass;

public class tc__OnlyGiftCardsInCc extends baseClass{
	int minicartCountValue ;
	@Test
	public void OnlyGiftCards() throws InterruptedException {
		
		//launching the browser and passing the url into it
		launchBrowsering lb = new launchBrowsering();
		lb.chromeBrowser();
		 
		 //adding GC into cart
	    giftCard gc = new giftCard();
	    gc.giftCards();
		
		 //checkoutProcess
		 MinicartViewCartProcess cp = new MinicartViewCartProcess();				     
	     cp.checkoutprocess();
			     
	     //Payment process		     
	     CreditCardPaymentProcess cc = new CreditCardPaymentProcess();			     
	     cc.paymentByCreditCard();
	}
}
