package org.example;


import com.google.gson.Gson;

public class ClientConverter {

    // Méthode pour convertir un objet Client en JSON
    public String toJson(Client client) {
        Gson gson = new Gson();
        String json = gson.toJson(client);
        return json;
    }

    // Méthode pour créer un objet Client à partir d'une chaîne JSON
    public Client fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Client.class);
    }
}