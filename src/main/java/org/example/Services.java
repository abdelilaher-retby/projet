package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Services {
    // Collections pour stocker les comptes, clients et banques
    private static Collection<Compte> comptes = new ArrayList<>();
    private static Collection<Client> clients = new ArrayList<>();
    private static Collection<Banque> banques = new ArrayList<>();

    // ====================================================================================
    // Créer un compte
    // ====================================================================================
    public static Compte creerCompte(Client client, Banque banque, String devise) {
        Compte compte = new Compte(banque, devise, client);
        comptes.add(compte);
        client.getComptes().add(compte);
        banque.getComptes().add(compte);
        return compte;
    }

    // =================================================================================
    // Effectuer une transaction entre deux comptes
    // =================================================================================
    public static Transaction effectuerTransaction(Compte compteSource, Compte compteDestination, String reference) {
        Transaction.Type type;

        // Vérifier si les comptes sont dans la même banque
        if (compteSource.getBanque().getId() == compteDestination.getBanque().getId()) {
            // Vérifier si les comptes sont dans le même pays
            if (compteSource.getBanque().getPays().equals(compteDestination.getBanque().getPays())) {
                type = Transaction.Type.VIRIN;  // Même banque et même pays
            } else {
                type = Transaction.Type.VIRMULTA; // Même banque mais pays différents
            }
        } else {
            // Vérifier si les comptes sont dans des banques et pays différents
            if (!compteSource.getBanque().getPays().equals(compteDestination.getBanque().getPays())) {
                type = Transaction.Type.VIRCHA; // Banques et pays différents
            } else {
                type = Transaction.Type.VIREST; // Banques différentes mais même pays
            }
        }

        // Créer la transaction et l'ajouter aux comptes concernés
        Transaction transaction = new Transaction(compteSource, compteDestination, reference, type);
        compteSource.getTransactions().add(transaction);
        compteDestination.getTransactions().add(transaction);
        return transaction;
    }

    // =================================================================================
    // Ajouter un nouveau client
    // =================================================================================
    public static Client ajouterClient(String nom, String adresse, String email, String phone, String prenom) {
        Client client = new Client(nom, adresse, email, phone, prenom);
        clients.add(client);
        return client;
    }

    // Récupérer tous les clients (optionnel pour la vérification)
    public static Collection<Client> getClients() {
        return clients;
    }

    // ================================================================================
    // Ajouter une nouvelle banque
    // ================================================================================
    public static Banque ajouterBanque(int id, String pays) {
        Banque banque = new Banque(id, pays);
        banques.add(banque);
        return banque;
    }

    // Récupérer toutes les banques (optionnel pour la vérification)
    public static Collection<Banque> getBanques() {
        return banques;
    }
}
