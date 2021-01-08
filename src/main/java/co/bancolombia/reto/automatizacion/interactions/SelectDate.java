package co.bancolombia.reto.automatizacion.interactions;

import co.bancolombia.reto.automatizacion.userinterface.CreateUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class SelectDate implements Interaction {

    private String date;

    public SelectDate(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] convertDate = date.split("-");
        actor.attemptsTo(SelectFromOptions.byVisibleText(convertDate[0]).from(CreateUserInterface.SEL_MONTH));
        actor.attemptsTo(SelectFromOptions.byVisibleText(convertDate[1]).from(CreateUserInterface.SEL_DAY));
        actor.attemptsTo(SelectFromOptions.byVisibleText(convertDate[2]).from(CreateUserInterface.SEL_YEAR));
    }

    public static SelectDate withDate(String date){
        return Tasks.instrumented(SelectDate.class,date);
    }
}
