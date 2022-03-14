/*. Escreva um programa que calcule e apresente os 20 primeiros
termos da sequência de Fibonacci. Esta sequência tem como
primeiros termos os números 0 e 1, e a seguir, cada termo
subsequente é obtido pela soma dos dois termos predecessores.
Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
*/
public class exer
{
public static void main(String [] args){
int fib, fib2, cont;
fib =0;
fib2 =1;
for(cont=0;cont<20;cont++){
System.out.println(fib);
System.out.println(fib2);
fib= fib+fib2;
fib2= fib+fib2;
}
}
}
