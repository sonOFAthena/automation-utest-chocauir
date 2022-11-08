package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.User;
import model.Welcome;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.SignUp;

import java.util.List;

public class uTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Bob wants to register to the website$")
    public void bobWantsToRegisterToTheWebsite() {
        OnStage.theActorCalled("Bob").wasAbleTo(OpenUp.thePage());
    }

    @When("^he does the registration$")
    public void heDoesTheRegistration(List<User> users) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage(users.get(0).getStrName(), users.get(0).getStrLastName(), users.get(0).getStrEmail(), users.get(0).getStrBirthDate(), users.get(0).getStrLanguage(), users.get(0).getStrCountry(), users.get(0).getStrCity(),users.get(0).getStrCityDetail() ,users.get(0).getStrZipCode(), users.get(0).getStrCellphone(), users.get(0).getStrModelPhone(), users.get(0).getStrSystem(), users.get(0).getStrPassword()));
    }

    @Then("^he gets the registration confirmation message$")
    public void heGetsTheRegistrationConfirmationMessage(List<Welcome> messages) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(messages.get(0).getStrRegister())));
    }
}
