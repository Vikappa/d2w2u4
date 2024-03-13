package org.example;

import java.util.ArrayList;

public class Esercizio3 {
    private ArrayList<Contatto> arrayContatti;

    public Esercizio3(ArrayList<Contatto> arrayContatti) {
        this.arrayContatti = arrayContatti;
    }

    public void addContatto(String name, long number){
        this.arrayContatti.add(new Contatto (name, number));
}

public void delecontatto(String name) {

    for (Contatto contatto : this.arrayContatti) {
        if (contatto.getNome().equals(name)) {
            this.arrayContatti.remove(contatto);
            break;
        }
    }

}

public Contatto searc(String name) {
    for (Contatto contatto : this.arrayContatti) {
        if (contatto.getNome().equals(name)) {
            return contatto;
        }
    }
    return null;
}

public void printAll(){
        for (Contatto contatto : this.arrayContatti) {
            System.out.println(contatto.toString());
        }
}


}
