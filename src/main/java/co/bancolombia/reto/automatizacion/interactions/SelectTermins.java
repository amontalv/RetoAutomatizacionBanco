package co.bancolombia.reto.automatizacion.interactions;

import co.bancolombia.reto.automatizacion.userinterface.CreateUserInterface;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

public class SelectTermins implements Interaction {

    public static SelectTermins withTerm(){
        return Tasks.instrumented(SelectTermins.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listElement = CreateUserInterface.BTN_ACCEPT.resolveAllFor(actor);
        for (int i=0;i<listElement.size();i++){
            actor.attemptsTo(Click.on(listElement.get(i)));
        }
    }
}
