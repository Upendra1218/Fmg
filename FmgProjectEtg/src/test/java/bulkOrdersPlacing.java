import org.testng.annotations.Test;

import com.providio.launchingbrowser.launchBrowsering;
import com.providio.pageObjects.navigationProcess;
import com.providio.pageObjects.productListingPage;
import com.providio.paymentProccess.CreditCardPaymentProcess;
import com.providio.paymentProccess.MinicartViewCartProcess;
import com.providio.testcases.baseClass;

public class bulkOrdersPlacing extends baseClass{


	@Test(invocationCount = 5)
    public void guestlogin() throws InterruptedException {
    	
    	//launching the browser and passing the url into it
		launchBrowsering lb = new launchBrowsering();
		lb.chromeBrowser();
		
		//selects a random catgory and product add to cart
		navigationProcess navProccess = new navigationProcess(driver);
        navProccess.selectRandomMenu(driver);
        
        //click add to cart button
        productListingPage plp = new productListingPage(driver);
        plp.addToCartFromPlp();
        
    	
        //check out process
	     MinicartViewCartProcess cp = new MinicartViewCartProcess();			     
	     cp.checkoutprocess();
	    
	     //Payment process		     
	     CreditCardPaymentProcess cc = new CreditCardPaymentProcess();			     
	     cc.paymentByCreditCard();
	     
	     Thread.sleep(3000);
		}
    
}
