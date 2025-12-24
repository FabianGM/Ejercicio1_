package com.nttdataprueba.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutCompletePage {
    public static final Target CONFIRMATION_MESSAGE = Target.the("mensaje de confirmación")
            .locatedBy(".complete-header");
}