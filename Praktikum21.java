/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum21;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Praktikum21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int display;
        MyArray g;
        int kiri;
        int kiri2;
        int kanan;
        int kanan2;
        int delete;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Panjang Array" );
        display=input.nextInt();
        g = new MyArray (display);
        
        int [] n; 
        n=new int [display];
        for (int i=0; i<display; i++){
            System.out.print("Masukkan Array x["+i+"] ");
            n[i]= input.nextInt();
            g.set(i,n[i]);
        }
        
        System.out.print("Masukkan ShiftLeft= ");
        kiri= input.nextInt();
        g.shiftLeft(kiri);
        g.display();
        g.array();
        
        System.out.println();
        System.out.print("Masukkan ShiftRight= ");
        kanan= input.nextInt();
        g.shiftRight(kanan);
        g.display();
        g.array();
        
        System.out.println();
        System.out.print("Masukkan Rotate left= ");
        kiri2= input.nextInt();
        g.Rotateleft(kiri2);
        g.display();
        g.array();
        
        System.out.println();
        System.out.print("Masukkan Rotate right= ");
        kanan2= input.nextInt();
        g.rotateRight(kanan2);
        g.display();
        System.out.println();

        int [] x; 
        x=new int [display];
        for (int i=0; i<display; i++){
            System.out.print("Masukkan Array x["+i+"] ");
            n[i]= input.nextInt();
            g.set(i,n[i]);
        }
        g.deleteDuplicate();
    }
    
}
