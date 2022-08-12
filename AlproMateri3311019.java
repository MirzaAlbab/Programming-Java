/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro.materi.pkg3.pkg311019;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class AlproMateri3311019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int [] x; int n;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Panjang Array");
        n=input.nextInt();
        x = new int [n];
        
        for (int i=0; i<n; i++){
            System.out.println("Masukkan Array");
            x[i]= input.nextInt();
        }*/
        int n, z;
        Scanner input = new Scanner (System.in);
        n= sumofdigit(120);
        z= maxdigit(295);
        System.out.println(n);
        System.out.println(z);
            
                
        
    }
    public static int sumofdigit(int n){
        int z=0 ;int x;
        while (n>0){
        x=n%10;
        n=n/10;
        z = z + x;
        }
        return z;
    }
    
    public static int maxdigit(int n){
        int z=0 ;int x;
        while (n>0){
        x=n%10;
        n=n/10;
         if (z<x)
         z=x;
    }
        return z;
    }
    
    public static int sortdigit(int n){
        int [] z; int x; int f=10;
        int i=0; int c=0;
        while (n>0){
        x=n%10;
        n=n/10;
        c=c+1;
        z= new int [i];
        z[i]=x;
        i=i+1;
    }
        for (int y=0; y<i; y++)
        return z[y];
                
                
    }
}