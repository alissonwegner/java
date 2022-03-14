package banco;

import java.util.Scanner;

public class Cliente {

    String nome;
    String endereco;
    String telefone;
    int noconta;
    int nestId;
    int saldo;
    int nextId = 1;
    int temp;
    String usuario;
    String senha;

    public Cliente() {
    }

    public Cliente(String nome, String endereço, String telefone, String usuario, String senha, int x) {

        this.nome = nome;
        this.endereco = endereço;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.noconta = setId(x);
        this.saldo = 100;

    }

    Scanner ler = new Scanner(System.in);

    public int setId(int x) {

        noconta = x + 1;
        return noconta;

    }

    public int depositar(int temp) {

        this.saldo = this.saldo + temp;
        return saldo;

    }

    public int sacar(int temp) {
        if (this.saldo < temp) {
            System.out.println("voce não pode sacar valor maior que " + saldo);

        } else {
            saldo = saldo - temp;
        }
        System.out.println("\n O valor na sua conta é de : " + saldo);
        return saldo;

    }

    public int getsaldo() {
        return this.saldo;
    }

    public int emprestimo(int temp) {
        this.saldo = this.saldo + temp;
        return saldo;

    }

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println(" endereço: " + this.endereco);
        System.out.println(" telefone: " + this.telefone);
        System.out.println("usuario: " + this.usuario);
        System.out.println(" saldo: R$" + this.saldo);
        System.out.println(" id:" + this.noconta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getNoconta() {
        return noconta;
    }

    public void setNoconta(int noconta) {
        this.noconta = noconta;
    }

    public int getNestId() {
        return nestId;
    }

    public void setNestId(int nestId) {
        this.nestId = nestId;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNextId() {
        return nextId;
    }

    public void setNextId(int nextId) {
        this.nextId = nextId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    void saldo(int temp) {
        
    }

    void deposita(int temp) {
    }

}
