package exercicios;

import java.util.Scanner;
public class Recibo {
     public String npeca;
    public String dpeca;
    public int qitem;
    public double preco;
    public double total;


public Recibo(){}
    public Recibo(String npeca, String dpeca, int qitem, double preco){
        this.dpeca =dpeca;
        this.npeca= npeca;
        this.qitem = qitem;
        this.preco = preco;
        
    }
       public double VCobrado(){
        if(qitem > 0 && preco > 0){
            total = qitem * preco;
            return total;
        }
        return 0;
    }
    public double getvalor() {
        return this.preco;
    }
    public String getnpeca() {
        return this.npeca;
    }
    public int getqitem() {
        return this.qitem;
    }
    public String getdpeca() {
        return dpeca;
    }



        public static void main(String[] args) {
           Scanner ler = new Scanner(System.in);
String dpeca = null;
String npeca = null;
int qitem = 0; 
double preco = 0;
double valorf = 0;
                    System.out.println("qual nome da peca?");
                    npeca = ler.next();
                    System.out.println("qual descrição?");
                    dpeca = ler.next();
                    System.out.println("qual a quantidade?");
                    qitem = ler.nextInt();
                    System.out.println("qual o preço?");
                    preco = ler.nextDouble();
                    Recibo obj = new Recibo(npeca, dpeca, qitem, preco);
                    valorf = obj.VCobrado();
                    
                    System.out.println("Produto "+obj.npeca+" descrição:"+obj.dpeca+" quantidade: "+obj.qitem+" valor da unidade "+obj.preco);
                    System.out.println("valor total do recibo é: "+valorf);
                    

        }

}

