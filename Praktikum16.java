/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum16;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Praktikum16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int counter = 0;
        int z=0;
        System.out.print("Masukkan panjang array"+"  ");
        Scanner input = new Scanner (System.in);
        x = input.nextInt();
        int [] y;
        y = new int [x];
        for (int i=0; i<x; i++){
            System.out.print("Masukkan array["+i+"]: ");
                    y[i] =input.nextInt();        
        }
        int k;
        System.out.print("Masukkan nilai k:" );
        k = input.nextInt();
        
        for (int i=0; i<x-1; i++){
            for (int j=i+1; j<x; j++){
                z=y[i]-y[j];
                if (z==k){
                    counter +=1;
                }
                if (z==-k){
                    counter+=1;
                }
            }
        }
        System.out.println("Jumlah Beda Pasang Dari Array X adalah " + counter);
    }
} 
    

