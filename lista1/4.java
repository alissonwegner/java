//Implemente um programa em JAVA que leia 5 números e conte o
//número de positivos e negativos inseridos pelo usuário e ainda calcule
//a média aritmética entre os números positivos.
import java.util.Scanner;
public class exer8 {
public static void main(String [] args)
{
int val1, val2, num, aux;
Scanner ler = new Scanner(System.in);
System.out.println("informe o valor 1");val1 = ler.nextInt();
System.out.println("informe o valor 2");
val2 = ler.nextInt();
if(val1 < val2){
num = val2-val1;
}else{
num = val1-val2;
aux = val2;
val2 = val1;
val1 = aux;
}
val1++;
aux = val1;
num = num -2;
while(num > 0){
aux++;
val1 = val1 + aux;
num--;
}
System.out.println("valor é : " + val1);
}
}
