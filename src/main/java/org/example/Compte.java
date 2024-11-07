package org.example;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Compte {
    private String numCompte;
    private LocalDateTime dateCrea;
    private LocalDateTime dateUpdate;
    private String devise;
    private Client proprietaire;
    private Banque banque;
    private Collection<Transaction> transactions;

    //constructeur
    public Compte(Banque banque, String devise, Client proprietaire) {
        this.banque = banque;
        this.dateCrea = LocalDateTime.now();  // Date de création automatique
        this.dateUpdate = this.dateCrea;      // Initialisation de la date de mise à jour à la date de création
        this.devise = devise;
        this.numCompte = generateNumCompte(); // Numéro de compte automatique
        this.proprietaire = proprietaire;
        this.transactions = new ArrayList<>();
    }


    // Méthode pour générer un numéro de compte unique
    private String generateNumCompte() {
        return "ACCT-" + UUID.randomUUID().toString().substring(0, 8);  // Par exemple : "ACCT-1234ABCD"
    }


    //Getters and Setters


    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public LocalDateTime getDateCrea() {
        return dateCrea;
    }

    public void setDateCrea(LocalDateTime dateCrea) {
        this.dateCrea = dateCrea;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    public Collection<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(Collection<Transaction> transactions) {
        transactions = transactions;
    }

    public String toString() {
        return "{\n" +
                "  banque: " + banque + "\n" +
                "  numCompte: " + numCompte + "\n" +
                "  dateCrea: " + dateCrea + "\n" +
                "  dateUpdate: " + dateUpdate + "\n" +
                "  devise: " + devise + "\n" +
                "  proprietaire: " + proprietaire + "\n" +
                "transactions :"+transactions +
                "}";
    }

}
