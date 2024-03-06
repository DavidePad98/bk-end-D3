package esercizio3;

public class Cliente {
public int codiceCliente;
public String NomeCognome;
public String email;
public int dataRegistrazione;


    public Cliente(int codiceCliente, String NomeCognome, String email, int dataRegistrazione){
        this.codiceCliente = codiceCliente;
        this.NomeCognome = NomeCognome;
        this.email= email;
        this.dataRegistrazione= dataRegistrazione;


}
    @Override
    public String toString() {
        return "cliente{" +
                "codiceCliente=" + codiceCliente +
                ", NomeCognome='" + NomeCognome + '\'' +
                ", email='" + email + '\'' +
                ", dataRegistrazione=" + dataRegistrazione +
                '}';
    }


}
