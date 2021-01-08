package co.bancolombia.reto.automatizacion.stepdefinitions;

import co.bancolombia.reto.automatizacion.models.CreateUserModel;
import co.bancolombia.reto.automatizacion.questions.CreateUserQuestion;
import co.bancolombia.reto.automatizacion.task.CreateUser;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.CoreMatchers;

import java.util.List;

public class CreateUserStepDefinitions {


    @When("^user register account$")
    public void userRegisterAccount(List<CreateUserModel> data) {
        CreateUserModel createUserModel = data.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.withData(createUserModel));

    }

    @Then("^view message of confirmation (.*)$")
    public void viewMessageOfConfirmation(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CreateUserQuestion.withMessage(message), CoreMatchers.equalTo(message)));
    }
}
