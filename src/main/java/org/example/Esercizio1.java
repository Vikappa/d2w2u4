package org.example;

import java.util.*;

public class Esercizio1 {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int nParole = 0;
        while (true) {
            System.out.println("Inserisci un intero");
            if (scanner.hasNextInt()) {
                nParole = scanner.nextInt();
                scanner.nextLine(); // Consuma la newline
                System.out.println("Il numero inserito è " + nParole);
            } else {
                System.out.println("Il numero inserito non è valido");
                scanner.next(); // Importante: consuma l'input errato per prevenire un ciclo infinito
            }
            Set<String> parole = new HashSet<String>();
            ArrayList<String> paroleDuplicate = new ArrayList<String>();

            for (int i = 0; i < nParole; i++) {
                System.out.println("Inserisci una parola");
                String parola = scanner.nextLine();
                if(!parole.add(parola)){
                    paroleDuplicate.add(parola);
                }
            }

            System.out.println("Numero parole uniche: " + parole.size());
            System.out.println("Parole uniche: " + parole);
            System.out.println("Parole duplicate: " + paroleDuplicate);
        }
    }

}
