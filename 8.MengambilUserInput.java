
package pkg8.mengambiluserinput;
import java.util.Scanner;

public class MengambilUserInput {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Menghitung Luas");
        System.out.print("Masukkan Panjang = ");
        int panjang = Input.nextInt();
        System.out.print("Masukkan Lebar = ");
        int lebar = Input.nextInt();
        
        int luas=panjang*lebar;
        System.out.println("Luas = "+luas);
        
        System.out.println("Menghitung Volume ");
        System.out.print("Masukkan Tinggi = ");
        int Tinggi = Input.nextInt();
        
        int volume=luas*Tinggi;
        System.out.println("Volume = "+volume);
        
        //Membuat sebuah objek untuk menangkap input dari User
        Scanner Inputuser = new Scanner(System.in);
        //program sederhana untuk menebak sebuah angka
        int nilaibenar=6;
        int nilaiTebakan;
        boolean statustebakan;
        System.out.print("masukkan nilai tebakan anda = ");
        nilaiTebakan=Inputuser.nextInt();
        System.out.println("Nilai tebakan anda adalah = "+ nilaiTebakan);
        
        //operasi logika
        statustebakan=(nilaiTebakan==nilaibenar);
        System.out.println("tebakan anda = "+statustebakan);
        
        //operasi aljabar and or
        System.out.print("masukkan nilai antara 4 dan 9 = ");
        nilaiTebakan=Inputuser.nextInt();
        statustebakan=(nilaiTebakan > 4) && (nilaiTebakan < 9);
        System.out.println("tebakan anda "+ statustebakan);
        
        System.out.print("masukkan nilai antara 10 dan 1000 = ");
        nilaiTebakan=Inputuser.nextInt();
        statustebakan=(nilaiTebakan > 10) || (nilaiTebakan > 1000);
        System.out.println("tebakan anda "+ statustebakan);
        
        
                
        
        
    }
    
}
