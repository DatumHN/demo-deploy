/*
 * Copyright 2016-2017 Red Hat, Inc, and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datum.example.test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

import com.datum.example.pojo.Greeting;

public abstract class AbstractExampleApplicationTest {

    private static final String GREETING_PATH = "api/greeting";
    private static final String PRUEBA_PATH = "api/prueba?sumando1=22&sumando2=5";

    @Test
    public void testGreetingEndpoint() {
        given()
           .baseUri(baseURI())
           .get(GREETING_PATH)
           .then()
           .statusCode(200)
           .body("content", is(String.format(Greeting.FORMAT, "World")));
    }

    @Test
    public void testGreetingEndpointWithNameParameter() {
        given()
           .baseUri(baseURI())
           .param("name", "John")
           .when()
           .get(GREETING_PATH)
           .then()
           .statusCode(200)
           .body("content", is(String.format(Greeting.FORMAT, "John")));
    }
    
    @Test
    public void testPruebaEndpointWithNameParameter() {
        given()
           .baseUri(baseURI())
           .when()
           .get(PRUEBA_PATH)
           .then()
           .statusCode(200)
           .body("suma", is(27));
    }
    
    protected abstract String baseURI();
}
