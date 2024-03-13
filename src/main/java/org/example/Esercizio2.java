package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Esercizio2 {

    public static void run(int numero, Scanner scanner) {
        ArrayList<Integer> listaPrincipale = new ArrayList<Integer>();

        for (int i = 0; i < numero; i++) {
            Integer newInt = i+1;
            listaPrincipale.add(newInt);
        }

        System.out.println("Prima lista: ");
        for (int i = 0; i < listaPrincipale.size(); i++) {
        System.out.println(listaPrincipale.get(i));
        }
        System.out.println("Seconda lista: ");

        ArrayList<Integer> secondaLista = new ArrayList<Integer>();

        secondaLista = reversa(listaPrincipale);
        for (Integer integer : secondaLista) {
            System.out.println(integer);
        }

        System.out.println("Inserisci 'VERO' o 'FALSO' (VERO = PARI, FALSO = DISPARI): ");


        String risposta = scanner.next();
        boolean pari = false;

        if(Objects.equals(risposta, "VERO")){
            pari = true;
        }

        System.out.println("Hai scelto: " + risposta);
        for (int u = 0; u < secondaLista.size(); u++) {
            if (pari) {
                if (secondaLista.get(u) % 2 == 0) {
                    System.out.println(secondaLista.get(u));
                }
            } else  {
                if (secondaLista.get(u) % 2!= 0) {
                    System.out.println(secondaLista.get(u));
            }
            }
        }
    }

    private static ArrayList<Integer> reversa(ArrayList<Integer> target) {
        ArrayList<Integer> ritorno = new ArrayList<Integer>();

        for (int i = 0; i < target.size(); i++) {
            ritorno.add(target.get(i));
        }

        for (int j = target.size()-1; j >=0; j--) {
            ritorno.add(target.get(j));
        }

        return ritorno;
    }
}
