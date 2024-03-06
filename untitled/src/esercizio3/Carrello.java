package esercizio3;

import java.util.Arrays;

public class Carrello {
    public Cliente cliente;
    public Articolo[] articoli;
    public int totale;
    public Carrello(Cliente cliente){
        this.cliente= cliente;
        this.articoli= articoli;
        this.totale= 100;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", articoli=" + Arrays.toString(articoli) +
                ", totale=" + totale +
                '}';
    }
}
