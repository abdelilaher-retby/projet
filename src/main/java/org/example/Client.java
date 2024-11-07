package org.example;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Client {
    private String numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String phone;
    private String email;
    private  Collection<Compte> comptes;

    //Constructeur
    public Client(String nom, String adresse, String email, String phone, String prenom) {
        this.numClient = generateNumClient(); // Génération automatique d'un numéro unique
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.phone = phone;
        this.prenom = prenom;
        this.comptes = new ArrayList<>();
    }

    // Méthode pour générer un numéro de client unique
    private String generateNumClient() {
        return "CLT-" + UUID.randomUUID().toString().substring(0, 8);  // Par exemple : "CLT-1234ABCD"
    }


    //Getters and Setters


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "{ " +
                "  adresse: " + adresse + " " +
                "  numClient: " + numClient + " " +
                "  nom: " + nom + " " +
                "  prenom: " + prenom + " " +
                "  phone: " + phone + " " +
                "  email: " + email + " " +
                "}";
    }

}
