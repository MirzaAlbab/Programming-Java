/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum14;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Praktikum14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //soal 1 Bilangan Berpola
        System.out.println("Soal 1 Bilangan Berpola");
        Scanner scan = new Scanner (System.in);
        int N;
        int x = 0;
        int y= 0;
        System.out.print("input nilai N = ");
        N = scan.nextInt();
        for (int i=1; i<N+1; i++){
            for (int j=0; j<N; j++){
                if (i%2!=0){
                x++;
                System.out.print(x+"  ");
                }
                else {
                    System.out.print(x+"  ");
                     x--;
                }        
        }  
        x=x+N;    
        System.out.println();
        }
        
        //soal 2 Konversi Nilai
        System.out.println("Soal 2 Konversi Nilai");
        int Nilai;
        int Nilaimu;
        System.out.print("input Nilai = ");
        Nilai = scan.nextInt();
        if(Nilai >80){
        System.out.println("A");
                
    }
        else if(Nilai > 65 && Nilai <81){
        System.out.println("B");
        
    }
        else if (Nilai > 55 && Nilai <66){
        System.out.println("C");
        
    }
        else if(Nilai>45 && Nilai<56){
        System.out.println("D");
        
    }
        else if(Nilai < 46){
            System.out.println("E");
                }
    }
    }
    

