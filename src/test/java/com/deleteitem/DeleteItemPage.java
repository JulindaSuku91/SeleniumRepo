package com.deleteitem;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.basepage.BasePage;
import com.basepage.HelperMethods;
import com.entities.Items;

public class DeleteItemPage extends BasePage {

	private String elementItem = "toggle";
	private String optionDelete = "destroy";
	private String existingItem = "todo-count";

	DeleteItemPage() {
		PageFactory.initElements(driver, this);
	}

	Items items = new Items();
	HelperMethods helperMethods = new HelperMethods();

	public void clickElement() {
		Actions action = new Actions(driver);

		WebElement element = driver.findElement(By.className(elementItem));
		action.moveToElement(element);

	}

	public void clickDeleteOption() {
		// Keep number of existing item before operation delete
		WebElement elContent = driver.findElement(By.className(existingItem));
		String str = elContent.getText();
		int count = HelperMethods.findNumbers(str);
		items.setNumberItems(count);

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.className(elementItem));
		action.moveToElement(we).moveToElement(driver.findElement(By.className(optionDelete))).click().build()
				.perform();

	}

// Make sure after the completing the delete operation the item is not visible anymore
	public void checkIsDeleted() {

		if (helperMethods.isElementPresent(existingItem)) {

			WebElement elContent = driver.findElement(By.className(existingItem));

			String str = elContent.getText();
			int afterDeleteCount = HelperMethods.findNumbers(str);
			int beforeDeleteCount = items.getNumberItems();
			Assert.assertTrue(afterDeleteCount < beforeDeleteCount);
		}

	}

}
