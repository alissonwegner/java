//Desenvolva um programa que calcule as raízes de uma equação de
//segundo grau (Ex.: ax2
//+bx+c). O usuário deverá informar os valores
//de a, b e c.
import java.util.Scanner;
{
public class exer5 {
public static void main(String [] args)
float media, media2, mediafinal;
int a, b, c , delta, d = -4, b2, v2;
double r2,r1;
Scanner ler = new Scanner(System.in);
System.out.println("informe o valor de A");
a = ler.nextInt();
System.out.println("informe o valor de B");
b = ler.nextInt();
System.out.println("informe o valor de C");
c = ler.nextInt();b2 = b*b;
v2 = ((-4)*(a)*(c));
delta = (b*b)+((-4)*(a)*(c));.
System.out.println("Resultados das raízes: ");
if (delta < 0){
System.out.println("Não existe raíz real, Delta=0");
}
else {
r1 = (-b + Math.sqrt(delta)) / (2*a);
System.out.println("A 1o raíz é: " + r1);
r2 = (-b - Math.sqrt(delta)) / (2*a);
System.out.println("A 2o raíz é: " + r2);
}
}
}
