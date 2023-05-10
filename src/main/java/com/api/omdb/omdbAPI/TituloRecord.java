package com.api.omdb.omdbAPI;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public record TituloRecord(String title, Integer year, String runtime) {


}
