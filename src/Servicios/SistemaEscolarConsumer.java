/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.io.IOException;
import java.net.HttpURLConnection;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.net.URL;
import javax.ws.rs.core.HttpHeaders;

public class SistemaEscolarConsumer {
    private WebTarget webTarget;
    private Client client;
    public static final String BASE_URI = "http://localhost:8080/APIREGISTROESCOLAR/webresources/persistencia.calificacion";

    public SistemaEscolarConsumer() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget= client.target(BASE_URI);
    }

    public void enviarCalificacion(Object requestEntity) throws ClientErrorException, IOException {
        System.out.println("gucci gang");
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON));
                System.out.println(webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_JSON).header(HttpHeaders.AUTHORIZATION, "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJub2xvc2VyaWNrcGFyZWNlZmFsc28iLCJpYXQiOjE2MjE0NjUyNDIsImV4cCI6MTYyMTQ2NjE0MiwiZW1haWwiOiJwZXNjYWRvZmVsaXpAZ21haWwuY29tIn0.D1ehQSajW0IYXx6h8k_yDOswRsUvOLvq0eE-qPpEVGM").post(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_JSON)).getStatus());

        System.out.println("cocainiiiiii");
    }
    
    
    public void close() {
        client.close();
    }

}