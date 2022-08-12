/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum20;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Praktikum20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int display;
        MyArray g;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Panjang Array = " );
        display=input.nextInt();
        
        g = new MyArray(display);
        g.display();
        System.out.println();
        
        int [] n; 
        n=new int [display];
        for (int i=0; i<display; i++){
            System.out.print("Masukkan Array x["+i+"] ");
            n[i]= input.nextInt();
            g.set(i,n[i]);
        }
        g.display();
        System.out.println();
        
        int data;
        System.out.println("Masukkan Index Data yang ingin dilihat");
        data=input.nextInt();
        System.out.print("Indeks "+data+" adalah " + g.get(data));
        System.out.println();
        
        System.out.print("Jumlah semua data "+ g.sum());
        System.out.println();
        
        System.out.print("Ratarata "+ g.average());
        System.out.println();
        
        System.out.print("Variansi "+ g.varians());
        System.out.println();
        
        System.out.print("Bilangan Max "+ g.max());
        System.out.println();
        
        System.out.print("Bilangan Min "+ g.min());
        System.out.println();
        
        System.out.print("Range "+ g.range());
        System.out.println();
        
        System.out.print("Modus "+ g.modus());
        //g.modus();
        System.out.println();   
    }
}
    

