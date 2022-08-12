/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpro.materi.pkg3.pkg301019;
import java.util.Scanner;

        
/**
 *
 * @author LENOVO
 */
public class AlproMateri3301019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int z;
        z = jumlah(15,100)+3*jumlah(4,jumlah(4,6));
        System.out.println("Nilai z  "+z);
        
        z=factorial(5);
        System.out.println("Nilai z  "+z);
        
        z=combination(5,3);
        System.out.println("Nilai z  "+z);*/
        
        /*int[]z ={4,7,2,9,0,3,6};
        display(z,7);
        
        boolean t;
        t=lebihkecil(4,12);
        if(lebihkecil(5,10))
            System.out.println("hoooree");
        if(t==true)
        System.out.println(1);*/
        
        /*int z;
        z=factorialrekursif(5);
        System.out.println("nilai z = "+z);*/
        
        contoh(465);
    }
     //ini adalah tempat function
    public static void contoh(int n){
        if(n>0){
            System.out.print(n%10+"  ");
            contoh(n/10);
        }
    }
    public static int factorialrekursif(int n){
        int result;
        if (n==0)
                result = 1;
        else result = n * factorialrekursif(n-1);
        
        return result;
    }
    
   
    public static int jumlah(int a, int b){
    int hasil;
    hasil = a+b;
    return(hasil);
    }
    
    public static int factorial(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result=result*i;
        }
        return (result);
    }
    public static int combination(int n, int k){
        int result;
        result = factorial(n)/(factorial (k)*factorial (n-k));
        return result;
    }
    public static boolean lebihkecil(int a,int b){
        if(a<b)
            return (true);
        else
            return (false);
    }
    public static void display (int []x, int n){
        for (int i=0; i<n; i++){
            System.out.print(x[i]+" ");
            
        }
        System.out.println();
    }
}
