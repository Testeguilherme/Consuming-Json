package com.api.omdb.omdbAPI;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TituloJackson {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ObjectMapper objectMapper = new ObjectMapper();
        URL RT = new URL("https://www.omdbapi.com/?t=matrix&apikey=bc06dd").toURI().toURL();
        Titulo titulo = objectMapper.readValue(RT, Titulo.class);
        System.out.println(titulo);
    }
}
