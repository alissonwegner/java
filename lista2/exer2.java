/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author alisson
 */
class exer2 {
        private String nome;
    private double salario;
    private int id;
    private static int nextId;

    public exer2(String n, double s) {
        this.nome = n;
        this.salario = s;
        setId();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        int i, x = 0, sal, n;
     String nn;
         Scanner ler = new Scanner(System.in);
         System.out.printfln("quantos empregados voce quer insesir?");
         i = ler.nextInt();
        exer2[] e;
            e = new exer2[i];
        exer2[] staff = new exer2[i];
        while(x < i){
            System.out.println("Nome do empregado");
            nn = ler.next();
            System.out.println("Salario");
            sal = ler.nextInt();
        e[x]= new exer2("joao", 200 );
        
    }
     
         for(exer2 e :staff){
   n= exer2.getNextId();
             System.out.println(e[i].getNome() + " " + e[i].getSalario()+" id= "+e[i].getId());
             System.out.println("proximo id disponivel"+n);

}

    }

}
