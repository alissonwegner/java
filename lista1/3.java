//Escreva um programa que calcule o fatorial de um determinado
//número informado pelo usuário.
package lista1;
import java.util.Scanner;
public class exer7 {
}
public static void main(String [] args)
{
int a, t;
Scanner ler = new Scanner(System.in);
System.out.println("informe o valor");
a = ler.nextInt();
t=1;
while(a>0){
t= a * t;
a--;
}
System.out.println("fatorial é : " + t);
}
