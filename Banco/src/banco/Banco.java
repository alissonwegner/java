package banco;

public class Banco {

    Integer IdBanco;
    String Nome;
    String Endereço;

    void status() {
        System.out.println("NOME: " + this.Nome);
        System.out.println("Endereço: " + this.Endereço);
        System.out.println("Codigo: " + this.IdBanco);

    }

}
