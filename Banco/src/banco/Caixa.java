package banco;

import java.util.ArrayList;
import java.util.Scanner;

class Caixa {

    public int nestId;

    public static void main(String[] args) {
        int i;
        int z = 1;
        int x = 0;
        int saldo;
        int q;
        String nome;
        String endereco;
        String senha;
        String usuario;
        String endere;
        String telefone;
        Scanner ler = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList();
        Cliente obj = new Cliente();
        int temp;
        while (z != 0) {
            System.out.println("_______________O que voce deseja fazer ?_______________");
            System.out.println("1. Abrir uma conta.");
            System.out.println("2. fechar uma conta.");
            System.out.println("3. depoistar");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Emprestimo");
            System.out.println("6. Cadastra um novo banco");
            System.out.println("7. Ver informação de um cliente");
            System.out.println("0. para sair");
            z = ler.nextInt();
            switch (z) {
                case 1:
                    //Abrir uma conta
                    System.out.println("qual nome do cliente?");
                    nome = ler.next();
                    System.out.println("qual endereço");
                    endere = ler.next();
                    System.out.println("qual telefone?");
                    telefone = ler.next();
                    System.out.println("qual usuario?");
                    usuario = ler.next();
                    System.out.println("qual a senha?");
                    senha = ler.next();
                    x = x + 1;
                    System.out.println("CONTA CRIADA");
                    Cliente novocliente = new Cliente(nome, endere, telefone, usuario, senha, x);
                    clientes.add(novocliente);
                    //remove
                    for (q = 0; q < clientes.size(); q++) {
                        clientes.get(q).status();
                    }

                    break;

                case 2:
                    //fechar uma conta
                    System.out.println("qual usuario?");
                    usuario = ler.next();
                    System.out.println("qual a senha?");
                    senha = ler.next();
                    for (q = 0; q < clientes.size(); q++) {
                        if (clientes.get(q).senha.equals(senha) && clientes.get(q).usuario.equals(usuario)) {
                            clientes.remove(q);

                            // EncerrarConta();
                        }
                    }
                    break;

                case 3: {
                    //depoistar
                    System.out.println("qual usuario?");
                    usuario = ler.next();
                    System.out.println("qual a senha?");
                    senha = ler.next();
                    for (q = 0; q < clientes.size(); q++) {
                        if (clientes.get(q).senha.equals(senha) && clientes.get(q).usuario.equals(usuario)) {
                            System.out.println("qual o valor que voce deseja depositvar?");
                            temp = ler.nextInt();
                            clientes.get(q).depositar(temp);
                        }
                    }
                    break;
                }
                case 4:
                    //Sacar dinheiro
                    System.out.println("qual usuario?");
                    usuario = ler.next();
                    System.out.println("qual a senha?");
                    senha = ler.next();
                    //  System.out.println("valor temp:"+obj[0].getsaldo);
                    for (q = 0; q < clientes.size(); q++) {
                        if (clientes.get(q).senha.equals(senha) && clientes.get(q).usuario.equals(usuario)) {
                            System.out.println("qual o valor que voce deseja sacar?");
                            temp = ler.nextInt();
                            clientes.get(q).sacar(temp);
                            // clientes.get(q).status();
                        }
                    }
                    break;

                case 5:
                    //Emprestimo
                    System.out.println("qual usuario?");
                    usuario = ler.next();
                    System.out.println("qual a senha?");
                    senha = ler.next();
                    System.out.println("quanto voce deseja deseja de emprestimo");
                    temp = ler.nextInt();
                    for (q = 0; q < clientes.size(); q++) {
                        if (clientes.get(q).senha.equals(senha) && clientes.get(q).usuario.equals(usuario)) {
                            clientes.get(q).emprestimo(temp);
                        }
                    }
                    break;

                case 6:
                    //Cadastra um novo banco
                    System.out.println("quantos bancos voce quer inserir?");
                    i = ler.nextInt();
                    Banco[] bb = new Banco[i];
                    for (x = 0; x < i; x++) {
                        bb[x] = new Banco();
                        System.out.println("qual nome do banco?");
                        bb[x].Nome = ler.next();
                        System.out.println("qual o endereço?");
                        bb[x].Endereço = ler.next();
                        System.out.println("qual o codigo do banco?");
                        bb[x].IdBanco = ler.nextInt();
                    }
                    for (x = 0; x < i; x++) {
                        bb[x].status();
                    }
                    break;
                case 7:
                    //informaçãp
                    System.out.println("qual usuario?");
                    usuario = ler.next();
                    System.out.println("qual a senha?");
                    senha = ler.next();
                    for (q = 0; q < clientes.size(); q++) {
                        if (clientes.get(q).senha.equals(senha) && clientes.get(q).usuario.equals(usuario)) {

                            clientes.get(q).status();
                        } else {
                            System.out.println("Usuario não existe. ");

                        }
                    }
                    break;
                case 0:
                    System.out.println("tchau.");
                    System.exit(0);
                    break;

            }
        }
    }

}
