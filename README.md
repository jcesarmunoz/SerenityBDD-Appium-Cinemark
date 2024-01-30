# README

Pruebas automatizadas en dispositivos moviles usando la herramienta SerenityBDD con Screenplay

> **Soporta automatización**:
> * Movil

## Herramientas y Complementos

|                                                                               **IntelliJ**                                                                                |                                                              **Java**                                                               |                                                         **Gradle**                                                         |
|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|:-----------------------------------------------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------:|
| [<img width="50" height="50" src="https://cdn.iconscout.com/icon/free/png-128/intellij-idea-569199.png">](https://www.jetbrains.com/es-es/idea/download/#section=windows) | [<img height="60" src="https://www.oracle.com/a/ocom/img/cb71-java-logo.png">](https://www.oracle.com/java/technologies/downloads/) | [<img height="50" src="https://gradle.org/images/gradle-knowledge-graph-logo.png?20170228">](https://gradle.org/releases/) |

> **NOTA**:

> * Para ejecutar el proyecto se recomienda minimo las siguientes versiones:
>   * IntelliJ Community Edition 2021
>   * Java JDK 17
>   * Gradle 7.4
> * Una vez obtenido IntelliJ es necesario instalar los plugins de Gherkin y Cucumber for Java. (
    *[Guia de instalación plugins en intellij](https://www.jetbrains.com/help/idea/managing-plugins.html)*)

## Ejecución local

Clonar el proyecto en github

```bash
  git clone 
```

Para correr el proyecto de manera local se debe realizar los siguientes pasos:

Definir la tag de los tipos del test que se va a ejecutar, ejecutar en la consola el siguiente comando

### Ejecucion de todo el projecto

```bash
gradle -Dtags="RegisterAndPurchase"
```

### Ejecucion de escenario Registro en cinemark

```bash
gradle -Dtags="Register"
```

### Ejecucion de escenario Login en cinemark

```bash
gradle -Dtags="Login"
```

### Ejecucion de escenario compra de boletas cinemark

```bash
gradle -Dtags="Purchase"
```

## Construido con

La automatización fue desarrollada con:

* BDD - Estrategia de desarrollo
* Screenplay
* Gradle - Manejador de dependencias
* Cucumber - Framework para automatizar pruebas BDD
* Serenity BDD - Biblioteca de código abierto para la generación de reportes
* Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

## Documentacion

[Manual SerenityBDD](https://serenity-bdd.info/docs/serenity/)

### Elaborado por:

Julio Cesar Muñoz Merchan