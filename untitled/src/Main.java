import esercizio1.es1;
import esercizio2.es2;
import esercizio3.Articolo;
import esercizio3.Carrello;
import esercizio3.Cliente;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        new es1(20,40).perEarea();
        retX2(new es1(20,40), new es1(40,50));




//------------------------------------------------------------------

        es2 sim1 = new es2(345345345);
        sim1.sim();
//------------------------------------------------------------------

        Articolo art1 = new Articolo(21312, "banane", 3, 300 );
        Cliente cliente1 = new Cliente(1, "Davi", "fsdg@asfs.vom", 12);
        Carrello cart = new Carrello(cliente1);
        System.out.println(cart);
        System.out.println(art1);
    }
}