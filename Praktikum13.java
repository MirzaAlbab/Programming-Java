/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum13;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Praktikum13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //soal1
        System.out.println("Soal 1 Ulang Tahun");
        int x, hasil;
        System.out.println("masukkan tahun lahir = ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        hasil = 2019 - x;
        System.out.println("selamat ulang tahun");
        System.out.println("ke-" + hasil);
        System.out.println("semoga sukses selalu");    
        
        //soal 2
        System.out.println("Soal 2 Luas Keliling Persegi");
        int panjang,lebar,kelilingpersegi,luaspersegi;
        System.out.println("masukkan panjang = ");
        panjang=scan.nextInt();
        System.out.println("masukkan lebar = ");
        lebar=scan.nextInt();
        kelilingpersegi=2*(panjang+lebar);
        luaspersegi=panjang*lebar;
        System.out.println("Keliling = " + kelilingpersegi);
        System.out.println("Luas = " + luaspersegi);
        
        //soal 3
        System.out.println("Soal 3 Keliling dan Luas Lingkaran");
        double phi = 3.14, r, keliling, luas;
        System.out.println("Jari-jari:");
        r = scan.nextInt ();
        keliling = 2 * phi * r;
        luas = phi * r *r;
        System.out.println("keliling=" + keliling);
        System.out.println("luas =" + luas);
    }
    
}
