package co.bancolombia.reto.automatizacion.task;

import co.bancolombia.reto.automatizacion.interactions.SelectDate;
import co.bancolombia.reto.automatizacion.interactions.SelectTermins;
import co.bancolombia.reto.automatizacion.interactions.TextCity;
import co.bancolombia.reto.automatizacion.models.CreateUserModel;
import co.bancolombia.reto.automatizacion.userinterface.CreateUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CreateUser implements Task {

    private CreateUserModel createUserModel;

    public CreateUser(CreateUserModel createUserModel) {
        this.createUserModel = createUserModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CreateUserInterface.BTN_CREATE),
                Enter.theValue(createUserModel.getFirstName()).into(CreateUserInterface.TXT_FIRST_NAME),
                Enter.theValue(createUserModel.getLastName()).into(CreateUserInterface.TXT_LAST_NAME),
                Enter.theValue(createUserModel.getEmail()).into(CreateUserInterface.TXT_EMAIL));
        actor.attemptsTo(SelectDate.withDate(createUserModel.getDateBirth()),
                Click.on(CreateUserInterface.BTN_NEXT),
                TextCity.withCity(createUserModel.getCity()),
                Enter.theValue(createUserModel.getCodePostal()).into(CreateUserInterface.TXT_ZONE_POSTAL),
                Click.on(CreateUserInterface.BTN_NEXT_OPERATION),
                Click.on(CreateUserInterface.BTN_NEXT_OPERATION),
                Enter.theValue(createUserModel.getPassword()).into(CreateUserInterface.TXT_PASSWORD),
                Enter.theValue(createUserModel.getConfirmPassword()).into(CreateUserInterface.TXT_CONFIRM_PASSWORD),
                SelectTermins.withTerm(),
                Click.on(CreateUserInterface.BTN_COMPLETE));
    }

    public static CreateUser withData(CreateUserModel createUserModel){
        return Tasks.instrumented(CreateUser.class,createUserModel);
    }
}
