package org.example;

import com.google.gson.Gson;

public class CompteConverter {

    // Méthode pour convertir un objet Compte en JSON
    public String toJson(Compte compte) {
        Gson gson = new Gson();
        return gson.toJson(compte);
    }

    // Méthode pour convertir un JSON en objet Compte
    public Compte fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Compte.class);
    }


    }

