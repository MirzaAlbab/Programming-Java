/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.function;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ArrayFunction {
    static int jumlahbeda(int input, int input2){
        int z;
        z= input-input2;
        return z;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int counter = 0;
        int z;
        System.out.print("Masukkan panjang array="+"  ");
        Scanner input = new Scanner (System.in);
        x = input.nextInt();
        
        int [] y;
        y = new int [x];
        for (int i=0; i<x; i++){
            System.out.print("Masukkan array : ");
                    y[i] =input.nextInt();
        }
        int k;
        System.out.print("Masukkan nilai k : " );
        k = input.nextInt();
        
        for (int i=0; i<x; i++){
            for (int j=0; j<x; j++){
               z = jumlahbeda(y[i],y[j]);
               if (z==k){
                   counter=counter+1;
               }
    }
        }
        System.out.print("Jumlah Beda Pasang Dari Array x adalah " + counter);
    }}