package exercicios;


import java.util.Scanner;
//package exercicios;
final class exer3{
    private double pi;
   private final double raio;
   public double area;
   public double r;
    public exer3(double raio) {
    this.raio= raio;
    getArea();
    }

    public double Circulo(){
        return area;
    }
    public double getArea(){
        pi=3.14;
    area = pi *Math.pow(raio,2);
    return area;
    }
public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);
 int r;
 r = ler.nextInt();
exer3 obj = new exer3(r);
        System.out.println(obj.Circulo());


}
}