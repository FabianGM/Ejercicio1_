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
import org.hamcrest.Matchers;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class CompraStepDefinitions {

    private final Actor fabian = Actor.named("Fabián");

    @Managed(driver = "chrome")
    WebDriver browser;

    @Dado("el usuario accede a SauceDemo")
    public void accederASauceDemo() {
        fabian.can(BrowseTheWeb.with(browser));
        fabian.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }

    @Cuando("inicia sesión con usuario {string} y contraseña {string}")
    public void iniciarSesion(String usuario, String clave) {
        fabian.attemptsTo(Login.withCredentials(usuario, clave));
    }

    @Y("agrega los productos {string} y {string} al carrito")
    public void agregarProductos(String producto1, String producto2) {
        fabian.attemptsTo(AddProducts.toCart(producto1, producto2));
    }

    @Y("completa el proceso de compra con nombre {string}, apellido {string}")
    public void completarCompra(String nombre, String apellido) {
        fabian.attemptsTo(Checkout.withData(nombre, apellido, "170517")); // código postal fijo
    }

    @Entonces("debería ver el mensaje {string}")
    public void verificarMensaje(String mensaje) {
        fabian.should(
                GivenWhenThen.seeThat("El mensaje de confirmación",
                        ConfirmationMessage.displayed(),
                        Matchers.equalTo(mensaje))
        );
    }
}