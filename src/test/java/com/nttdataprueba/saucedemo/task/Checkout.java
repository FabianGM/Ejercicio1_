package com.nttdataprueba.saucedemo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Checkout implements Task {

    private final String nombre;
    private final String apellido;
    private final String codigoPostal;

    public Checkout(String nombre, String apellido, String codigoPostal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }

    public static Checkout withData(String nombre, String apellido, String codigoPostal) {
        return instrumented(Checkout.class, nombre, apellido, codigoPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(By.id("shopping_cart_container")),
                Click.on(By.id("checkout")),
                Enter.theValue(nombre).into(By.id("first-name")),
                Enter.theValue(apellido).into(By.id("last-name")),
                Enter.theValue(codigoPostal).into(By.id("postal-code")),
                Click.on(By.id("continue")),
                Click.on(By.id("finish"))
        );
    }
}