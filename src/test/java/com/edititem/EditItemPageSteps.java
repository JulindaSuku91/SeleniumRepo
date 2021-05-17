package com.edititem;

import org.openqa.selenium.support.PageFactory;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditItemPageSteps {
	

	 private EditItemPage editItemPage;

	    public EditItemPageSteps() {
	        this.editItemPage = new EditItemPage();
	    }
	
	@Given("^I navigate to url \"([^\"]*)\"$")
	public void iNavigateToUrl(String url) {
		editItemPage.navigateToUrl(url);
	}

	@And("^I have an item created before$")
	public void iHaveAnItemCreatedBefore() throws Throwable {
       editItemPage.existingItems();	}

	@When("^I double click to item$")
	public void iDoubleClickToItem() throws Throwable {
       editItemPage.doubleClicks();
	 }

	@And("^I change content$")
	public void iChangeContent() throws Throwable {
        editItemPage.changeContent();
	}

	@Then("^Item has changed$")
	public void itemHasChanged() throws Throwable {
         editItemPage.checkChangeIsDone();
	}

	@And("^I change content to empty \"([^\"]*)\"$")
	public void iChangeContentToEmpty(String arg1) throws Throwable {
         editItemPage.addEmptyContent();
	}

	@Then("^Item should not be displayed on list anymore$")
	public void itemShouldNotBeDisplayedOnListAnymore() throws Throwable {
		editItemPage.checkIsIpdate();
	}

}
