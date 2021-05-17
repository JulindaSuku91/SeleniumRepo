package com.deleteitem;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteItemPageSteps {
	private DeleteItemPage deleteItemPage;

    public DeleteItemPageSteps() {
        this.deleteItemPage = new DeleteItemPage();
    }
    
   

	@And("^I click on Item$")
	public void iClickOnItem()  {
        deleteItemPage.clickElement();
	}



	@When("^I click on x option$")
	public void iClickOnXOption() throws Throwable {
        deleteItemPage.clickDeleteOption(); 
	}



	@Then("^Item is deleted$")
	public void itemIsDeleted() throws Throwable {
        deleteItemPage.checkIsDeleted();
	}

}
