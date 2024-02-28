package com.fouadev.exercice2.pres;

import com.fouadev.exercice2.metier.Produit;
import com.fouadev.exercice2.metier.IMetier;
import com.fouadev.exercice2.metier.MetierProduitImpl;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        IMetier<Produit> produit = new MetierProduitImpl();

        boolean termine = true;
        while(termine) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Choisi l'operation suivant : add getById remove getAll exit");
            String operation = scanner.nextLine();

            switch (operation) {
                case "add" -> {
                    produit.add(new Produit(1, "pr1", "marq1", 245, "desc1", 10));
                    produit.add(new Produit(2, "pr2", "marq2", 2100, "desc2", 6));
                    produit.add(new Produit(3, "pr3", "marq3", 50, "desc3", 9));
                }
                case "getById" -> System.out.println(produit.findById(1));
                case "remove" -> produit.delete(1);
                case "getAll" -> System.out.println(produit.getAll());
                case "exit" -> {
                    System.out.println("Bye");
                    termine = false;
                }
                default -> {
                    System.out.println("Not found");
                    termine = false;
                }

            }
        }
    }
}
