/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum18;

import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class Praktikum18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //soal 1
        System.out.println("Soal 1 Fibonacci Prima");
        int x,j,w=0,c=0,jumlah =0;
        boolean u;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nilai n");
        x=input.nextInt();
  
         while (c<x){
        j=fibonacci(w);
        u=ujiprima(j);
        if(u==true){
            c++;
        jumlah=jumlah+j;
        }
        w++;
        }
        System.out.println(jumlah);
        
        //soal 2
        System.out.println("Soal 2 Fibonacci Angka Belakang K");
        int n,k,nilai,fibo=0,counter=0,hasil=0;
        System.out.println("Masukkan nilai n = ");
        n=input.nextInt();
        System.out.println("Masukkan nilai k = ");
        k=input.nextInt();
        
        while (counter<n){
        nilai=fibonacci(fibo);
        if(nilai%10==k){
        hasil+=nilai;
        counter+=1;
        }
        fibo++;
        }
        System.out.println(hasil);
        
        //soal 3 
        System.out.println("Soal 2 Fibonacci urut");
        int nil,hasilfibo;
        System.out.print("masukkan nilai n = ");
        nil=input.nextInt();
        for (int i=nil-1; i>=0; i--){
        System.out.print(fibonacci(i)+" ");
        }
    }
public static int fibonacci(int n){
        int result;
    if (n==0)
        return (0);
    else if (n==1)
        return (1);
    else {
        result=fibonacci(n-1)+fibonacci(n-2);
        return result;
    }
}
public static boolean ujiprima (int a){
        int c=0; int g=0;
        for (int h=1; h<=a; h++)
            if(a%h==0){
                c++;
            }
        if (c==2)
   return true;
        else
   return false;
    }
}
