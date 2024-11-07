package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                // Ajouter une banque
                Banque cih = Services.ajouterBanque(12, "maroc");
                Banque cih1 = Services.ajouterBanque(12, "france");
                Banque bmce = Services.ajouterBanque(15, "tunisie");

                // Ajouter un client
                Client cl1 = Services.ajouterClient("er-retby", "tlouh", "abdelilaherretby@gmail.com", "0655443322", "abdelilah");
                Client cl2 = Services.ajouterClient("sayed", "ben geurir", "ahmedsayed@gmail.com", "0665444422", "ahmed");

                // Créer un compte
                Compte cpt1 = Services.creerCompte(cl1, cih1, "MAD");
                Compte cpt2 = Services.creerCompte(cl2, cih, "MAD");

                // Effectuer une transaction entre deux comptes
                Transaction tr1 = Services.effectuerTransaction(cpt1, cpt2, "geneve");
                Transaction tr2 = Services.effectuerTransaction(cpt1, cpt2, "alles");
                // afficher type de transactions
                //System.out.println(cl1.toString());

        // ---------- Client Conversion ----------

        // Créer un convertisseur pour la classe Client
        ClientConverter convertercl = new ClientConverter();

        // Convertir l'objet Client en JSON
        String ClientToJson = convertercl.toJson(cl1);
        System.out.println("Client en JSON : " + ClientToJson);

        // Convertir le JSON en objet Client
        Client clientFromJson = convertercl.fromJson(ClientToJson);
        System.out.println("Client depuis JSON : " + clientFromJson);

        // ---------- Compte Conversion ----------

        // Créer un convertisseur pour la classe Compte
        CompteConverter convertercp = new CompteConverter();

        // Convertir l'objet Compte en JSON
        String CompteToJson = convertercp.toJson(cpt1);
        System.out.println("Compte en JSON : " + CompteToJson);

        // Convertir le JSON en objet Compte
        Compte compteFromJson = convertercp.fromJson(CompteToJson);
        System.out.println("Compte depuis JSON : " + compteFromJson);

        // ---------- Transaction Conversion ----------

        // Créer un convertisseur pour la classe Transaction
        TransactionConverter convertertr = new TransactionConverter();

        // Convertir l'objet Transaction en JSON
        String TransactionToJson = convertertr.toJson(tr2);
        System.out.println("Transaction en JSON : " + TransactionToJson);

        // Convertir le JSON en objet Transaction
        Transaction TransactionFromJson = convertertr.fromJson(TransactionToJson);
        System.out.println("Transaction depuis JSON : " + TransactionFromJson);


    }
}