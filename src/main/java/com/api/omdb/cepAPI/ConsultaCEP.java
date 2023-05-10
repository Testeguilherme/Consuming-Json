package com.api.omdb.cepAPI;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class ConsultaCEP {

    public static void main(String[] args) throws IOException, URISyntaxException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CEP: ");
        String cep = scanner.nextLine();

        ObjectMapper objectMapper = new ObjectMapper();
        URL RT = new URL("https://viacep.com.br/ws/" + cep + "/json/").toURI().toURL();
        Adress adress = objectMapper.readValue(RT, Adress.class);
        System.out.println(adress);

        String path = "/app/json/companies.json";

        try {
            objectMapper.writeValue(new File("./test.json"), adress);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
