package com.edititem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.basepage.BasePage;
import com.basepage.HelperMethods;

public class EditItemPage extends BasePage {
	
    public String  titleText= "todoapp";
	private String countItems="todo-count";
	private String existingItem="//*[@class='view']/label";
	private static String newContent="New Content";
	
	EditItemPage() {
        PageFactory.initElements(driver, this);
    }
	HelperMethods helperMethods = new HelperMethods();

	public void navigateToUrl(String url) {
		try {
			driver.get(url);		
			}
			catch(Exception e) {
	        e.printStackTrace();
	        Assert.fail("Page is not load correctly");
			}
					
	}

	public void existingItems() {
		try {
			wait.forPresenceOfElements(8000,By.className(titleText),"header");
			
			helperMethods.hasExistingItems(countItems);
		    }
			 
			
			catch(Exception e) {
	        e.printStackTrace();
	        Assert.fail("Item was not found");
			}
		
	}

	public void doubleClicks() {
		
	}

	public void changeContent() {
		Actions actions = new Actions(driver);
		WebElement elementLocator = (driver.findElements(By.xpath(existingItem))).get(0);
		
		actions.doubleClick(elementLocator).click().sendKeys(newContent).sendKeys(Keys.ENTER).perform();
	}

	public void checkChangeIsDone() {
		WebElement elementLocator = (driver.findElements(By.xpath(existingItem))).get(0);
		String content=elementLocator.getAttribute("innerText");
		assertEquals(content,newContent);
		

	}

	public void addEmptyContent() {
		Actions actions = new Actions(driver);
		WebElement elementLocator = (driver.findElements(By.xpath(existingItem))).get(0);
		
		actions.doubleClick(elementLocator).click().sendKeys(" ").sendKeys(Keys.ENTER).perform();
		
	}

	public void checkIsIpdate() {
		
		 boolean result= helperMethods.isElementPresent(existingItem);
		 
		 Assert.assertFalse(result);

		
	}



}
