package org.lessons.java.shop;

/*
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
- Il codice prodotto sia accessibile solo in lettura
- Gli altri attributi siano accessibili sia in lettura che in scrittura
- Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
- Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome: il codice deve avere un pad left di zeri per arrivare a 8 caratteri
 (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
 */

import java.util.Random;

public class Prodotto {
    // CAMPI
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;


    // COSTRUTTORI

    public Prodotto( String nome, String descrizione, double prezzo, double iva) {
        this.codice = randomNumber();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    // GETTER E SETTER

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
// METODI

    private int randomNumber() {
        Random random = new Random();
        return random.nextInt(10000000, 100000000);
    }
    public double prezzoBase() {
        return prezzo;
    }

    public double prezzoIva() {
        return prezzo + (prezzo * iva);
    }

    @Override
    public String toString() {
        return codice + "-" + nome;
    }
}
