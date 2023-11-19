# Weather API



### This project provides an API to get the weather information of the given city for the next 48 hours 

* Application exposes the endpoint: `/v1/api/weather/{city}`
* There are validations for the `{city}` path variable, if the given city name is blank, numeric or shorter than 3 characters a `400 - Bad Request` response will be received.
* If a city with the given name does not exist, `404 - Not Found` response will be received.

## Docker

Please execute the following command to build and run the application with `Docker`;

```sh
$ docker-compose up
```

You can reach the swagger-ui via `http://localhost:9090/swagger-ui.html`

---
## Maven

Please execute the following commands to build and run the application with `Maven`;

```sh
$ mvn clean install
$ mvn spring-boot:run
```
You can reach the swagger-ui via `http://localhost:8080/swagger-ui.html`

---