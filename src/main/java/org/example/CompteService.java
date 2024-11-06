package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class CompteService {
    private static Collection<Compte> comptes = new ArrayList<>();

    public static Compte creerCompte(Client client, Banque banque, String devise) {
        Compte compte = new Compte(banque, devise,  client);
        comptes.add(compte);
        client.getComptes().add(compte);
        banque.getComptes().add(compte);

        return compte ;
    }
}
