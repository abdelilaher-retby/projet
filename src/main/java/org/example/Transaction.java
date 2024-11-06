package org.example;
import java.time.LocalDateTime;

final public class Transaction {
    public enum Type {
        VIRIN, // Transaction entre 2 clients de la même banque
        VIREST, // Transaction entre 2 clients dans le même pays
        VIRMULTA, // Transaction entre 2 clients de la même banque mais pays différents
        VIRCHA // Transaction entre 2 clients de banques différentes et pays différents
    }

    private Type type;
    private LocalDateTime timeStamp;
    private String reference;
    private Compte compteSource;
    private Compte compteDestination;

    //Constructeur
    public Transaction(Compte compteDestination, Compte compteSource, String reference, Type type) {
        this.compteDestination = compteDestination;
        this.compteSource = compteSource;
        this.reference = reference;
        this.timeStamp = LocalDateTime.now(); // Génère automatiquement la date et l'heure actuelles
        this.type = type;
    }

    //Getters and Setters


    public Compte getCompteDestination() {
        return compteDestination;
    }

    public void setCompteDestination(Compte compteDestination) {
        this.compteDestination = compteDestination;
    }

    public Compte getCompteSource() {
        return compteSource;
    }

    public void setCompteSource(Compte compteSource) {
        this.compteSource = compteSource;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
