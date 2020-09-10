# spring-boot-letters

Proyecto de SpringBoot para la comparación de palabras.

## Vista previa Heroku

**Si no se desea descargar el proyecto y hacer la compilación/ejecución localmente se puede consumir este servicio mediante la plataforma PaaS Heroku:**

```
compareLetters (POST) - https://avv-letters.herokuapp.com/letters/v1/letter

compareLetters Request Body example (True response):
{
    "firstString": "army",
    "secondString": "mary"
}

compareLetters Request Body example (False response):
{
    "firstString": "Army",
    "secondString": "Mary"
}
```

**NOTA:** Para el primer consumo del servicio se debe esperar aproximadamente 30 segundos, ya que Heroku apaga automáticamente todos los recursos que no estén en uso.

## Instalación/Despliegue

Se descarga el proyecto desde GitHub y después se realiza el siguiente comando en la carpeta principal del proyecto
```
mvn clean install

mvn spring-boot:run
```
Link de los diferentes servicios resultantes:
```
compareLetters (POST) - http://localhost:8080/letters/v1/letter

compareLetters Request Body example (True response):
{
    "firstString": "army",
    "secondString": "mary"
}

compareLetters Request Body example (False response):
{
    "firstString": "Army",
    "secondString": "Mary"
}
```

# Descripción del proyecto

Elaborar un servicio de tipo REST, que recibe como parámetros 2 palabras y retorna un boolean dependiendo los siguientes escenarios: 
- Las palabras deben estar conformadas por las mismas letras y su longitud debe ser la misma. 
- Sensible a mayusulas minusculas
- El orden de los caracteres no es relevante. 

**E.G** 
- **Escenario 0:** String: army String: mary Response: True Escena
- **Escenario 1:** String: Army String: mary Response: False 
- **Escenario 2:** String: Mary String: lary Response: False 
- **Escenario 3:** String: test String: lary Response: False 
- **Escenario 4:** String: testtest String: mary Response: False 

# Desarrollado en

* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - The Java IDE
* [Maven](https://maven.apache.org/) - Dependency Management
* Java 11 JDK
