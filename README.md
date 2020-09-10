# spring-boot-employees

Proyecto de SpringBoot para la comparación de palabras.

## Instalación/Despliegue

Se descarga el proyecto desde GitHub y después se realiza el siguiente comando en la carpeta principal del proyecto
```
mvn clean install

mvn spring-boot:run
```

# Descripción del proyecto

Elaborar un servicio de tipo REST, que recibe como parámetros 2 palabras y retorna un boolean dependiendo los siguientes escenarios: 
- Las palabras deben estar conformadas por las mismas letras y su longitud debe ser la misma. 
- Sensible a mayusulas minusculas
- El orden de los caracteres no es relevante. 
**E.G** 
**Escenario 0:** String: army String: mary Response: True Escena
**Escenario 1:** String: Army String: mary Response: False 
**Escenario 2:** String: Mary String: lary Response: False 
**Escenario 3:** String: test String: lary Response: False 
**Escenario 4:** String: testtest String: mary Response: False 

# Desarrollado en

* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - The Java IDE
* [Maven](https://maven.apache.org/) - Dependency Management
* Java 11 JDK
