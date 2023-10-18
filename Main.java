package project;
import java.util.Scanner;
public class Main {
    static int carikecil(int bil1,int bil2)
    
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
       int bil1,bil2,FPB=0,i,kecil;
        System.out.println("FAKTOR PERSEKUTUAN TERBESAR") ;
        System.out.println("___________________________");
        System.out.println("input bilangan pertama:");
        bil1= input.nextInt();
        System.out.println("input bilangan kedua:");
        bil2= input.nextInt();
        System.out.println();
        if(bil1<bil2)
           kecil=bil1;
        
        i=kecil;
        while(FPB==0)
        {
            if((bil1 % i==0) && (bil2 % i==0))
            FPB = i;
            i--;
            
        }
        System.out.println("FPB"+bil1+"dan"+bil2+"adalah"+FPB);
    }
}