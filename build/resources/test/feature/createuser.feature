Feature: create user for application

  Scenario Outline: create user with all information

    Given user enter in the application
    When user register account
      | firstName   | lastName   | email   | dateBirth   | city   | codePostal   | mobile   | model   | operationSystem   | password   | confirmPassword   |
      | <firstName> | <lastName> | <email> | <dateBirth> | <city> | <codePostal> | <mobile> | <model> | <operationSystem> | <password> | <confirmPassword> |
    Then view message of confirmation Participate in the uTest Academy

    Examples:
      | firstName | lastName      | email             | dateBirth    | city     | codePostal | password         | confirmPassword  |
      | Alejandro | Montalvo Cano | Pruebasdsdfdf@prueba465465.com | April-3-1994 | Medellín | 00054      | Colombia201906*4 | Colombia201906*4 |
