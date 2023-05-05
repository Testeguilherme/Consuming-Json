package com.api.omdb.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public record TituloRecord(String title, Integer year, String runtime) {


}
