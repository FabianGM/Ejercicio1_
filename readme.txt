Ejercicio de Automatización UI - SauceDemo con Serenity BDD
===========================================================

Tecnologías y versiones:
- JDK 11
- Gradle 8.14
- Serenity BDD 3.9.8
- Cucumber JVM 7.14.0
- Selenium 4.21.0
- JUnit 4.13.2
- Sistema operativo: Windows 10/11

Prerrequisitos:
1. Instalar JDK 11 y configurar JAVA_HOME.
2. Instalar Gradle y verificar con "gradle -v".
3. Instalar Git para clonar y subir repositorio.
4. Tener Google Chrome actualizado y chromedriver en el PATH.

Pasos de ejecución:
1. Clonar el repositorio: git clone https://github.com/<usuario>/saucedemo-serenity.git
2. Entrar a la carpeta: cd saucedemo-serenity
3. Ejecutar pruebas: gradlew clean test
4. Revisar reportes:
   - target/site/serenity/index.html

Casos cubiertos:
- Inicio de sesión en SauceDemo.
- Agregar productos al carrito.
- Completar el proceso de compra.
- Validar mensaje de confirmación.
- Escenario adicional: login inválido.