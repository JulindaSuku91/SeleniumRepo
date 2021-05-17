package com.basepage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.entities.Items;

public class HelperMethods extends BasePage {
	Items item = new Items();

	public static int findNumbers(String content) {
		Pattern p = Pattern.compile("\\d+");
		int result = 0;
		Matcher m = p.matcher(content);
		while (m.find()) {
			result = Integer.parseInt((m.group()));
		}
		return result;
	}

	public void hasExistingItems(String locator) {
		try {
//Find Element
			WebElement elContent = driver.findElement(By.className(locator));
//Get Text
			String str = elContent.getText();
//Get Number with regex			
			int count = HelperMethods.findNumbers(str);
//Validate

			if (count > 1 || count == 1) {
				System.out.println("Found one item");
			} else {
				Assert.fail("No items found to modify");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			Assert.fail("Item was not found");
		}

	}

	public int saveItemsBeforeOperation(String locator) throws Exception {
		int count;
		WebElement elContent = driver.findElement(By.className(locator));
		String str = elContent.getText();
		count = findNumbers(str);
		item.setNumberItems(count);
		return count;
	}

	public int retriveItemsAfterOperation(String locator) throws Exception {
		int afterDeleteCount;
		WebElement elContent = driver.findElement(By.className(locator));

		String str = elContent.getText();
		afterDeleteCount = findNumbers(str);
		return afterDeleteCount;
	}

	public boolean isElementPresent(String locator) {
		boolean isPresent = false;
		try {
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

			if (driver.findElements(By.xpath(locator)).size() > 0) {
				// Since, no exception, so element is present
				driver.findElements(By.xpath(locator)).get(0).click();
				isPresent = true;
				System.out.println("Element present");
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			}

		} catch (NoSuchElementException e) {
			// Element is not present
			System.out.println("Element not present");
		}
		return isPresent;

	}

}
