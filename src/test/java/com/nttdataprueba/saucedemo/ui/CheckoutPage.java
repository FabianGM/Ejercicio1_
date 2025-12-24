package com.nttdataprueba.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage {
    public static final Target FIRST_NAME = Target.the("nombre").locatedBy("#first-name");
    public static final Target LAST_NAME = Target.the("apellido").locatedBy("#last-name");
    public static final Target POSTAL_CODE = Target.the("código postal").locatedBy("#postal-code");
    public static final Target CONTINUE_BUTTON = Target.the("botón continuar").locatedBy("#continue");
    public static final Target FINISH_BUTTON = Target.the("botón finalizar").locatedBy("#finish");
}