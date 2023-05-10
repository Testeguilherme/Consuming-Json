package com.api.omdb.omdbAPI;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Titulo {

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Year")
    private Integer year;

    @JsonProperty("Runtime")
    private String runtime;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", runtime='" + runtime + '\'' +
                '}';
    }
}
