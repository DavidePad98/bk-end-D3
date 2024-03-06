package esercizio1;

public class es1 {

    public int altezza;
    public int larghezza;
    public es1(int altezza, int larghezza){
     this.altezza=altezza;
     this.larghezza=larghezza;
    }
    public void perEarea(){
        System.out.println("Questa è l'area del rettangolo: " + (this.altezza * this.larghezza));
        System.out.println("Questo è il perimetro: " + ((this.altezza * this.larghezza) *2 ));

    }
    public static void retX2(es1 rettangolo1, es1 rettangolo2 ){
        new es1(rettangolo1.altezza, rettangolo1.larghezza).perEarea();
        new es1(rettangolo2.altezza, rettangolo2.larghezza).perEarea();
    }

    @Override
    public String toString() {
        return "es1{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                '}';
    }
}
