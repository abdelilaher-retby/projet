package org.example;
import java.util.ArrayList;
import java.util.Collection;


public class Banque {
    private int id;
    private String pays;
    private Collection<Compte> comptes;

    //Constructeur
    public Banque( int id, String pays) {
        this.id = id;
        this.pays = pays;
        this.comptes = new ArrayList<>();
    }

    //Getters and Setters


    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(Collection<Compte> comptes) {
        this.comptes = comptes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Banque {\n" +
                "  id: " + id + "\n" +
                "  pays: '" + pays + "'\n" +
                "}";
    }

}
