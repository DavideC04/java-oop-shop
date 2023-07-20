package org.lessons.java.shop;

/*
Nello stesso package aggiungete una classe Main con metodo main nella quale create uno o più prodotti
e testate tutte le funzionalità della classe (cioè tutti i metodi public)
 */
public class Main {
    public static void main(String[] args) {

        // creazione prodotti
        Prodotto prodotto1 = new Prodotto("Cappello", "estivo di paglia", 25.0, 0.22);
        Prodotto prodotto2 = new Prodotto("Bracciale", "acciaio con ciondolo", 50.0, 0.22);

        // stampo su console le funzionalità
        // prodotto numero 1
        System.out.println("Prodotto numero 1: ");
        System.out.println("Codice prodotto: " + prodotto1.getCodice());
        System.out.println("Nome prodotto: " + prodotto1.getNome());
        System.out.println("Descrizione prodotto: " + prodotto1.getDescrizione());
        System.out.println("Prezzo prodotto: €" + prodotto1.prezzoBase());
        System.out.println("Prezzo con IVA: €" + prodotto1.prezzoIva());
        System.out.println("Nome esteso prodotto: " + prodotto1.toString());

        // prodotto numero 2
        System.out.println("\n Prodotto numero 2: ");
        System.out.println("Codice prodotto: " + prodotto2.getCodice());
        System.out.println("Nome prodotto: " + prodotto2.getNome());
        System.out.println("Descrizione prodotto: " + prodotto2.getDescrizione());
        System.out.println("Prezzo prodotto: €" + prodotto2.prezzoBase());
        System.out.println("Prezzo con IVA: €" + prodotto2.prezzoIva());
        System.out.println("Nome esteso prodotto: " + prodotto2.toString());

        // modifico i valori di uno dei due prodotti
        prodotto2.setNome("Collana");
        prodotto2.setDescrizione("Oro");
        prodotto2.setPrezzo(70);
        prodotto2.setIva(0.20);

        // stampo su console i valori modificati
        System.out.println("\n Prodotto numero 2 modificato:");
        System.out.println("Codice prodotto: " + prodotto2.getCodice());
        System.out.println("Nome prodotto: " + prodotto2.getNome());
        System.out.println("Descrizione prodotto: " + prodotto2.getDescrizione());
        System.out.println("Prezzo prodotto: €" + prodotto2.prezzoBase());
        System.out.println("Prezzo con IVA: €" + prodotto2.prezzoIva());
        System.out.println("Nome esteso prodotto: " + prodotto2.toString());
    }
}
