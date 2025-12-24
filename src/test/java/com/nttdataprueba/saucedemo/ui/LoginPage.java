package com.nttdataprueba.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("campo usuario").locatedBy("#user-name");
    public static final Target PASSWORD_FIELD = Target.the("campo contraseña").locatedBy("#password");
    public static final Target LOGIN_BUTTON = Target.the("botón login").locatedBy("#login-button");
}