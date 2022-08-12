/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum15;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Praktikum15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        String i;
        
        Scanner scanx = new Scanner (System.in);
        System.out.println("Input jarak (km) : ");
        x = scanx.nextInt();

        Scanner scany = new Scanner (System.in);
        System.out.println("Input berat (kg) : ");
        y= scany.nextInt();

        System.out.println("Dangerous cargo (Y/N) : ");
        Scanner scani = new Scanner (System.in);
        i= scani.nextLine();

        if(i.equalsIgnoreCase("Y")){
            if (x<51){
                if (y<11){
                 System.out.println("Ongkos Pengiriman : USD 50 ");
             }
                else if(y>10 && y<21){
                 System.out.println("Ongkos Pengiriman : USD 100 ");
             }
                else System.out.println("Ongkos Pengiriman : USD 150 "); 

             }
            else if (x>50 && x<101){
                if (y<11){
                 System.out.println("Ongkos Pengiriman : USD 60 ");
             }
                else if(y>10 && y<21){
                 System.out.println("Ongkos Pengiriman : USD 115 ");
             }
                else System.out.println("Ongkos Pengiriman : USD 175 "); 
             }
            else {
                if (y<11){
                 System.out.println("Ongkos Pengiriman : USD 80 ");
             }
                else if(y>10 && y<21){
                 System.out.println("Ongkos Pengiriman : USD 140 ");
             }
                else System.out.println("Ongkos Pengiriman : USD 200 "); 

             }
        } 
        else if (x<51){
            if (y<11){
                 System.out.println("Ongkos Pengiriman : USD 30 ");
             }
            else if(y>10 && y<21){
                 System.out.println("Ongkos Pengiriman : USD 60 ");
             }
            else System.out.println("Ongkos Pengiriman : USD 90 "); 

             }
        else if (x>50 && x<101){
            if (y<11){
                 System.out.println("Ongkos Pengiriman : USD 40 ");
             }
            else if(y>10 && y<21){
                 System.out.println("Ongkos Pengiriman : USD 75 ");
             }
            else System.out.println("Ongkos Pengiriman : USD 130 "); 
             }
        else {
            if (y<11){
                 System.out.println("Ongkos Pengiriman : USD 50 ");
             }
            else if(y>10 && y<21){
                 System.out.println("Ongkos Pengiriman : USD 100 ");
             }
            else System.out.println("Ongkos Pengiriman : USD 150 "); 
             }
    }
}
    

