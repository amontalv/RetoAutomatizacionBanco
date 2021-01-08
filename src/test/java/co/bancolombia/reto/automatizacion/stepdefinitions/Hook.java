package co.bancolombia.reto.automatizacion.stepdefinitions;

import co.bancolombia.reto.automatizacion.userinterface.General;
import co.bancolombia.reto.automatizacion.utils.Constantes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class Hook {

    @Managed(driver = "chrome")
    private WebDriver webdriver;

    @Before
    public static void inicializar(){
        OnStage.setTheStage(new OnlineCast());
        theActor(Constantes.ACTOR_DEFAULT);
    }

    @Given("^(.*) enter in the application$")
    public void userEnterInTheApplication(String actor) {
        theActor(actor).attemptsTo(Open.browserOn(new General()));
    }
}
