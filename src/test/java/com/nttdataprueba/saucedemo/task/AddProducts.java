package com.nttdataprueba.saucedemo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {

    private final String producto1;
    private final String producto2;

    public AddProducts(String producto1, String producto2) {
        this.producto1 = producto1;
        this.producto2 = producto2;
    }

    public static AddProducts toCart(String producto1, String producto2) {
        return instrumented(AddProducts.class, producto1, producto2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(By.xpath("//div[text()='" + producto1 + "']/ancestor::div[@class='inventory_item']//button")),
                Click.on(By.xpath("//div[text()='" + producto2 + "']/ancestor::div[@class='inventory_item']//button"))
        );
    }
}