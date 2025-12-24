package com.nttdataprueba.saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.By;

public class ConfirmationMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(By.cssSelector(".complete-header")).answeredBy(actor);
    }

    public static Question<String> displayed() {
        return new ConfirmationMessage();
    }
}