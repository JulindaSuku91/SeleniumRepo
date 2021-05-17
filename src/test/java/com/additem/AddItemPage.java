package com.additem;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.basepage.BasePage;
import com.basepage.HelperMethods;



public class AddItemPage extends BasePage {

    public String addInput = "//*[@placeholder='What needs to be done?']";
    public String  titleText= "todoapp";
	private String existingItem="todo-count";



    AddItemPage() {
        PageFactory.initElements(driver, this);
    }

    HelperMethods helperMethod=new HelperMethods();
    

	public void navigateToUrl(String url) {
		try {
		driver.get(url);		
		}
		catch(Exception e) {
        e.printStackTrace();
        Assert.fail("Page is not load correctly");
		}
	}

	public void pageIsLoad() {
		wait.forPresenceOfElements(8000,By.className(titleText),"header");
		WebElement title=driver.findElement(By.className(titleText));
		Assert.assertNotNull(title);
				
	}

	public void checkTextBox() {
		WebElement addInputField=driver.findElement(By.xpath(addInput));
		Assert.assertNotNull(addInputField);		
	}

	public void enterNewContent(String content) {
		WebElement addInputField=driver.findElement(By.xpath(addInput));
        addInputField.sendKeys(content);
        addInputField.sendKeys(Keys.ENTER);
        
        
		
	}



	public void checkAdd() {
		helperMethod.hasExistingItems(existingItem);
				
	}

	public void checkFalseAdd() {

		try {
			int countBefore=helperMethod.saveItemsBeforeOperation(existingItem);
			int countAfter=helperMethod.retriveItemsAfterOperation(existingItem);
			Assert.assertTrue(countAfter==countBefore);
		} catch (Exception e) {
						e.printStackTrace();
		}
	}

	public void checkList() {
    boolean result= helperMethod.isElementPresent(existingItem);
		 
		 Assert.assertFalse(result);
		
	}
}

