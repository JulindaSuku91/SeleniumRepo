package com.additem;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class AddItemPageSteps {

    private AddItemPage addItemPage;

    public AddItemPageSteps() {
        this.addItemPage = new AddItemPage();
    }

   

	@Given("^I navigate to \"([^\"]*)\"$")
	public void iNavigateTo(String url) throws Throwable {
		addItemPage.navigateToUrl(url);
	}

	@Then("^Requested Page is open with success$")
	public void requestedPageIsOpenWithSuccess() throws Throwable {
        addItemPage.pageIsLoad();
	}

	@And("^I can find field to enter items$")
	public void iCanFindFieldToEnterItems() throws Throwable {
        addItemPage.checkTextBox();
}

	@When("^I enter \"([^\"]*)\"$")
	public void iEnter(String content) throws Throwable {
		addItemPage.enterNewContent(content);
	}

	@Then("^I should see new my first item saved in list$")
	public void iShouldSeeNewMyFirstItemSavedInList() throws Throwable {
      addItemPage.checkAdd();
	}



	@Then("^I should not see this new item saved in list$")
	public void iShouldNotSeeThisNewItemSavedInList() throws Throwable {
      addItemPage.checkFalseAdd();
	}



	@And("^Any item on list view$")
	public void anyItemOnListView() throws Throwable {
		addItemPage.checkList();	}

	
}
