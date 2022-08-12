/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum19;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Praktikum19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,n,z;    
        System.out.print("Masukkan Panjang Array"+"  ");
        Scanner input = new Scanner (System.in);
        x = input.nextInt();
        
        int [] y;
        y = new int [x];
        for (int i=0; i<x; i++){
            System.out.print("Array x["+i+"]= ");
            y[i] =input.nextInt();
        }
        //soal 1
        System.out.println("Soal 1 Array Urut dari belakang");
        arrayofinteger1(y,x);
        //soal 2
        System.out.println("Soal 2 Array Urut dari depan");
        arrayofinteger2(y,x);
        //soal 3
        System.out.println();
        System.out.println("Soal 3 Array Terbesar");
        z=terbesar(y,x-1);
        System.out.println(z);
}
    public static void arrayofinteger1(int [] y,int n){
    if (n==0)
        System.out.println();
    else{
        System.out.print(y[n-1]+"  ");
        arrayofinteger1(y,n-1);
    }
    }
    public static void arrayofinteger2(int []y,int n){
    if (n>0){
        arrayofinteger2(y,n-1);
        System.out.print(y[n-1]+"  ");
    }
    
}
   public static int terbesar (int [] y, int n){
        if (n==0){return y[n];
        }
        else if (y[n]>terbesar(y,n-1)){
        return y[n];
    }
            return terbesar(y,n-1);
}
    }
    

