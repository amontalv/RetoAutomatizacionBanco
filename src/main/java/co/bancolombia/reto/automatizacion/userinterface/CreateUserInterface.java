package co.bancolombia.reto.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CreateUserInterface {

    public static final Target BTN_CREATE = Target.the("button for creation").locatedBy("//a[@class = 'unauthenticated-nav-bar__sign-up']");

    public static final Target TXT_FIRST_NAME = Target.the("txt first name").locatedBy("//input[@id= 'firstName']");
    public static final Target TXT_LAST_NAME = Target.the("txt Last name").locatedBy("//input[@id= 'lastName']");
    public static final Target TXT_EMAIL = Target.the("txt email").locatedBy("//input[@id= 'email']");
    public static final Target SEL_MONTH = Target.the("sel month").locatedBy("//select[@id= 'birthMonth']");
    public static final Target SEL_DAY = Target.the("sel day").locatedBy("//select[@id= 'birthDay']");
    public static final Target SEL_YEAR = Target.the("sel year").locatedBy("//select[@id= 'birthYear']");
    public static final Target BTN_NEXT = Target.the("btn next").locatedBy("//a[@class= 'btn btn-blue']");
    public static final Target TXT_CITY = Target.the("txt city").locatedBy("//input[@id= 'city']");
    public static final Target TXT_ZONE_POSTAL = Target.the("txt postal").locatedBy("//input[@id= 'zip']");
    public static final Target BTN_NEXT_OPERATION = Target.the("btn next").locatedBy("//a[@class= 'btn btn-blue pull-right']");
    public static final Target TXT_PASSWORD = Target.the("txt password  ").locatedBy("//input[@id= 'password']");
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("txt confirm password").locatedBy("//input[@id= 'confirmPassword']");
    public static final Target BTN_ACCEPT = Target.the("ACCEPT").locatedBy("//span[@class='checkmark signup-consent__checkbox error']");
    public static final Target BTN_COMPLETE = Target.the("btn complete").locatedBy("//a[@class= 'btn btn-blue']");
    public static final Target TXT_CONFIRM_CREATION = Target.the("confirme creation").locatedBy("//strong[contains(.,'{0}')]");
    public static final Target LABEL = Target.the("label").locatedBy("//div[@class = 'pac-item' and contains(.,'Medellin, An')]");




}
