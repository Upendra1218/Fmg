package com.providio.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.providio.Scenarios.menuSelction;
import com.providio.testcases.baseClass;

public class navigationProcess extends baseClass {
    WebDriver lDriver;

    public navigationProcess(WebDriver rDriver) {
        lDriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

 
    public void selectRandomMenu(WebDriver driver) throws InterruptedException {
    	
    		menuSelction.menusss();
    	
        }
        

        
    }
    
    

