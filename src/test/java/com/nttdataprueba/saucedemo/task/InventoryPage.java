package com.nttdataprueba.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage {

    // Botón para agregar un producto específico al carrito
    public static Target PRODUCT(String nombre) {
        return Target.the("producto " + nombre)
                .locatedBy("//div[text()='" + nombre + "']/ancestor::div[@class='inventory_item']//button");
    }

    // Botón para ir al carrito
    public static final Target CART_BUTTON = Target.the("botón carrito")
            .locatedBy(".shopping_cart_link");
}