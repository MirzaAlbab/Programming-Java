/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum17;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Praktikum17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //soal1
        System.out.println("Soal 1 Frekuensi Bilangan Kembar");
        int [] x;
        int frek = 0;
        x = new int [10];
        for(int a=0; a<10; a++){
        Scanner input = new Scanner (System.in);
        System.out.print("input nilai array x = ");
        x[a]=input.nextInt();
        }
        int temp=0;
        for (int i=0; i<10; i++){
            frek=0;
            for (int j=1; j<10; j++){
                if (x[i]==x[j]){
                    frek += 1;
                }
            }
            if (frek>1 && temp!=x[i]){
                temp=x[i];
                System.out.println(x[i]+ " sebanyak " + frek );
            }
        }
        
        //soal 2
        System.out.println("Soal 2 Fibonacci");
            int [] n;
        n= new int [2];
        int r;
        int z=1;
        int c;
        Scanner input = new Scanner (System.in);
        System.out.print("input x = ");
        r=input.nextInt();
        int d=0;
        int e=1;
        switch (r) {
            case 0:
                System.out.println(d);
                break;
            case 1:
                System.out.println(e);
                break;
            default:
                System.out.println(e);
                while (z<r){
                    c=d + e;
                    if (c%2!=0){
                        System.out.println(c);
                        z=z+1;
                    }
                    d=e;
                    e=c;
                }   break;
        }
    }
}
