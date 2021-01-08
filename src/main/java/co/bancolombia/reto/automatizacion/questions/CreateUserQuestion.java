package co.bancolombia.reto.automatizacion.questions;

import co.bancolombia.reto.automatizacion.userinterface.CreateUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CreateUserQuestion implements Question<String> {

    private String message;

    public CreateUserQuestion(String message) {
        this.message = message;
    }

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(CreateUserInterface.TXT_CONFIRM_CREATION.of(message)).viewedBy(actor).asString();
    }

    public static CreateUserQuestion withMessage(String message){
        return new CreateUserQuestion(message);
    }
}
