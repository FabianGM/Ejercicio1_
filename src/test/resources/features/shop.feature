# language: es
Característica: Flujo de compra en SauceDemo

  @happyPath
  Esquema del escenario: Proceso de compra exitoso

  # Autenticarse y agregar productos
    Dado el usuario accede a SauceDemo
    Cuando inicia sesión con usuario <usuario> y contraseña <clave>
    Y agrega los productos <producto1> y <producto2> al carrito
    Y completa el proceso de compra con nombre <nombre>, apellido <apellido> y código <codigo>
    Entonces debería ver el mensaje <mensaje>

    Ejemplos:
      | usuario       | clave         | producto1             | producto2              | nombre  | apellido | codigo  | mensaje                  |
      | standard_user | secret_sauce  | Sauce Labs Backpack   | Sauce Labs Bike Light  | Fabián  | Garrido  | 170517  | THANK YOU FOR YOUR ORDER |