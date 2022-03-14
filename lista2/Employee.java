/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author alisson
 */
class Employee {
        private String nome;
    private double salario;
    private int id;
    private static int nextId;

    public Employee(String n, double s) {
        nome = n;
        salario = s;
        setId();
    }

    Employee(String nome, int sal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        int i=3;
        Employee[] e = new Employee[i];
        e[0]= new Employee("Filomena", 6000);
         e[1] = new Employee("Filo", 600);
         e[2] = new Employee("joao", 1500);
        System.out.println(e[0].getNome() + " " + e[0].getSalario()+" id= "+e[0].getId());
         System.out.println(e[1].getNome() + " " + e[1].getSalario()+" id= "+e[1].getId());
         System.out.println(e[2].getNome() + " " + e[2].getSalario()+" id= "+e[2].getId());


    }

}