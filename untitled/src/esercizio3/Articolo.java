package esercizio3;

public class Articolo {

        public int codiceArt;
        public String description;
        public int price;
        public int storage;
        public Articolo(int codiceArt, String description, int price, int storage){
            this.codiceArt= codiceArt;
            this.description=description;
            this.price=price;
            this.storage=storage;
        }

    @Override
    public String toString() {
        return "es3{" +
                "codiceArt=" + codiceArt +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
