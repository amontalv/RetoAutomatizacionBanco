package co.bancolombia.reto.automatizacion.interactions;

import co.bancolombia.reto.automatizacion.userinterface.CreateUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class TextCity implements Interaction {

    private String city;

    public TextCity(String city) {
        this.city = city;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitInteraction.waitClass(10000),Enter.theValue(city).into(CreateUserInterface.TXT_CITY),
                Click.on(CreateUserInterface.LABEL));
    }

    public static TextCity withCity(String city){
        return Tasks.instrumented(TextCity.class,city);
    }
}
