package com.deleteall;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.basepage.BasePage;
import com.basepage.HelperMethods;

import junit.framework.Assert;

public class DeleteAllItemsPage extends BasePage {

	
	private String toggelClassName="toggle";
	private String clearAllClassName="clear-completed";
	private String existingItemClassName = "todo-count";
	
	HelperMethods helperMethods = new HelperMethods();

	
	public void clickDeleteAll() {
	WebElement clearOption=driver.findElement(By.className(clearAllClassName));
	clearOption.click();
		
	}

	public void checkAllItemsDeleted() {

		Assert.assertFalse(helperMethods.isElementPresent(existingItemClassName) );
	}

	public void selectAllItems() {

		List<WebElement> allItems=driver.findElements(By.className(toggelClassName));
		for(WebElement el:allItems) {
			el.click();
		}
	}

	public void unCheckItems() {

		System.out.println("I will not check any item");
	}

	public void checkElementDisplay() {

	 boolean result= helperMethods.isElementPresent(clearAllClassName);
	 
	 Assert.assertFalse(result);
	}

}
