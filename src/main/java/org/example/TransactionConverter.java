package org.example;

import com.google.gson.Gson;

public class TransactionConverter {
    // Méthode pour convertir un objet Transaction en JSON
    public String toJson(Transaction transaction) {
        Gson gson = new Gson();
        String json = gson.toJson(transaction);
        return json;
    }

    // Méthode pour créer un objet Transaction à partir d'une chaîne JSON
    public Transaction fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Transaction.class);
    }
}
