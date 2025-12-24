package com.nttdataprueba.saucedemo.stepdefinitions;

import com.nttdataprueba.saucedemo.questions.ConfirmationMessage;
import com.nttdataprueba.saucedemo.task.AddProducts;
import com.nttdataprueba.saucedemo.task.Checkout;
import com.nttdataprueba.saucedemo.task.Login;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class CompraStepDefinitions {

    private final Actor fabian = Actor.named("Fabián");

    @Managed(driver = "chrome")
    WebDriver browser;

    // ===================== GIVEN =====================

    @Dado("^el usuario accede a SauceDemo$")
    public void accederASauceDemo() {
        fabian.can(BrowseTheWeb.with(browser));
        fabian.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }

    // ===================== WHEN =====================

    @Cuando("^inicia sesión con usuario (.*) y contraseña (.*)$")
    public void iniciarSesion(String usuario, String clave) {
        fabian.attemptsTo(
                Login.withCredentials(usuario, clave)
        );
    }

    @Y("^agrega los productos (.*) y (.*) al carrito$")
    public void agregarProductos(String producto1, String producto2) {
        fabian.attemptsTo(
                AddProducts.toCart(producto1, producto2)
        );
    }

    @Y("^completa el proceso de compra con nombre (.*), apellido (.*) y código (.*)$")
    public void completarCompra(String nombre, String apellido, String codigo) {
        fabian.attemptsTo(
                Checkout.withData(nombre, apellido, codigo)
        );
    }

    // ===================== THEN =====================

    @Entonces("^debería ver el mensaje (.*)$")
    public void verificarMensaje(String mensaje) {
        fabian.should(
                GivenWhenThen.seeThat(
                        ConfirmationMessage.displayed(),
                        Matchers.containsStringIgnoringCase(mensaje)
                )
        );
    }
}
