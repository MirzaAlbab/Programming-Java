/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro.materi.pkg4.pkg7112019;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class AlproMateri47112019 {
static int clock;
//letak variable global
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n;
        n=10;
        System.out.println("nilai n di main program =" +n);
        contoh (n);
        System.out.println("nilai n keluar dari function =" +n);*/
        //variable lokal
        
        /*int a,b;
        a=10;
        b=5;
        tukar(a,b);
        System.out.println("a="+a+" b="+b);*/
        
        /*int []z={1,2,3,4,5};
        contoh2(z);
        System.out.println("niali z[0]="+ z[0]);*/
        
        /*clock=12;
        System.out.println("clock="+clock);
        ubahJam();
        ubahJam();
        ubahJam();
        System.out.println("clock="+clock);*/
        //clock merupakan variable global karena dapat diakses oleh main maupun funtion
        //letaknya diatas main program
        
        /*int [] z={1,2,3,4,5};
        displayA(z,4);
        System.out.println("\n");
        displayB(z,4);
        System.out.println("\n");*/
        
        Myarray x,y;
        x = new Myarray(5);
        y = new Myarray(10);
        x.display();
        y.display();
        
        x.set(2, 25);
        x.set(0,10);
        x.display();
        
        for (int i=0; i<5; i++){
            x.set(i,i*2+1);
        }
        x.display();
        
        System.out.println("Jumlah isi array ="+ x.sum());
        
                
    }
    public static void displayA (int []x,int n){
        if(n>=0){
            System.out.print(x[n]);
            displayA(x,n-1);
        }
    }
    public static void displayB (int []x,int n){
        if(n>=0){
            displayB(x,n-1);
            System.out.print(x[n]);
        }   
    }
    public static void ubahJam(){
        clock++;
    }
    public static void contoh2 (int [] x){
        x[0]=x[1]+x[2];
    
    }
    public static void tukar (int x,int y){
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("x="+x+" y="+y);
        
    }
    
    public static void contoh (int n){
        System.out.println("nilai n masuk function =" +n);
        n=3*n;
        System.out.println("nilai n keluar function =" +n);
        
    }
}
