package com.nttdata.steps;

import net.serenitybdd.rest.SerenityRest;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CrearOrden {
    private static String CREATE_ORDER = "https://petstore.swagger.io/v2/store/order";

    public void crearOrden(int id, int petId, int quantity, String shipDate, String status) {
        SerenityRest.given()
                .contentType("application/json")
                .relaxedHTTPSValidation()
                .body("{\n" +
                        "    \"id\": \"" + id + "\",\n" +
                        "    \"petId\": \"" + petId + "\",\n" +
                        "    \"quantity\": \"" + quantity + "\",\n" +
                        "    \"shipDate\": \"" + shipDate + "\",\n" +
                        "    \"status\": \"" + status + "\",\n" +
                        "    \"complete\": \"" + true+ "\"\n" +
                        "}")
                .log().all()
                .post(CREATE_ORDER)
                .then()
                .log().all()
        ;
    }

    public void validarCodigoRespuesta(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    public void validarTipo(String type) {
        restAssuredThat(response -> response.body("'type'", equalTo(type)));
        System.out.println("Type: " + SerenityRest.lastResponse().body().path("type").toString());
        System.out.println(SerenityRest.lastResponse().print());
    }
}
