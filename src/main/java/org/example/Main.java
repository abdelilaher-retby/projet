package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Banque cih= new Banque(12,"maroc");
      Client cl1= new Client("er-retby","tlouh","abdelilaherretby@gmail.com","0655443322","abdelilah");
      Client cl2 = new Client("sayed","ben geurir","ahmedsayed@gmail.com","0665444422","ahmed");
      Compte cpt1=CompteService.creerCompte(cl1,cih,"MAD");
      Compte cpt2=CompteService.creerCompte(cl2,cih,"MAD");
      TransactionService.effectuerTransaction(cpt1,cpt2,"geneve");
        System.out.println(cl2.getComptes());



    }
}