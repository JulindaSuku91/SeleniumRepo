package com.deleteall;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAllItemsPageSteps {
	
	DeleteAllItemsPage allItemPage= new DeleteAllItemsPage();

	@When("^I click on delete all option$")
	public void iClickOnDeleteAllOption() throws Throwable {
		
		allItemPage.clickDeleteAll();
	}

	@Then("^All Items are deleted$")
	public void allItemsAreDeleted() throws Throwable {
		allItemPage.checkAllItemsDeleted();
	}

	@And("^I select Items to delete$")
	public void iSelectItemsToDelete() throws Throwable {
		allItemPage.selectAllItems();
	}

	@When("^I dont select Items to delete$")
	public void iDontSelectItemsToDelete() throws Throwable {
		allItemPage.unCheckItems();
	}

	@Then("^Clear all option should not be displayed$")
	public void clearAllOptionShouldNotBeDisplayed() throws Throwable {
        allItemPage.checkElementDisplay();
	}

}
