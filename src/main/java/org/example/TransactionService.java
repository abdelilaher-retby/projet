package org.example;

public class TransactionService {

    public static void effectuerTransaction(Compte compteSource, Compte compteDestination, String reference) {
        Transaction.Type type;

        // Vérification si les comptes sont dans la même banque
        if (compteSource.getBanque().getId() == compteDestination.getBanque().getId()) {
            // Vérification si les comptes sont dans le même pays
            if (compteSource.getBanque().getPays().equals(compteDestination.getBanque().getPays())) {
                type = Transaction.Type.VIRIN;  // Même banque et même pays
            } else {
                type = Transaction.Type.VIRMULTA; // Même banque mais pays différents
            }
        } else {
            // Vérification si les comptes sont dans des banques et pays différents
            if (!compteSource.getBanque().getPays().equals(compteDestination.getBanque().getPays())) {
                type = Transaction.Type.VIRCHA; // Banques et pays différents
            } else {
                type = Transaction.Type.VIREST; // Banques différentes mais même pays
            }
        }

        Transaction transaction=new Transaction(compteSource, compteDestination, reference,  type);
        compteSource.getTransactions().add(transaction);
        compteDestination.getTransactions().add(transaction);
    }
}
