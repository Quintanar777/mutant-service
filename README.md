
# Meli Service

Este proyecto expone un API que expone los endpoits:

- /mutant POST
- /stats GET

## Tecnologias utlizadas

- Maven
- Spring Boot 2.7.2
- Java 11

### Dependencias
- spring-boot-starter-data-jpa
- spring-boot-starter-web
- h2
- lombok
- meli-mutant
- mockito-core
- mockito-junit-jupiter


## Endpoint /mutant

Este enpoint valida si un ADN enviado, corresponde a un mutante

#### Request body:

```json
{
    "adn": [
        "ATGCGA",
        "CAGTGC",
        "TTATGT",
        "AGAAGG",
        "CCCCTA",
        "TCACTG"
    ]
}
```

#### HTTP Method

POST

#### Respuesta

- HTTP Status 200: Cuando si es mutante
- HTTP Status 403: Cuadno no es mutante
- HTTP Status 400: Error al enviar datos de entrada

## Endpoint /stats

Este endpoint regresa las estadisticas de los mutantes verificados en el API

#### HTTP Method

GET

#### Respuesta
- HTTP Status 200

```json
{
    "count_mutant_dna": 4,
    "count_human_dna": 0,
    "ratio": 0.0
}
```

## Ejecutar localmente

Linea de comandos:

`mvn clean package`

`java -jar -Dspring.profiles.active=LOCAL ./target/mutant-service-0.0.1-SNAPSHOT.jar`


O se podría usar un IDE, como IntelliJ Idea, Eclipse, etc

Así mismo la aplicacion esta dockerizada, se puede construir la imagen de docker y ejecutarla
